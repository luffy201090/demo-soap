
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarrierPickupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CarrierPickupType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="AutoPickup"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CarrierPickupType")
@XmlEnum
public enum CarrierPickupType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("AutoPickup")
    AUTO_PICKUP("AutoPickup");
    private final String value;

    CarrierPickupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarrierPickupType fromValue(String v) {
        for (CarrierPickupType c: CarrierPickupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
