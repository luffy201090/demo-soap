
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntryFacilityV1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EntryFacilityV1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="DDU"/&gt;
 *     &lt;enumeration value="ADC"/&gt;
 *     &lt;enumeration value="ASF"/&gt;
 *     &lt;enumeration value="NDC"/&gt;
 *     &lt;enumeration value="SCF"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntryFacilityV1")
@XmlEnum
public enum EntryFacilityV1 {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("None")
    NONE("None"),
    DDU("DDU"),
    ADC("ADC"),
    ASF("ASF"),
    NDC("NDC"),
    SCF("SCF"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    EntryFacilityV1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntryFacilityV1 fromValue(String v) {
        for (EntryFacilityV1 c: EntryFacilityV1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
