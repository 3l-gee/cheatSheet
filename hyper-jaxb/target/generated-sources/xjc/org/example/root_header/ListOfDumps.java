
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
 *         <element name="Dump" type="{http://example.org/root_header}DumpType" maxOccurs="unbounded"/>
 *       </sequence>
 *       <attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dump"
})
@Entity(name = "ListOfDumps")
@Table(name = "LIST_OF_DUMPS")
public class ListOfDumps implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20240501L;
    @XmlElement(name = "Dump", required = true)
    protected List<DumpType> dump;
    @XmlAttribute(name = "count", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String count;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the dump property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dump property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDump().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DumpType }
     * 
     * 
     */
    @OneToMany(targetEntity = DumpType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "DUMP_LIST_OF_DUMPS_HJID")
    public List<DumpType> getDump() {
        if (dump == null) {
            dump = new ArrayList<>();
        }
        return this.dump;
    }

    /**
     * 
     * 
     */
    public void setDump(List<DumpType> dump) {
        this.dump = dump;
    }

    @Transient
    public boolean isSetDump() {
        return ((this.dump!= null)&&(!this.dump.isEmpty()));
    }

    public void unsetDump() {
        this.dump = null;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "COUNT_")
    public String getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(String value) {
        this.count = value;
    }

    @Transient
    public boolean isSetCount() {
        return (this.count!= null);
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
        final ListOfDumps that = ((ListOfDumps) object);
        {
            boolean lhsFieldIsSet = this.isSetDump();
            boolean rhsFieldIsSet = that.isSetDump();
            List<DumpType> lhsField;
            lhsField = (this.isSetDump()?this.getDump():null);
            List<DumpType> rhsField;
            rhsField = (that.isSetDump()?that.getDump():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dump", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dump", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCount();
            boolean rhsFieldIsSet = that.isSetCount();
            String lhsField;
            lhsField = this.getCount();
            String rhsField;
            rhsField = that.getCount();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "count", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "count", rhsField);
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
            boolean theFieldIsSet = this.isSetDump();
            List<DumpType> theField;
            theField = (this.isSetDump()?this.getDump():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dump", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCount();
            String theField;
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
            boolean theFieldIsSet = this.isSetDump();
            List<DumpType> theField;
            theField = (this.isSetDump()?this.getDump():null);
            strategy.appendField(locator, this, "dump", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCount();
            String theField;
            theField = this.getCount();
            strategy.appendField(locator, this, "count", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
