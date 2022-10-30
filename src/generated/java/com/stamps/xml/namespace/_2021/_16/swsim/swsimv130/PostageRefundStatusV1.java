
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostageRefundStatusV1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PostageRefundStatusV1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Processing"/&gt;
 *     &lt;enumeration value="Complete"/&gt;
 *     &lt;enumeration value="Duplicate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PostageRefundStatusV1")
@XmlEnum
public enum PostageRefundStatusV1 {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Processing")
    PROCESSING("Processing"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Duplicate")
    DUPLICATE("Duplicate");
    private final String value;

    PostageRefundStatusV1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PostageRefundStatusV1 fromValue(String v) {
        for (PostageRefundStatusV1 c: PostageRefundStatusV1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
