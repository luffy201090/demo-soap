
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreShippingMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="StoreShippingMethodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Basic"/&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Expedited"/&gt;
 *     &lt;enumeration value="Rush"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StoreShippingMethodType")
@XmlEnum
public enum StoreShippingMethodType {

    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Expedited")
    EXPEDITED("Expedited"),
    @XmlEnumValue("Rush")
    RUSH("Rush");
    private final String value;

    StoreShippingMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoreShippingMethodType fromValue(String v) {
        for (StoreShippingMethodType c: StoreShippingMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
