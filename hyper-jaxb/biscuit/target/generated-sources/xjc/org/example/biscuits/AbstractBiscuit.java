
package org.example.biscuits;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for AbstractBiscuit complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractBiscuit">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="shape" type="{http://example.org/biscuits}BiscuitShape" />
 *       <attribute name="flour" type="{http://example.org/biscuits}FlourType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractBiscuit")
@XmlSeeAlso({
    ChocolateBiscuit.class,
    JamBiscuit.class
})
@Entity(name = "AbstractBiscuit")
@Table(name = "ABSTRACT_BISCUIT")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AbstractBiscuit implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250909L;
    @XmlAttribute(name = "shape")
    protected BiscuitShape shape;
    @XmlAttribute(name = "flour")
    protected FlourType flour;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the shape property.
     * 
     * @return
     *     possible object is
     *     {@link BiscuitShape }
     *     
     */
    @Basic
    @Column(name = "SHAPE", length = 255)
    @Enumerated(EnumType.STRING)
    public BiscuitShape getShape() {
        return shape;
    }

    /**
     * Sets the value of the shape property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiscuitShape }
     *     
     */
    public void setShape(BiscuitShape value) {
        this.shape = value;
    }

    @Transient
    public boolean isSetShape() {
        return (this.shape!= null);
    }

    /**
     * Gets the value of the flour property.
     * 
     * @return
     *     possible object is
     *     {@link FlourType }
     *     
     */
    @Basic
    @Column(name = "FLOUR", length = 255)
    @Enumerated(EnumType.STRING)
    public FlourType getFlour() {
        return flour;
    }

    /**
     * Sets the value of the flour property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlourType }
     *     
     */
    public void setFlour(FlourType value) {
        this.flour = value;
    }

    @Transient
    public boolean isSetFlour() {
        return (this.flour!= null);
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
        final AbstractBiscuit that = ((AbstractBiscuit) object);
        {
            boolean lhsFieldIsSet = this.isSetFlour();
            boolean rhsFieldIsSet = that.isSetFlour();
            FlourType lhsField;
            lhsField = this.getFlour();
            FlourType rhsField;
            rhsField = that.getFlour();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flour", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flour", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetShape();
            boolean rhsFieldIsSet = that.isSetShape();
            BiscuitShape lhsField;
            lhsField = this.getShape();
            BiscuitShape rhsField;
            rhsField = that.getShape();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "shape", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "shape", rhsField);
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
            boolean theFieldIsSet = this.isSetShape();
            BiscuitShape theField;
            theField = this.getShape();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "shape", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlour();
            FlourType theField;
            theField = this.getFlour();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flour", theField);
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
            boolean theFieldIsSet = this.isSetShape();
            BiscuitShape theField;
            theField = this.getShape();
            strategy.appendField(locator, this, "shape", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlour();
            FlourType theField;
            theField = this.getFlour();
            strategy.appendField(locator, this, "flour", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
