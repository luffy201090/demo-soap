
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatesetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RatesetType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Retail"/&gt;
 *     &lt;enumeration value="CBP"/&gt;
 *     &lt;enumeration value="CPP"/&gt;
 *     &lt;enumeration value="NSA"/&gt;
 *     &lt;enumeration value="STMP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RatesetType")
@XmlEnum
public enum RatesetType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Retail")
    RETAIL("Retail"),
    CBP("CBP"),
    CPP("CPP"),
    NSA("NSA"),
    STMP("STMP");
    private final String value;

    RatesetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RatesetType fromValue(String v) {
        for (RatesetType c: RatesetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
