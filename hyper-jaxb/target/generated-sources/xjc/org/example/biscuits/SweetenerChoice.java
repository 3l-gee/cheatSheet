
package org.example.biscuits;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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


/**
 * <p>Java class for SweetenerChoice complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SweetenerChoice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="sugar" type="{http://example.org/biscuits}IngredientAmount"/>
 *         <element name="honey" type="{http://example.org/biscuits}IngredientAmount"/>
 *         <element name="syrup" type="{http://example.org/biscuits}IngredientAmount"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SweetenerChoice", propOrder = {
    "sugar",
    "honey",
    "syrup"
})
@Entity(name = "SweetenerChoice")
@Table(name = "SWEETENER_CHOICE")
@Inheritance(strategy = InheritanceType.JOINED)
public class SweetenerChoice implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250909L;
    protected IngredientAmount sugar;
    protected IngredientAmount honey;
    protected IngredientAmount syrup;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the sugar property.
     * 
     * @return
     *     possible object is
     *     {@link IngredientAmount }
     *     
     */
    @ManyToOne(targetEntity = IngredientAmount.class, cascade = {
        CascadeType.MERGE,
        CascadeType.DETACH,
        CascadeType.REFRESH,
        CascadeType.PERSIST
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "SUGAR_SWEETENER_CHOICE_HJID")
    public IngredientAmount getSugar() {
        return sugar;
    }

    /**
     * Sets the value of the sugar property.
     * 
     * @param value
     *     allowed object is
     *     {@link IngredientAmount }
     *     
     */
    public void setSugar(IngredientAmount value) {
        this.sugar = value;
    }

    @Transient
    public boolean isSetSugar() {
        return (this.sugar!= null);
    }

    /**
     * Gets the value of the honey property.
     * 
     * @return
     *     possible object is
     *     {@link IngredientAmount }
     *     
     */
    @ManyToOne(targetEntity = IngredientAmount.class, cascade = {
        CascadeType.MERGE,
        CascadeType.DETACH,
        CascadeType.REFRESH,
        CascadeType.PERSIST
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "HONEY_SWEETENER_CHOICE_HJID")
    public IngredientAmount getHoney() {
        return honey;
    }

    /**
     * Sets the value of the honey property.
     * 
     * @param value
     *     allowed object is
     *     {@link IngredientAmount }
     *     
     */
    public void setHoney(IngredientAmount value) {
        this.honey = value;
    }

    @Transient
    public boolean isSetHoney() {
        return (this.honey!= null);
    }

    /**
     * Gets the value of the syrup property.
     * 
     * @return
     *     possible object is
     *     {@link IngredientAmount }
     *     
     */
    @ManyToOne(targetEntity = IngredientAmount.class, cascade = {
        CascadeType.MERGE,
        CascadeType.DETACH,
        CascadeType.REFRESH,
        CascadeType.PERSIST
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "SYRUP_SWEETENER_CHOICE_HJID")
    public IngredientAmount getSyrup() {
        return syrup;
    }

    /**
     * Sets the value of the syrup property.
     * 
     * @param value
     *     allowed object is
     *     {@link IngredientAmount }
     *     
     */
    public void setSyrup(IngredientAmount value) {
        this.syrup = value;
    }

    @Transient
    public boolean isSetSyrup() {
        return (this.syrup!= null);
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
        final SweetenerChoice that = ((SweetenerChoice) object);
        {
            boolean lhsFieldIsSet = this.isSetSugar();
            boolean rhsFieldIsSet = that.isSetSugar();
            IngredientAmount lhsField;
            lhsField = this.getSugar();
            IngredientAmount rhsField;
            rhsField = that.getSugar();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sugar", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sugar", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHoney();
            boolean rhsFieldIsSet = that.isSetHoney();
            IngredientAmount lhsField;
            lhsField = this.getHoney();
            IngredientAmount rhsField;
            rhsField = that.getHoney();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "honey", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "honey", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSyrup();
            boolean rhsFieldIsSet = that.isSetSyrup();
            IngredientAmount lhsField;
            lhsField = this.getSyrup();
            IngredientAmount rhsField;
            rhsField = that.getSyrup();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "syrup", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "syrup", rhsField);
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
            boolean theFieldIsSet = this.isSetSugar();
            IngredientAmount theField;
            theField = this.getSugar();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sugar", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHoney();
            IngredientAmount theField;
            theField = this.getHoney();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "honey", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSyrup();
            IngredientAmount theField;
            theField = this.getSyrup();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "syrup", theField);
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
            boolean theFieldIsSet = this.isSetSugar();
            IngredientAmount theField;
            theField = this.getSugar();
            strategy.appendField(locator, this, "sugar", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHoney();
            IngredientAmount theField;
            theField = this.getHoney();
            strategy.appendField(locator, this, "honey", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSyrup();
            IngredientAmount theField;
            theField = this.getSyrup();
            strategy.appendField(locator, this, "syrup", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
