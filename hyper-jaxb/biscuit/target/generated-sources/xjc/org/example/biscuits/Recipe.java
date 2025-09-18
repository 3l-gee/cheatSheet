
package org.example.biscuits;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.Equals;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCode;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBEqualsStrategy;
import org.jvnet.basicjaxb.lang.JAXBHashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBToStringStrategy;
import org.jvnet.basicjaxb.lang.ToString;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.DefaultRootObjectLocator;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;
import org.jvnet.hyperjaxb.xml.bind.JAXBElementUtils;
import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XMLGregorianCalendarAsDateTime;
import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ingredients" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="amount" type="{http://example.org/biscuits}IngredientAmount"/>
 *                   <element name="allergens" type="{http://example.org/biscuits}AllergenList" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="sweetener" type="{http://example.org/biscuits}SweetenerChoice" minOccurs="0"/>
 *         <element name="steps" type="{http://example.org/biscuits}RecipeStep" maxOccurs="unbounded"/>
 *         <element name="tray" type="{http://example.org/biscuits}TrayType"/>
 *         <element ref="{http://example.org/biscuits}biscuit"/>
 *         <element name="recipeNotes" type="{http://example.org/biscuits}Notes" minOccurs="0"/>
 *         <element name="biscuitNotes" type="{http://example.org/biscuits}Notes" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://example.org/biscuits}BakeMetadata"/>
 *       <attribute name="difficulty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "ingredients",
    "sweetener",
    "steps",
    "tray",
    "biscuit",
    "recipeNotes",
    "biscuitNotes"
})
@Entity(name = "Recipe")
@Table(name = "RECIPE")
public class Recipe implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250909L;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected List<Ingredients> ingredients;
    protected SweetenerChoice sweetener;
    @XmlElement(required = true)
    protected List<RecipeStep> steps;
    @XmlElement(required = true)
    protected TrayType tray;
    @XmlElementRef(name = "biscuit", namespace = "http://example.org/biscuits", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractBiscuit> biscuit;
    @XmlElementRef(name = "recipeNotes", namespace = "http://example.org/biscuits", type = JAXBElement.class, required = false)
    protected JAXBElement<Notes> recipeNotes;
    @XmlElementRef(name = "biscuitNotes", namespace = "http://example.org/biscuits", type = JAXBElement.class, required = false)
    protected JAXBElement<Notes> biscuitNotes;
    @XmlAttribute(name = "difficulty")
    protected String difficulty;
    @XmlAttribute(name = "created")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlAttribute(name = "updated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updated;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TITLE", length = 255)
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    @Transient
    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Gets the value of the ingredients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ingredients }
     * 
     * 
     */
    @OneToMany(targetEntity = Ingredients.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "INGREDIENTS_RECIPE_HJID")
    public List<Ingredients> getIngredients() {
        if (ingredients == null) {
            ingredients = new ArrayList<>();
        }
        return this.ingredients;
    }

    /**
     * 
     * 
     */
    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    @Transient
    public boolean isSetIngredients() {
        return ((this.ingredients!= null)&&(!this.ingredients.isEmpty()));
    }

    public void unsetIngredients() {
        this.ingredients = null;
    }

    /**
     * Gets the value of the sweetener property.
     * 
     * @return
     *     possible object is
     *     {@link SweetenerChoice }
     *     
     */
    @ManyToOne(targetEntity = SweetenerChoice.class, cascade = {
        CascadeType.MERGE,
        CascadeType.REFRESH,
        CascadeType.DETACH,
        CascadeType.PERSIST
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "SWEETENER_RECIPE_HJID")
    public SweetenerChoice getSweetener() {
        return sweetener;
    }

    /**
     * Sets the value of the sweetener property.
     * 
     * @param value
     *     allowed object is
     *     {@link SweetenerChoice }
     *     
     */
    public void setSweetener(SweetenerChoice value) {
        this.sweetener = value;
    }

    @Transient
    public boolean isSetSweetener() {
        return (this.sweetener!= null);
    }

    /**
     * Gets the value of the steps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the steps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSteps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecipeStep }
     * 
     * 
     */
    @OneToMany(targetEntity = RecipeStep.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "STEPS_RECIPE_HJID")
    public List<RecipeStep> getSteps() {
        if (steps == null) {
            steps = new ArrayList<>();
        }
        return this.steps;
    }

    /**
     * 
     * 
     */
    public void setSteps(List<RecipeStep> steps) {
        this.steps = steps;
    }

    @Transient
    public boolean isSetSteps() {
        return ((this.steps!= null)&&(!this.steps.isEmpty()));
    }

    public void unsetSteps() {
        this.steps = null;
    }

    /**
     * Gets the value of the tray property.
     * 
     * @return
     *     possible object is
     *     {@link TrayType }
     *     
     */
    @ManyToOne(targetEntity = TrayType.class, cascade = {
        CascadeType.MERGE,
        CascadeType.REFRESH,
        CascadeType.DETACH,
        CascadeType.PERSIST
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "TRAY_RECIPE_HJID")
    public TrayType getTray() {
        return tray;
    }

    /**
     * Sets the value of the tray property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrayType }
     *     
     */
    public void setTray(TrayType value) {
        this.tray = value;
    }

    @Transient
    public boolean isSetTray() {
        return (this.tray!= null);
    }

    /**
     * Gets the value of the biscuit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractBiscuit }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChocolateBiscuit }{@code >}
     *     {@link JAXBElement }{@code <}{@link JamBiscuit }{@code >}
     *     
     */
    @Transient
    public JAXBElement<? extends AbstractBiscuit> getBiscuit() {
        return biscuit;
    }

    /**
     * Sets the value of the biscuit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractBiscuit }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChocolateBiscuit }{@code >}
     *     {@link JAXBElement }{@code <}{@link JamBiscuit }{@code >}
     *     
     */
    public void setBiscuit(JAXBElement<? extends AbstractBiscuit> value) {
        this.biscuit = value;
    }

    @Transient
    public boolean isSetBiscuit() {
        return (this.biscuit!= null);
    }

    /**
     * Gets the value of the recipeNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Notes }{@code >}
     *     
     */
    @Transient
    public JAXBElement<Notes> getRecipeNotes() {
        return recipeNotes;
    }

    /**
     * Sets the value of the recipeNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Notes }{@code >}
     *     
     */
    public void setRecipeNotes(JAXBElement<Notes> value) {
        this.recipeNotes = value;
    }

    @Transient
    public boolean isSetRecipeNotes() {
        return (this.recipeNotes!= null);
    }

    /**
     * Gets the value of the biscuitNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Notes }{@code >}
     *     
     */
    @Transient
    public JAXBElement<Notes> getBiscuitNotes() {
        return biscuitNotes;
    }

    /**
     * Sets the value of the biscuitNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Notes }{@code >}
     *     
     */
    public void setBiscuitNotes(JAXBElement<Notes> value) {
        this.biscuitNotes = value;
    }

    @Transient
    public boolean isSetBiscuitNotes() {
        return (this.biscuitNotes!= null);
    }

    /**
     * Gets the value of the difficulty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DIFFICULTY", length = 255)
    public String getDifficulty() {
        return difficulty;
    }

    /**
     * Sets the value of the difficulty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDifficulty(String value) {
        this.difficulty = value;
    }

    @Transient
    public boolean isSetDifficulty() {
        return (this.difficulty!= null);
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    @Transient
    public boolean isSetCreated() {
        return (this.created!= null);
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdated(XMLGregorianCalendar value) {
        this.updated = value;
    }

    @Transient
    public boolean isSetUpdated() {
        return (this.updated!= null);
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    @Basic
    @Column(name = "BISCUIT_NAME")
    public String getBiscuitName() {
        if (this.getBiscuit() instanceof JAXBElement) {
            return JAXBElementUtils.getName(AbstractBiscuit.class, this.getBiscuit());
        } else {
            return null;
        }
    }

    public void setBiscuitName(String target) {
        if (target!= null) {
            setBiscuit(JAXBElementUtils.wrap(this.getBiscuit(), target, AbstractBiscuit.class));
        }
    }

    @ManyToOne(targetEntity = AbstractBiscuit.class, cascade = {
        CascadeType.MERGE,
        CascadeType.REFRESH,
        CascadeType.DETACH,
        CascadeType.PERSIST
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "BISCUIT_VALUE_RECIPE_HJID")
    public AbstractBiscuit getBiscuitValue() {
        if (this.getBiscuit() instanceof JAXBElement) {
            return JAXBElementUtils.getValue(AbstractBiscuit.class, this.getBiscuit());
        } else {
            return null;
        }
    }

    public void setBiscuitValue(AbstractBiscuit target) {
        if (target!= null) {
            setBiscuit(JAXBElementUtils.wrap(this.getBiscuit(), target));
        }
    }

    @ManyToOne(targetEntity = Notes.class, cascade = {
        CascadeType.MERGE,
        CascadeType.REFRESH,
        CascadeType.DETACH,
        CascadeType.PERSIST
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "RECIPE_NOTES_ITEM_RECIPE_HJID")
    public Notes getRecipeNotesItem() {
        return XmlAdapterUtils.unmarshallSource(Notes.class, this.getRecipeNotes());
    }

    public void setRecipeNotesItem(Notes target) {
        setRecipeNotes(XmlAdapterUtils.marshallJAXBElement(Notes.class, new QName("http://example.org/biscuits", "recipeNotes"), Recipe.class, target));
    }

    @ManyToOne(targetEntity = Notes.class, cascade = {
        CascadeType.MERGE,
        CascadeType.REFRESH,
        CascadeType.DETACH,
        CascadeType.PERSIST
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "BISCUIT_NOTES_ITEM_RECIPE_HJ_0")
    public Notes getBiscuitNotesItem() {
        return XmlAdapterUtils.unmarshallSource(Notes.class, this.getBiscuitNotes());
    }

    public void setBiscuitNotesItem(Notes target) {
        setBiscuitNotes(XmlAdapterUtils.marshallJAXBElement(Notes.class, new QName("http://example.org/biscuits", "biscuitNotes"), Recipe.class, target));
    }

    @Basic
    @Column(name = "CREATED_ITEM")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreatedItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDateTime.class, this.getCreated());
    }

    public void setCreatedItem(Date target) {
        setCreated(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDateTime.class, target));
    }

    @Basic
    @Column(name = "UPDATED_ITEM")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getUpdatedItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDateTime.class, this.getUpdated());
    }

    public void setUpdatedItem(Date target) {
        setUpdated(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDateTime.class, target));
    }

    @Override
    public boolean equals(Object object) {
        ObjectLocator thisLocator = null;
        ObjectLocator thatLocator = null;
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            thisLocator = new DefaultRootObjectLocator(this);
            thatLocator = new DefaultRootObjectLocator(object);
        }
        return equals(thisLocator, thatLocator, object, strategy);
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Recipe that = ((Recipe) object);
        {
            boolean lhsFieldIsSet = this.isSetCreated();
            boolean rhsFieldIsSet = that.isSetCreated();
            XMLGregorianCalendar lhsField;
            lhsField = this.getCreated();
            XMLGregorianCalendar rhsField;
            rhsField = that.getCreated();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "created", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "created", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUpdated();
            boolean rhsFieldIsSet = that.isSetUpdated();
            XMLGregorianCalendar lhsField;
            lhsField = this.getUpdated();
            XMLGregorianCalendar rhsField;
            rhsField = that.getUpdated();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "updated", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "updated", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSteps();
            boolean rhsFieldIsSet = that.isSetSteps();
            List<RecipeStep> lhsField;
            lhsField = (this.isSetSteps()?this.getSteps():null);
            List<RecipeStep> rhsField;
            rhsField = (that.isSetSteps()?that.getSteps():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "steps", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "steps", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetBiscuit();
            boolean rhsFieldIsSet = that.isSetBiscuit();
            JAXBElement<? extends AbstractBiscuit> lhsField;
            lhsField = this.getBiscuit();
            JAXBElement<? extends AbstractBiscuit> rhsField;
            rhsField = that.getBiscuit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "biscuit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "biscuit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIngredients();
            boolean rhsFieldIsSet = that.isSetIngredients();
            List<Ingredients> lhsField;
            lhsField = (this.isSetIngredients()?this.getIngredients():null);
            List<Ingredients> rhsField;
            rhsField = (that.isSetIngredients()?that.getIngredients():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "ingredients", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "ingredients", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetBiscuitNotes();
            boolean rhsFieldIsSet = that.isSetBiscuitNotes();
            JAXBElement<Notes> lhsField;
            lhsField = this.getBiscuitNotes();
            JAXBElement<Notes> rhsField;
            rhsField = that.getBiscuitNotes();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "biscuitNotes", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "biscuitNotes", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTitle();
            boolean rhsFieldIsSet = that.isSetTitle();
            String lhsField;
            lhsField = this.getTitle();
            String rhsField;
            rhsField = that.getTitle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "title", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "title", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSweetener();
            boolean rhsFieldIsSet = that.isSetSweetener();
            SweetenerChoice lhsField;
            lhsField = this.getSweetener();
            SweetenerChoice rhsField;
            rhsField = that.getSweetener();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sweetener", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sweetener", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTray();
            boolean rhsFieldIsSet = that.isSetTray();
            TrayType lhsField;
            lhsField = this.getTray();
            TrayType rhsField;
            rhsField = that.getTray();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "tray", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "tray", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDifficulty();
            boolean rhsFieldIsSet = that.isSetDifficulty();
            String lhsField;
            lhsField = this.getDifficulty();
            String rhsField;
            rhsField = that.getDifficulty();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "difficulty", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "difficulty", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRecipeNotes();
            boolean rhsFieldIsSet = that.isSetRecipeNotes();
            JAXBElement<Notes> lhsField;
            lhsField = this.getRecipeNotes();
            JAXBElement<Notes> rhsField;
            rhsField = that.getRecipeNotes();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "recipeNotes", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "recipeNotes", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        ObjectLocator theLocator = null;
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        return this.hashCode(theLocator, strategy);
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            boolean theFieldIsSet = this.isSetTitle();
            String theField;
            theField = this.getTitle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "title", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIngredients();
            List<Ingredients> theField;
            theField = (this.isSetIngredients()?this.getIngredients():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "ingredients", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSweetener();
            SweetenerChoice theField;
            theField = this.getSweetener();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sweetener", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSteps();
            List<RecipeStep> theField;
            theField = (this.isSetSteps()?this.getSteps():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "steps", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTray();
            TrayType theField;
            theField = this.getTray();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "tray", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBiscuit();
            JAXBElement<? extends AbstractBiscuit> theField;
            theField = this.getBiscuit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "biscuit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRecipeNotes();
            JAXBElement<Notes> theField;
            theField = this.getRecipeNotes();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "recipeNotes", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBiscuitNotes();
            JAXBElement<Notes> theField;
            theField = this.getBiscuitNotes();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "biscuitNotes", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDifficulty();
            String theField;
            theField = this.getDifficulty();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "difficulty", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCreated();
            XMLGregorianCalendar theField;
            theField = this.getCreated();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "created", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpdated();
            XMLGregorianCalendar theField;
            theField = this.getUpdated();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "updated", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        ObjectLocator theLocator = null;
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        if (strategy.isTraceEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        final StringBuilder buffer = new StringBuilder();
        append(theLocator, buffer, strategy);
        return buffer.toString();
    }

    @Override
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            boolean theFieldIsSet = this.isSetTitle();
            String theField;
            theField = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIngredients();
            List<Ingredients> theField;
            theField = (this.isSetIngredients()?this.getIngredients():null);
            strategy.appendField(locator, this, "ingredients", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSweetener();
            SweetenerChoice theField;
            theField = this.getSweetener();
            strategy.appendField(locator, this, "sweetener", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSteps();
            List<RecipeStep> theField;
            theField = (this.isSetSteps()?this.getSteps():null);
            strategy.appendField(locator, this, "steps", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTray();
            TrayType theField;
            theField = this.getTray();
            strategy.appendField(locator, this, "tray", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBiscuit();
            JAXBElement<? extends AbstractBiscuit> theField;
            theField = this.getBiscuit();
            strategy.appendField(locator, this, "biscuit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRecipeNotes();
            JAXBElement<Notes> theField;
            theField = this.getRecipeNotes();
            strategy.appendField(locator, this, "recipeNotes", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBiscuitNotes();
            JAXBElement<Notes> theField;
            theField = this.getBiscuitNotes();
            strategy.appendField(locator, this, "biscuitNotes", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDifficulty();
            String theField;
            theField = this.getDifficulty();
            strategy.appendField(locator, this, "difficulty", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCreated();
            XMLGregorianCalendar theField;
            theField = this.getCreated();
            strategy.appendField(locator, this, "created", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpdated();
            XMLGregorianCalendar theField;
            theField = this.getUpdated();
            strategy.appendField(locator, this, "updated", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
