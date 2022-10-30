
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaperSizeV1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaperSizeV1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Letter85x11"/&gt;
 *     &lt;enumeration value="LabelSize"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaperSizeV1")
@XmlEnum
public enum PaperSizeV1 {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Letter85x11")
    LETTER_85_X_11("Letter85x11"),
    @XmlEnumValue("LabelSize")
    LABEL_SIZE("LabelSize");
    private final String value;

    PaperSizeV1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaperSizeV1 fromValue(String v) {
        for (PaperSizeV1 c: PaperSizeV1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
