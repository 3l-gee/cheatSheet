
package org.example.biscuits;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 * <p>Java class for RecipeStep complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RecipeStep">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="instruction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="duration" type="{http://example.org/biscuits}CookingTime" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="stepNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeStep", propOrder = {
    "instruction",
    "duration"
})
@Entity(name = "RecipeStep")
@Table(name = "RECIPE_STEP")
public class RecipeStep implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250909L;
    @XmlElement(required = true)
    protected String instruction;
    protected String duration;
    @XmlAttribute(name = "stepNumber", required = true)
    protected int stepNumber;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the instruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "INSTRUCTION", length = 255)
    public String getInstruction() {
        return instruction;
    }

    /**
     * Sets the value of the instruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstruction(String value) {
        this.instruction = value;
    }

    @Transient
    public boolean isSetInstruction() {
        return (this.instruction!= null);
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DURATION")
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    @Transient
    public boolean isSetDuration() {
        return (this.duration!= null);
    }

    /**
     * Gets the value of the stepNumber property.
     * 
     */
    @Basic
    @Column(name = "STEP_NUMBER", precision = 10, scale = 0)
    public int getStepNumber() {
        return stepNumber;
    }

    /**
     * Sets the value of the stepNumber property.
     * 
     */
    public void setStepNumber(int value) {
        this.stepNumber = value;
    }

    @Transient
    public boolean isSetStepNumber() {
        return true;
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
        final RecipeStep that = ((RecipeStep) object);
        {
            boolean lhsFieldIsSet = true;
            boolean rhsFieldIsSet = true;
            int lhsField;
            lhsField = this.getStepNumber();
            int rhsField;
            rhsField = that.getStepNumber();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "stepNumber", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "stepNumber", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDuration();
            boolean rhsFieldIsSet = that.isSetDuration();
            String lhsField;
            lhsField = this.getDuration();
            String rhsField;
            rhsField = that.getDuration();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "duration", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "duration", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetInstruction();
            boolean rhsFieldIsSet = that.isSetInstruction();
            String lhsField;
            lhsField = this.getInstruction();
            String rhsField;
            rhsField = that.getInstruction();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "instruction", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "instruction", rhsField);
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
            boolean theFieldIsSet = this.isSetInstruction();
            String theField;
            theField = this.getInstruction();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "instruction", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDuration();
            String theField;
            theField = this.getDuration();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "duration", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = true;
            int theField;
            theField = this.getStepNumber();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "stepNumber", theField);
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
            boolean theFieldIsSet = this.isSetInstruction();
            String theField;
            theField = this.getInstruction();
            strategy.appendField(locator, this, "instruction", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDuration();
            String theField;
            theField = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = true;
            int theField;
            theField = this.getStepNumber();
            strategy.appendField(locator, this, "stepNumber", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
