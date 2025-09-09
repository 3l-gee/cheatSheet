
package org.example.biscuits;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for FlourType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="FlourType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WHEAT"/>
 *     <enumeration value="RYE"/>
 *     <enumeration value="OAT"/>
 *     <enumeration value="CORN"/>
 *     <enumeration value="GLUTEN_FREE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FlourType")
@XmlEnum
public enum FlourType {

    WHEAT,
    RYE,
    OAT,
    CORN,
    GLUTEN_FREE;

    public String value() {
        return name();
    }

    public static FlourType fromValue(String v) {
        return valueOf(v);
    }

}
