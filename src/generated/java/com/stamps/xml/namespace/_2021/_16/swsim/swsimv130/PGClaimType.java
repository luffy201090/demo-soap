
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PGClaimType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PGClaimType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Damaged"/&gt;
 *     &lt;enumeration value="Lost"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PGClaimType")
@XmlEnum
public enum PGClaimType {

    @XmlEnumValue("Damaged")
    DAMAGED("Damaged"),
    @XmlEnumValue("Lost")
    LOST("Lost");
    private final String value;

    PGClaimType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PGClaimType fromValue(String v) {
        for (PGClaimType c: PGClaimType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
