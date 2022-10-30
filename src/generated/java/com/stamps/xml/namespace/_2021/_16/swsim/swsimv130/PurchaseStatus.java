
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PurchaseStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Processing"/&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurchaseStatus")
@XmlEnum
public enum PurchaseStatus {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Processing")
    PROCESSING("Processing"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    PurchaseStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchaseStatus fromValue(String v) {
        for (PurchaseStatus c: PurchaseStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
