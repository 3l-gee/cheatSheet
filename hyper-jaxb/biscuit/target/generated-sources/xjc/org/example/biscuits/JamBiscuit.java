
package org.example.biscuits;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for JamBiscuit complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="JamBiscuit">
 *   <complexContent>
 *     <extension base="{http://example.org/biscuits}AbstractBiscuit">
 *       <sequence>
 *         <element name="jamFlavor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JamBiscuit", propOrder = {
    "jamFlavor"
})
@Entity(name = "JamBiscuit")
@Table(name = "JAM_BISCUIT")
public class JamBiscuit
    extends AbstractBiscuit
    implements Serializable
{

    private static final long serialVersionUID = 20250909L;
    @XmlElement(required = true)
    protected String jamFlavor;

    /**
     * Gets the value of the jamFlavor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "JAM_FLAVOR", length = 255)
    public String getJamFlavor() {
        return jamFlavor;
    }

    /**
     * Sets the value of the jamFlavor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJamFlavor(String value) {
        this.jamFlavor = value;
    }

    @Transient
    public boolean isSetJamFlavor() {
        return (this.jamFlavor!= null);
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final JamBiscuit that = ((JamBiscuit) object);
        {
            boolean lhsFieldIsSet = this.isSetJamFlavor();
            boolean rhsFieldIsSet = that.isSetJamFlavor();
            String lhsField;
            lhsField = this.getJamFlavor();
            String rhsField;
            rhsField = that.getJamFlavor();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "jamFlavor", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "jamFlavor", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetJamFlavor();
            String theField;
            theField = this.getJamFlavor();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "jamFlavor", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetJamFlavor();
            String theField;
            theField = this.getJamFlavor();
            strategy.appendField(locator, this, "jamFlavor", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
