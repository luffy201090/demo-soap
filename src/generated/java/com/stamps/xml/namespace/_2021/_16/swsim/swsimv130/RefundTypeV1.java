
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundTypeV1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RefundTypeV1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="E-refund"/&gt;
 *     &lt;enumeration value="Mail-in"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RefundTypeV1")
@XmlEnum
public enum RefundTypeV1 {

    @XmlEnumValue("E-refund")
    E_REFUND("E-refund"),
    @XmlEnumValue("Mail-in")
    MAIL_IN("Mail-in");
    private final String value;

    RefundTypeV1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundTypeV1 fromValue(String v) {
        for (RefundTypeV1 c: RefundTypeV1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
