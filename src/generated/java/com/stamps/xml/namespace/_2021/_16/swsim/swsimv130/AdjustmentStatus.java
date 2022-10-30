
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustmentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AdjustmentStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NoAdjustment"/&gt;
 *     &lt;enumeration value="Processed"/&gt;
 *     &lt;enumeration value="Refunded"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdjustmentStatus")
@XmlEnum
public enum AdjustmentStatus {

    @XmlEnumValue("NoAdjustment")
    NO_ADJUSTMENT("NoAdjustment"),
    @XmlEnumValue("Processed")
    PROCESSED("Processed"),
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded");
    private final String value;

    AdjustmentStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdjustmentStatus fromValue(String v) {
        for (AdjustmentStatus c: AdjustmentStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
