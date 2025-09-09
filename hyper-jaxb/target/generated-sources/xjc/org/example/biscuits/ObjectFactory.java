
package org.example.biscuits;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.biscuits package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Biscuit_QNAME = new QName("http://example.org/biscuits", "biscuit");
    private static final QName _ChocolateBiscuit_QNAME = new QName("http://example.org/biscuits", "chocolateBiscuit");
    private static final QName _JamBiscuit_QNAME = new QName("http://example.org/biscuits", "jamBiscuit");
    private static final QName _RecipeRecipeNotes_QNAME = new QName("http://example.org/biscuits", "recipeNotes");
    private static final QName _RecipeBiscuitNotes_QNAME = new QName("http://example.org/biscuits", "biscuitNotes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.biscuits
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChocolateBiscuit }
     * 
     * @return
     *     the new instance of {@link ChocolateBiscuit }
     */
    public ChocolateBiscuit createChocolateBiscuit() {
        return new ChocolateBiscuit();
    }

    /**
     * Create an instance of {@link JamBiscuit }
     * 
     * @return
     *     the new instance of {@link JamBiscuit }
     */
    public JamBiscuit createJamBiscuit() {
        return new JamBiscuit();
    }

    /**
     * Create an instance of {@link RecipeBook }
     * 
     * @return
     *     the new instance of {@link RecipeBook }
     */
    public RecipeBook createRecipeBook() {
        return new RecipeBook();
    }

    /**
     * Create an instance of {@link Recipe }
     * 
     * @return
     *     the new instance of {@link Recipe }
     */
    public Recipe createRecipe() {
        return new Recipe();
    }

    /**
     * Create an instance of {@link IngredientAmount }
     * 
     * @return
     *     the new instance of {@link IngredientAmount }
     */
    public IngredientAmount createIngredientAmount() {
        return new IngredientAmount();
    }

    /**
     * Create an instance of {@link RecipeStep }
     * 
     * @return
     *     the new instance of {@link RecipeStep }
     */
    public RecipeStep createRecipeStep() {
        return new RecipeStep();
    }

    /**
     * Create an instance of {@link SweetenerChoice }
     * 
     * @return
     *     the new instance of {@link SweetenerChoice }
     */
    public SweetenerChoice createSweetenerChoice() {
        return new SweetenerChoice();
    }

    /**
     * Create an instance of {@link TrayType }
     * 
     * @return
     *     the new instance of {@link TrayType }
     */
    public TrayType createTrayType() {
        return new TrayType();
    }

    /**
     * Create an instance of {@link Notes }
     * 
     * @return
     *     the new instance of {@link Notes }
     */
    public Notes createNotes() {
        return new Notes();
    }

    /**
     * Create an instance of {@link Ingredients }
     * 
     * @return
     *     the new instance of {@link Ingredients }
     */
    public Ingredients createIngredients() {
        return new Ingredients();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractBiscuit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractBiscuit }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/biscuits", name = "biscuit")
    public JAXBElement<AbstractBiscuit> createBiscuit(AbstractBiscuit value) {
        return new JAXBElement<>(_Biscuit_QNAME, AbstractBiscuit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChocolateBiscuit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChocolateBiscuit }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/biscuits", name = "chocolateBiscuit", substitutionHeadNamespace = "http://example.org/biscuits", substitutionHeadName = "biscuit")
    public JAXBElement<ChocolateBiscuit> createChocolateBiscuit(ChocolateBiscuit value) {
        return new JAXBElement<>(_ChocolateBiscuit_QNAME, ChocolateBiscuit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JamBiscuit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JamBiscuit }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/biscuits", name = "jamBiscuit", substitutionHeadNamespace = "http://example.org/biscuits", substitutionHeadName = "biscuit")
    public JAXBElement<JamBiscuit> createJamBiscuit(JamBiscuit value) {
        return new JAXBElement<>(_JamBiscuit_QNAME, JamBiscuit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Notes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Notes }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/biscuits", name = "recipeNotes", scope = Recipe.class)
    public JAXBElement<Notes> createRecipeRecipeNotes(Notes value) {
        return new JAXBElement<>(_RecipeRecipeNotes_QNAME, Notes.class, Recipe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Notes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Notes }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/biscuits", name = "biscuitNotes", scope = Recipe.class)
    public JAXBElement<Notes> createRecipeBiscuitNotes(Notes value) {
        return new JAXBElement<>(_RecipeBiscuitNotes_QNAME, Notes.class, Recipe.class, value);
    }

}
