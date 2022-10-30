
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetStampsImageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NetStampsImageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Base"/&gt;
 *     &lt;enumeration value="Special"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetStampsImageType")
@XmlEnum
public enum NetStampsImageType {

    @XmlEnumValue("Base")
    BASE("Base"),
    @XmlEnumValue("Special")
    SPECIAL("Special");
    private final String value;

    NetStampsImageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetStampsImageType fromValue(String v) {
        for (NetStampsImageType c: NetStampsImageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
