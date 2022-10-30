
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TransactionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Purchase"/&gt;
 *     &lt;enumeration value="Credit"/&gt;
 *     &lt;enumeration value="Print"/&gt;
 *     &lt;enumeration value="Adjustment"/&gt;
 *     &lt;enumeration value="Refund"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionType")
@XmlEnum
public enum TransactionType {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Purchase")
    PURCHASE("Purchase"),
    @XmlEnumValue("Credit")
    CREDIT("Credit"),
    @XmlEnumValue("Print")
    PRINT("Print"),
    @XmlEnumValue("Adjustment")
    ADJUSTMENT("Adjustment"),
    @XmlEnumValue("Refund")
    REFUND("Refund");
    private final String value;

    TransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionType fromValue(String v) {
        for (TransactionType c: TransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
