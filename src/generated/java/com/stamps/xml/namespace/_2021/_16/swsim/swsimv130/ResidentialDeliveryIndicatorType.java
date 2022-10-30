
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResidentialDeliveryIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ResidentialDeliveryIndicatorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Yes"/&gt;
 *     &lt;enumeration value="No"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Unsupported"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResidentialDeliveryIndicatorType")
@XmlEnum
public enum ResidentialDeliveryIndicatorType {

    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported");
    private final String value;

    ResidentialDeliveryIndicatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResidentialDeliveryIndicatorType fromValue(String v) {
        for (ResidentialDeliveryIndicatorType c: ResidentialDeliveryIndicatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
