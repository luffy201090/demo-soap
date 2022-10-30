
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Merchant.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Merchant"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Stamps"/&gt;
 *     &lt;enumeration value="ShipWorks"/&gt;
 *     &lt;enumeration value="ShipStation"/&gt;
 *     &lt;enumeration value="Endicia"/&gt;
 *     &lt;enumeration value="GlobalPost"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Merchant")
@XmlEnum
public enum Merchant {

    @XmlEnumValue("Stamps")
    STAMPS("Stamps"),
    @XmlEnumValue("ShipWorks")
    SHIP_WORKS("ShipWorks"),
    @XmlEnumValue("ShipStation")
    SHIP_STATION("ShipStation"),
    @XmlEnumValue("Endicia")
    ENDICIA("Endicia"),
    @XmlEnumValue("GlobalPost")
    GLOBAL_POST("GlobalPost");
    private final String value;

    Merchant(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Merchant fromValue(String v) {
        for (Merchant c: Merchant.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
