
package com.stamps.xml.namespace._2014._3.addressservicev2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RangeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Even"/&gt;
 *     &lt;enumeration value="Odd"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RangeType")
@XmlEnum
public enum RangeType {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Even")
    EVEN("Even"),
    @XmlEnumValue("Odd")
    ODD("Odd");
    private final String value;

    RangeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RangeType fromValue(String v) {
        for (RangeType c: RangeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
