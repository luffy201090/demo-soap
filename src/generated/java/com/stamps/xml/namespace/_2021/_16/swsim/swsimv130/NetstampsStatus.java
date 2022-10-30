
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetstampsStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NetstampsStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="PartialSuccess"/&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetstampsStatus")
@XmlEnum
public enum NetstampsStatus {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("PartialSuccess")
    PARTIAL_SUCCESS("PartialSuccess"),
    @XmlEnumValue("Failed")
    FAILED("Failed");
    private final String value;

    NetstampsStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetstampsStatus fromValue(String v) {
        for (NetstampsStatus c: NetstampsStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
