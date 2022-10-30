
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PickupCarrier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PickupCarrier"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Usps"/&gt;
 *     &lt;enumeration value="Dhl"/&gt;
 *     &lt;enumeration value="Ups"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PickupCarrier")
@XmlEnum
public enum PickupCarrier {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Usps")
    USPS("Usps"),
    @XmlEnumValue("Dhl")
    DHL("Dhl"),
    @XmlEnumValue("Ups")
    UPS("Ups");
    private final String value;

    PickupCarrier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PickupCarrier fromValue(String v) {
        for (PickupCarrier c: PickupCarrier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
