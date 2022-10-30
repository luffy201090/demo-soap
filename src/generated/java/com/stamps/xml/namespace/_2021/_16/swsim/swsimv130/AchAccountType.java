
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AchAccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AchAccountType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Checking"/&gt;
 *     &lt;enumeration value="Savings"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AchAccountType")
@XmlEnum
public enum AchAccountType {

    @XmlEnumValue("Checking")
    CHECKING("Checking"),
    @XmlEnumValue("Savings")
    SAVINGS("Savings");
    private final String value;

    AchAccountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AchAccountType fromValue(String v) {
        for (AchAccountType c: AchAccountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
