
package org.example.biscuits;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for ChocolateBiscuit complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ChocolateBiscuit">
 *   <complexContent>
 *     <extension base="{http://example.org/biscuits}AbstractBiscuit">
 *       <sequence>
 *         <element name="cocoaContent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChocolateBiscuit", propOrder = {
    "cocoaContent"
})
@Entity(name = "ChocolateBiscuit")
@Table(name = "CHOCOLATE_BISCUIT")
public class ChocolateBiscuit
    extends AbstractBiscuit
    implements Serializable
{

    private static final long serialVersionUID = 20250909L;
    protected int cocoaContent;

    /**
     * Gets the value of the cocoaContent property.
     * 
     */
    @Basic
    @Column(name = "COCOA_CONTENT", precision = 10, scale = 0)
    public int getCocoaContent() {
        return cocoaContent;
    }

    /**
     * Sets the value of the cocoaContent property.
     * 
     */
    public void setCocoaContent(int value) {
        this.cocoaContent = value;
    }

    @Transient
    public boolean isSetCocoaContent() {
        return true;
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
        final ChocolateBiscuit that = ((ChocolateBiscuit) object);
        {
            boolean lhsFieldIsSet = true;
            boolean rhsFieldIsSet = true;
            int lhsField;
            lhsField = this.getCocoaContent();
            int rhsField;
            rhsField = that.getCocoaContent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "cocoaContent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "cocoaContent", rhsField);
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
            boolean theFieldIsSet = true;
            int theField;
            theField = this.getCocoaContent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "cocoaContent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = true;
            int theField;
            theField = this.getCocoaContent();
            strategy.appendField(locator, this, "cocoaContent", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
