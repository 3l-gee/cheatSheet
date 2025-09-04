
package org.example.root_header;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Acquisition" type="{http://example.org/root_header}AcquisitionType" maxOccurs="unbounded"/>
 *       </sequence>
 *       <attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "acquisition"
})
@Entity(name = "ListOfAcquisitions")
@Table(name = "LIST_OF_ACQUISITIONS")
public class ListOfAcquisitions implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20240501L;
    @XmlElement(name = "Acquisition", required = true)
    protected List<AcquisitionType> acquisition;
    @XmlAttribute(name = "count", required = true)
    protected int count;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the acquisition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acquisition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcquisition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcquisitionType }
     * 
     * 
     */
    @OneToMany(targetEntity = AcquisitionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "ACQUISITION_LIST_OF_ACQUISIT_0")
    public List<AcquisitionType> getAcquisition() {
        if (acquisition == null) {
            acquisition = new ArrayList<>();
        }
        return this.acquisition;
    }

    /**
     * 
     * 
     */
    public void setAcquisition(List<AcquisitionType> acquisition) {
        this.acquisition = acquisition;
    }

    @Transient
    public boolean isSetAcquisition() {
        return ((this.acquisition!= null)&&(!this.acquisition.isEmpty()));
    }

    public void unsetAcquisition() {
        this.acquisition = null;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    @Basic
    @Column(name = "COUNT_", precision = 10, scale = 0)
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    @Transient
    public boolean isSetCount() {
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
        final ListOfAcquisitions that = ((ListOfAcquisitions) object);
        {
            boolean lhsFieldIsSet = true;
            boolean rhsFieldIsSet = true;
            int lhsField;
            lhsField = this.getCount();
            int rhsField;
            rhsField = that.getCount();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "count", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "count", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAcquisition();
            boolean rhsFieldIsSet = that.isSetAcquisition();
            List<AcquisitionType> lhsField;
            lhsField = (this.isSetAcquisition()?this.getAcquisition():null);
            List<AcquisitionType> rhsField;
            rhsField = (that.isSetAcquisition()?that.getAcquisition():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "acquisition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "acquisition", rhsField);
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
            boolean theFieldIsSet = this.isSetAcquisition();
            List<AcquisitionType> theField;
            theField = (this.isSetAcquisition()?this.getAcquisition():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "acquisition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = true;
            int theField;
            theField = this.getCount();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "count", theField);
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
            boolean theFieldIsSet = this.isSetAcquisition();
            List<AcquisitionType> theField;
            theField = (this.isSetAcquisition()?this.getAcquisition():null);
            strategy.appendField(locator, this, "acquisition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = true;
            int theField;
            theField = this.getCount();
            strategy.appendField(locator, this, "count", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
