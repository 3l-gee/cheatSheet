package org.example.biscuit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.example.biscuits.AbstractBiscuit;
import org.example.biscuits.Recipe;
import org.example.biscuits.RecipeBook;
import org.jvnet.hyperjaxb.ejb.util.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.JAXBElement;

/**
 * Example of unmarshalling and persisting a Root
 */
public class Main extends Context
{
	private static Logger logger = LoggerFactory.getLogger(Main.class);
	public static Logger getLogger() { return logger; }

	public static final String SAMPLE_ROOT_HEADER_FILE = "src/test/samples/biscuit.xml";
	
    // Represents the unmarshalled Root.
    private RecipeBook root = null;
    public RecipeBook getRoot() { return root; }
    public void setRoot(RecipeBook root) { this.root = root; }
	
	/**
	 * Command Line Invocation.
	 * 
	 * @param args CLI argument(s)
	 */
	public static void main(String[] args)
	{
		String xmlFileName = args.length > 0 ? args[0] : SAMPLE_ROOT_HEADER_FILE;
		try
		{
			Main main = new Main();
			main.execute(xmlFileName);
		}
		catch (JAXBException | IOException | SAXException ex)
		{
			getLogger().error("Aborting " + Main.class.getName(), ex);
		}
	}
	
	/**
	 * Execute the JAXB and JPA actions.
	 * 
	 * @param xmlFileName The path to an XML data file.
	 * 
	 * @throws JAXBException When a JAXB action fails.
	 * @throws IOException When an I/O actions fails.
	 * @throws SAXException When XmlSchemaValidator cannot be generated from DOM.
	 */
	public void execute(String xmlFileName) throws JAXBException, IOException, SAXException
	{
		// Enable JAXB schema validation on XML instances.
		generateXmlSchemaValidatorFromDom();
		
		// JAXB: unmarshal XML file by path name.
		RecipeBook recipeBook = unmarshal(xmlFileName, RecipeBook.class);
		setRoot(recipeBook);
        getLogger().info("RecipeBook loaded with {} recipes", recipeBook.getRecipe().size());

        // Select Purchase Order(s) by order date.
        List<AbstractBiscuit> biscuitsToPersist = new ArrayList<>();

		// Collect all biscuits from recipes
		for (Recipe recipe : recipeBook.getRecipe()) {
			JAXBElement<? extends AbstractBiscuit> biscuitElement = recipe.getBiscuit();
			if (biscuitElement != null) {
				AbstractBiscuit biscuit = biscuitElement.getValue();
				biscuitsToPersist.add(biscuit);
			}
		}


		// Persist all biscuits if they’re not already in DB
		for (AbstractBiscuit biscuit : biscuitsToPersist) {
			persist(biscuit);
		}
	}

	private List<RecipeBook> selectRoots() throws IOException {
		try (EntityManager em = createEntityManager()) {
			return em.createQuery("SELECT r FROM RecipeBook r", RecipeBook.class)
					.setHint("org.hibernate.cacheable", false)
					.getResultList();
		}
	}
	
	private void persist(AbstractBiscuit biscuit) throws IOException {
		Transactional<Integer> tx = (em) -> {
			em.persist(biscuit);
			return 1;
		};

		try (EntityManager em = createEntityManager()) {
			Integer count = tx.transact(em);
			getLogger().info("Persisted {} {}(s)", count, RecipeBook.class.getSimpleName());
		}
	}

}
// vi:set tabstop=4 hardtabs=4 shiftwidth=4:
