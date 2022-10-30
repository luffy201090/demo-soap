
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortTypeV1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SortTypeV1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="FiveDigit"/&gt;
 *     &lt;enumeration value="ThreeDigit"/&gt;
 *     &lt;enumeration value="NDC"/&gt;
 *     &lt;enumeration value="SCF"/&gt;
 *     &lt;enumeration value="MixedNDC"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SortTypeV1")
@XmlEnum
public enum SortTypeV1 {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("FiveDigit")
    FIVE_DIGIT("FiveDigit"),
    @XmlEnumValue("ThreeDigit")
    THREE_DIGIT("ThreeDigit"),
    NDC("NDC"),
    SCF("SCF"),
    @XmlEnumValue("MixedNDC")
    MIXED_NDC("MixedNDC"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SortTypeV1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortTypeV1 fromValue(String v) {
        for (SortTypeV1 c: SortTypeV1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
