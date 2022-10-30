
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostageMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PostageMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="NoPostage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PostageMode")
@XmlEnum
public enum PostageMode {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("NoPostage")
    NO_POSTAGE("NoPostage");
    private final String value;

    PostageMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PostageMode fromValue(String v) {
        for (PostageMode c: PostageMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
