
package org.example.biscuits;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
<<<<<<< HEAD:hyper-jaxb/target/generated-sources/xjc/org/example/root_header/ROOT.java
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
=======
import jakarta.persistence.OrderColumn;
>>>>>>> 03a9e649f302b7ee0fc499d28b2d9025acabbfa7:hyper-jaxb/biscuit/target/generated-sources/xjc/org/example/biscuits/Ingredients.java
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
<<<<<<< HEAD:hyper-jaxb/target/generated-sources/xjc/org/example/root_header/ROOT.java
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
=======
import jakarta.xml.bind.annotation.XmlList;
>>>>>>> 03a9e649f302b7ee0fc499d28b2d9025acabbfa7:hyper-jaxb/biscuit/target/generated-sources/xjc/org/example/biscuits/Ingredients.java
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
<<<<<<< HEAD:hyper-jaxb/target/generated-sources/xjc/org/example/root_header/ROOT.java
 *         <element name="jaxb" type="{http://example.org/root_header}DistanceType" minOccurs="0"/>
 *         <element name="Header" type="{http://example.org/root_header}HeaderType"/>
 *         <element ref="{http://example.org/root_header}name" minOccurs="0"/>
 *         <element name="Data_Block" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Sensing_Start_Time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Sensing_Stop_Time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="List_of_Acquisitions">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Acquisition" type="{http://example.org/root_header}AcquisitionType" maxOccurs="unbounded"/>
 *                           </sequence>
 *                           <attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="List_Of_Dumps" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Dump" type="{http://example.org/root_header}DumpType" maxOccurs="unbounded"/>
 *                           </sequence>
 *                           <attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
=======
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="amount" type="{http://example.org/biscuits}IngredientAmount"/>
 *         <element name="allergens" type="{http://example.org/biscuits}AllergenList" minOccurs="0"/>
>>>>>>> 03a9e649f302b7ee0fc499d28b2d9025acabbfa7:hyper-jaxb/biscuit/target/generated-sources/xjc/org/example/biscuits/Ingredients.java
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
<<<<<<< HEAD:hyper-jaxb/target/generated-sources/xjc/org/example/root_header/ROOT.java
    "jaxb",
    "header",
=======
>>>>>>> 03a9e649f302b7ee0fc499d28b2d9025acabbfa7:hyper-jaxb/biscuit/target/generated-sources/xjc/org/example/biscuits/Ingredients.java
    "name",
    "amount",
    "allergens"
})
@Entity(name = "Ingredients")
@Table(name = "INGREDIENTS")
public class Ingredients implements Serializable, Equals, HashCode, ToString
{

<<<<<<< HEAD:hyper-jaxb/target/generated-sources/xjc/org/example/root_header/ROOT.java
    private static final long serialVersionUID = 20240501L;
    @XmlElementRef(name = "jaxb", namespace = "http://example.org/root_header", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceType> jaxb;
    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(nillable = true)
=======
    private static final long serialVersionUID = 20250909L;
    @XmlElement(required = true)
>>>>>>> 03a9e649f302b7ee0fc499d28b2d9025acabbfa7:hyper-jaxb/biscuit/target/generated-sources/xjc/org/example/biscuits/Ingredients.java
    protected String name;
    @XmlElement(required = true)
    protected IngredientAmount amount;
    @XmlList
    protected List<String> allergens;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
<<<<<<< HEAD:hyper-jaxb/target/generated-sources/xjc/org/example/root_header/ROOT.java
     * Gets the value of the jaxb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DistanceType> getJaxb() {
        return jaxb;
    }

    /**
     * Sets the value of the jaxb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceType }{@code >}
     *     
     */
    public void setJaxb(JAXBElement<DistanceType> value) {
        this.jaxb = value;
    }

    @Transient
    public boolean isSetJaxb() {
        return (this.jaxb!= null);
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    @OneToOne(targetEntity = HeaderType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "HEADER_ROOT_HJID")
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    @Transient
    public boolean isSetHeader() {
        return (this.header!= null);
    }

    /**
=======
>>>>>>> 03a9e649f302b7ee0fc499d28b2d9025acabbfa7:hyper-jaxb/biscuit/target/generated-sources/xjc/org/example/biscuits/Ingredients.java
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NAME_", length = 255)
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    @Transient
    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link IngredientAmount }
     *     
     */
    @ManyToOne(targetEntity = IngredientAmount.class, cascade = {
        CascadeType.MERGE,
        CascadeType.REFRESH,
        CascadeType.DETACH,
        CascadeType.PERSIST
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "AMOUNT_INGREDIENTS_HJID")
    public IngredientAmount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link IngredientAmount }
     *     
     */
    public void setAmount(IngredientAmount value) {
        this.amount = value;
    }

    @Transient
    public boolean isSetAmount() {
        return (this.amount!= null);
    }

    /**
     * Gets the value of the allergens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allergens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllergens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @ElementCollection
    @OrderColumn(name = "HJINDEX")
    @Column(name = "HJVALUE", length = 255)
    @CollectionTable(name = "INGREDIENTS_ALLERGENS", joinColumns = {
        @JoinColumn(name = "HJID")
    })
    public List<String> getAllergens() {
        if (allergens == null) {
            allergens = new ArrayList<>();
        }
        return this.allergens;
    }

    /**
     * 
     * 
     */
    public void setAllergens(List<String> allergens) {
        this.allergens = allergens;
    }

    @Transient
    public boolean isSetAllergens() {
        return ((this.allergens!= null)&&(!this.allergens.isEmpty()));
    }

    public void unsetAllergens() {
        this.allergens = null;
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

    @ManyToOne(targetEntity = DistanceType.class, cascade = {
        CascadeType.MERGE,
        CascadeType.REFRESH,
        CascadeType.PERSIST,
        CascadeType.DETACH
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "JAXB_ITEM_ROOT_HJID")
    public DistanceType getJaxbItem() {
        return XmlAdapterUtils.unmarshallSource(DistanceType.class, this.getJaxb());
    }

    public void setJaxbItem(DistanceType target) {
        setJaxb(XmlAdapterUtils.marshallJAXBElement(DistanceType.class, new QName("http://example.org/root_header", "jaxb"), ROOT.class, target));
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
<<<<<<< HEAD:hyper-jaxb/target/generated-sources/xjc/org/example/root_header/ROOT.java
        final ROOT that = ((ROOT) object);
=======
        final Ingredients that = ((Ingredients) object);
>>>>>>> 03a9e649f302b7ee0fc499d28b2d9025acabbfa7:hyper-jaxb/biscuit/target/generated-sources/xjc/org/example/biscuits/Ingredients.java
        {
            boolean lhsFieldIsSet = this.isSetName();
            boolean rhsFieldIsSet = that.isSetName();
            String lhsField;
            lhsField = this.getName();
            String rhsField;
            rhsField = that.getName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "name", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "name", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
<<<<<<< HEAD:hyper-jaxb/target/generated-sources/xjc/org/example/root_header/ROOT.java
            boolean lhsFieldIsSet = this.isSetHeader();
            boolean rhsFieldIsSet = that.isSetHeader();
            HeaderType lhsField;
            lhsField = this.getHeader();
            HeaderType rhsField;
            rhsField = that.getHeader();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "header", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "header", rhsField);
=======
            boolean lhsFieldIsSet = this.isSetAllergens();
            boolean rhsFieldIsSet = that.isSetAllergens();
            List<String> lhsField;
            lhsField = (this.isSetAllergens()?this.getAllergens():null);
            List<String> rhsField;
            rhsField = (that.isSetAllergens()?that.getAllergens():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "allergens", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "allergens", rhsField);
>>>>>>> 03a9e649f302b7ee0fc499d28b2d9025acabbfa7:hyper-jaxb/biscuit/target/generated-sources/xjc/org/example/biscuits/Ingredients.java
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
<<<<<<< HEAD:hyper-jaxb/target/generated-sources/xjc/org/example/root_header/ROOT.java
            boolean lhsFieldIsSet = this.isSetDataBlock();
            boolean rhsFieldIsSet = that.isSetDataBlock();
            List<DataBlock> lhsField;
            lhsField = (this.isSetDataBlock()?this.getDataBlock():null);
            List<DataBlock> rhsField;
            rhsField = (that.isSetDataBlock()?that.getDataBlock():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dataBlock", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dataBlock", rhsField);
=======
            boolean lhsFieldIsSet = this.isSetAmount();
            boolean rhsFieldIsSet = that.isSetAmount();
            IngredientAmount lhsField;
            lhsField = this.getAmount();
            IngredientAmount rhsField;
            rhsField = that.getAmount();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "amount", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "amount", rhsField);
>>>>>>> 03a9e649f302b7ee0fc499d28b2d9025acabbfa7:hyper-jaxb/biscuit/target/generated-sources/xjc/org/example/biscuits/Ingredients.java
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetJaxb();
            boolean rhsFieldIsSet = that.isSetJaxb();
            JAXBElement<DistanceType> lhsField;
            lhsField = this.getJaxb();
            JAXBElement<DistanceType> rhsField;
            rhsField = that.getJaxb();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "jaxb", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "jaxb", rhsField);
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
<<<<<<< HEAD:hyper-jaxb/target/generated-sources/xjc/org/example/root_header/ROOT.java
            boolean theFieldIsSet = this.isSetJaxb();
            JAXBElement<DistanceType> theField;
            theField = this.getJaxb();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "jaxb", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHeader();
            HeaderType theField;
            theField = this.getHeader();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "header", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
=======
>>>>>>> 03a9e649f302b7ee0fc499d28b2d9025acabbfa7:hyper-jaxb/biscuit/target/generated-sources/xjc/org/example/biscuits/Ingredients.java
            boolean theFieldIsSet = this.isSetName();
            String theField;
            theField = this.getName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "name", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAmount();
            IngredientAmount theField;
            theField = this.getAmount();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "amount", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAllergens();
            List<String> theField;
            theField = (this.isSetAllergens()?this.getAllergens():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "allergens", theField);
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
<<<<<<< HEAD:hyper-jaxb/target/generated-sources/xjc/org/example/root_header/ROOT.java
            boolean theFieldIsSet = this.isSetJaxb();
            JAXBElement<DistanceType> theField;
            theField = this.getJaxb();
            strategy.appendField(locator, this, "jaxb", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHeader();
            HeaderType theField;
            theField = this.getHeader();
            strategy.appendField(locator, this, "header", buffer, theField, theFieldIsSet);
        }
        {
=======
>>>>>>> 03a9e649f302b7ee0fc499d28b2d9025acabbfa7:hyper-jaxb/biscuit/target/generated-sources/xjc/org/example/biscuits/Ingredients.java
            boolean theFieldIsSet = this.isSetName();
            String theField;
            theField = this.getName();
            strategy.appendField(locator, this, "name", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAmount();
            IngredientAmount theField;
            theField = this.getAmount();
            strategy.appendField(locator, this, "amount", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAllergens();
            List<String> theField;
            theField = (this.isSetAllergens()?this.getAllergens():null);
            strategy.appendField(locator, this, "allergens", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
