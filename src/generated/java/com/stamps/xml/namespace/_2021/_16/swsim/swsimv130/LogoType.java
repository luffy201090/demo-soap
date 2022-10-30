
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LogoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Image"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LogoType")
@XmlEnum
public enum LogoType {

    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Text")
    TEXT("Text");
    private final String value;

    LogoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogoType fromValue(String v) {
        for (LogoType c: LogoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
