
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnclosedPackageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EnclosedPackageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Letters"/&gt;
 *     &lt;enumeration value="Flats"/&gt;
 *     &lt;enumeration value="Irregular Parcels"/&gt;
 *     &lt;enumeration value="Machinable Parcels"/&gt;
 *     &lt;enumeration value="Non-Machinable Parcels"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnclosedPackageType")
@XmlEnum
public enum EnclosedPackageType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Letters")
    LETTERS("Letters"),
    @XmlEnumValue("Flats")
    FLATS("Flats"),
    @XmlEnumValue("Irregular Parcels")
    IRREGULAR_PARCELS("Irregular Parcels"),
    @XmlEnumValue("Machinable Parcels")
    MACHINABLE_PARCELS("Machinable Parcels"),
    @XmlEnumValue("Non-Machinable Parcels")
    NON_MACHINABLE_PARCELS("Non-Machinable Parcels");
    private final String value;

    EnclosedPackageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnclosedPackageType fromValue(String v) {
        for (EnclosedPackageType c: EnclosedPackageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
