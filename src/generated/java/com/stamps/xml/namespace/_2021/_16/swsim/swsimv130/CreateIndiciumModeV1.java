
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateIndiciumModeV1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CreateIndiciumModeV1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Sample"/&gt;
 *     &lt;enumeration value="NoPostage"/&gt;
 *     &lt;enumeration value="Preview"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreateIndiciumModeV1")
@XmlEnum
public enum CreateIndiciumModeV1 {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Sample")
    SAMPLE("Sample"),
    @XmlEnumValue("NoPostage")
    NO_POSTAGE("NoPostage"),
    @XmlEnumValue("Preview")
    PREVIEW("Preview");
    private final String value;

    CreateIndiciumModeV1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreateIndiciumModeV1 fromValue(String v) {
        for (CreateIndiciumModeV1 c: CreateIndiciumModeV1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
