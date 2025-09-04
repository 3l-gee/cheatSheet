
package org.example.root_header;

import java.io.Serializable;
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
 *         <element name="Sensing_Start_Time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Sensing_Stop_Time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="List_of_Acquisitions">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Acquisition" type="{http://example.org/root_header}AcquisitionType" maxOccurs="unbounded"/>
 *                 </sequence>
 *                 <attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="List_Of_Dumps" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Dump" type="{http://example.org/root_header}DumpType" maxOccurs="unbounded"/>
 *                 </sequence>
 *                 <attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sensingStartTime",
    "sensingStopTime",
    "listOfAcquisitions",
    "listOfDumps"
})
@Entity(name = "DataBlock")
@Table(name = "DATA_BLOCK")
public class DataBlock implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20240501L;
    @XmlElement(name = "Sensing_Start_Time", required = true)
    protected String sensingStartTime;
    @XmlElement(name = "Sensing_Stop_Time", required = true)
    protected String sensingStopTime;
    @XmlElement(name = "List_of_Acquisitions", required = true)
    protected ListOfAcquisitions listOfAcquisitions;
    @XmlElement(name = "List_Of_Dumps")
    protected ListOfDumps listOfDumps;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the sensingStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SENSING_START_TIME", length = 255)
    public String getSensingStartTime() {
        return sensingStartTime;
    }

    /**
     * Sets the value of the sensingStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensingStartTime(String value) {
        this.sensingStartTime = value;
    }

    @Transient
    public boolean isSetSensingStartTime() {
        return (this.sensingStartTime!= null);
    }

    /**
     * Gets the value of the sensingStopTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SENSING_STOP_TIME", length = 255)
    public String getSensingStopTime() {
        return sensingStopTime;
    }

    /**
     * Sets the value of the sensingStopTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensingStopTime(String value) {
        this.sensingStopTime = value;
    }

    @Transient
    public boolean isSetSensingStopTime() {
        return (this.sensingStopTime!= null);
    }

    /**
     * Gets the value of the listOfAcquisitions property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAcquisitions }
     *     
     */
    @ManyToOne(targetEntity = ListOfAcquisitions.class, cascade = {
        CascadeType.REFRESH,
        CascadeType.DETACH,
        CascadeType.MERGE,
        CascadeType.PERSIST
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "LIST_OF_ACQUISITIONS_DATA_BL_0")
    public ListOfAcquisitions getListOfAcquisitions() {
        return listOfAcquisitions;
    }

    /**
     * Sets the value of the listOfAcquisitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAcquisitions }
     *     
     */
    public void setListOfAcquisitions(ListOfAcquisitions value) {
        this.listOfAcquisitions = value;
    }

    @Transient
    public boolean isSetListOfAcquisitions() {
        return (this.listOfAcquisitions!= null);
    }

    /**
     * Gets the value of the listOfDumps property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDumps }
     *     
     */
    @ManyToOne(targetEntity = ListOfDumps.class, cascade = {
        CascadeType.REFRESH,
        CascadeType.DETACH,
        CascadeType.MERGE,
        CascadeType.PERSIST
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "LIST_OF_DUMPS_DATA_BLOCK_HJID")
    public ListOfDumps getListOfDumps() {
        return listOfDumps;
    }

    /**
     * Sets the value of the listOfDumps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDumps }
     *     
     */
    public void setListOfDumps(ListOfDumps value) {
        this.listOfDumps = value;
    }

    @Transient
    public boolean isSetListOfDumps() {
        return (this.listOfDumps!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TYPE_", length = 255)
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
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
        final DataBlock that = ((DataBlock) object);
        {
            boolean lhsFieldIsSet = this.isSetSensingStartTime();
            boolean rhsFieldIsSet = that.isSetSensingStartTime();
            String lhsField;
            lhsField = this.getSensingStartTime();
            String rhsField;
            rhsField = that.getSensingStartTime();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sensingStartTime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sensingStartTime", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetListOfAcquisitions();
            boolean rhsFieldIsSet = that.isSetListOfAcquisitions();
            ListOfAcquisitions lhsField;
            lhsField = this.getListOfAcquisitions();
            ListOfAcquisitions rhsField;
            rhsField = that.getListOfAcquisitions();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "listOfAcquisitions", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "listOfAcquisitions", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetListOfDumps();
            boolean rhsFieldIsSet = that.isSetListOfDumps();
            ListOfDumps lhsField;
            lhsField = this.getListOfDumps();
            ListOfDumps rhsField;
            rhsField = that.getListOfDumps();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "listOfDumps", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "listOfDumps", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            String lhsField;
            lhsField = this.getType();
            String rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSensingStopTime();
            boolean rhsFieldIsSet = that.isSetSensingStopTime();
            String lhsField;
            lhsField = this.getSensingStopTime();
            String rhsField;
            rhsField = that.getSensingStopTime();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sensingStopTime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sensingStopTime", rhsField);
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
            boolean theFieldIsSet = this.isSetSensingStartTime();
            String theField;
            theField = this.getSensingStartTime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sensingStartTime", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSensingStopTime();
            String theField;
            theField = this.getSensingStopTime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sensingStopTime", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetListOfAcquisitions();
            ListOfAcquisitions theField;
            theField = this.getListOfAcquisitions();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "listOfAcquisitions", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetListOfDumps();
            ListOfDumps theField;
            theField = this.getListOfDumps();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "listOfDumps", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            String theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
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
            boolean theFieldIsSet = this.isSetSensingStartTime();
            String theField;
            theField = this.getSensingStartTime();
            strategy.appendField(locator, this, "sensingStartTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSensingStopTime();
            String theField;
            theField = this.getSensingStopTime();
            strategy.appendField(locator, this, "sensingStopTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetListOfAcquisitions();
            ListOfAcquisitions theField;
            theField = this.getListOfAcquisitions();
            strategy.appendField(locator, this, "listOfAcquisitions", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetListOfDumps();
            ListOfDumps theField;
            theField = this.getListOfDumps();
            strategy.appendField(locator, this, "listOfDumps", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            String theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
