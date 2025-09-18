
package org.example.biscuits;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for BiscuitShape</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BiscuitShape">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ROUND"/>
 *     <enumeration value="SQUARE"/>
 *     <enumeration value="STAR"/>
 *     <enumeration value="HEART"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BiscuitShape")
@XmlEnum
public enum BiscuitShape {

    ROUND,
    SQUARE,
    STAR,
    HEART;

    public String value() {
        return name();
    }

    public static BiscuitShape fromValue(String v) {
        return valueOf(v);
    }

}
