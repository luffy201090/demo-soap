
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoneVerificationOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PhoneVerificationOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SMS"/&gt;
 *     &lt;enumeration value="Voice"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PhoneVerificationOption")
@XmlEnum
public enum PhoneVerificationOption {

    SMS("SMS"),
    @XmlEnumValue("Voice")
    VOICE("Voice");
    private final String value;

    PhoneVerificationOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhoneVerificationOption fromValue(String v) {
        for (PhoneVerificationOption c: PhoneVerificationOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
