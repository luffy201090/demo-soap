
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressVerificationLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AddressVerificationLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Partial"/&gt;
 *     &lt;enumeration value="Maximum"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AddressVerificationLevel")
@XmlEnum
public enum AddressVerificationLevel {

    @XmlEnumValue("Partial")
    PARTIAL("Partial"),
    @XmlEnumValue("Maximum")
    MAXIMUM("Maximum"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    AddressVerificationLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressVerificationLevel fromValue(String v) {
        for (AddressVerificationLevel c: AddressVerificationLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
