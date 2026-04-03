package org.example.simplecase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Example: JAXB + JPA
 * 1. Unmarshal XML → Java
 * 2. Persist Java → DB
 * 3. Extract Java ← DB
 * 4. Marshal Java → XML
 */
public class Main extends Context
{
	private static Logger logger = LoggerFactory.getLogger(Main.class);
	public static Logger getLogger() { return logger; }

	public static final String SAMPLE_ROOT_HEADER_FILE = "src/test/samples/simple.xml";
	
    // Represents the unmarshalled Root.
    private org.example.simplecase.Group root;
    public org.example.simplecase.Group getRoot() { return root; }
    public void setRoot(org.example.simplecase.Group root) { this.root = root; }
	
	public static void main(String[] args){
		String xmlFileName = args.length > 0 ? args[0] : SAMPLE_ROOT_HEADER_FILE;
		try {
			Main main = new Main();
			main.execute(xmlFileName);
		} catch (JAXBException | IOException | SAXException ex)	{
			getLogger().error("Aborting " + Main.class.getName(), ex);
		}
	}

	public void execute(String xmlFileName) throws JAXBException, IOException, SAXException {
        // STEP 0: Enable JAXB schema validation
        generateXmlSchemaValidatorFromDom();

        // STEP 1: UNMARSHAL - XML → Java
        org.example.simplecase.Group peopleList = unmarshal(xmlFileName, org.example.simplecase.Group.class);
        setRoot(peopleList);

        // STEP 2: PERSIST - Save each Person in DB
        for (org.example.simplecase.PersonType person : peopleList.getPerson()) {
            persist(person);
        }

        // STEP 3: EXTRACT - Load data back from DB
        List<org.example.simplecase.Group> storedLists = selectRoots();

        // STEP 4: MARSHAL - Java → XML
        marshal(peopleList, "target/output.xml");
    }
	
    private List<org.example.simplecase.Group> selectRoots() throws IOException {
        try (EntityManager em = createEntityManager()) {
            return em.createQuery("SELECT r FROM List r", org.example.simplecase.Group.class)
                    .setHint("org.hibernate.cacheable", false)
                    .getResultList();
        }
    }

    private void persist(PersonType person) throws IOException {
        Transactional<Integer> tx = (em) -> {
            em.persist(person);
            return 1;
        };
        try (EntityManager em = createEntityManager()) {
            Integer count = tx.transact(em);
            getLogger().info("Persisted {} person(s)", count);
        }
    }

}
// vi:set tabstop=4 hardtabs=4 shiftwidth=4:
