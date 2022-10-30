
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Theme.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Theme"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Light"/&gt;
 *     &lt;enumeration value="Dark"/&gt;
 *     &lt;enumeration value="Peach"/&gt;
 *     &lt;enumeration value="Multicolor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Theme")
@XmlEnum
public enum Theme {

    @XmlEnumValue("Light")
    LIGHT("Light"),
    @XmlEnumValue("Dark")
    DARK("Dark"),
    @XmlEnumValue("Peach")
    PEACH("Peach"),
    @XmlEnumValue("Multicolor")
    MULTICOLOR("Multicolor");
    private final String value;

    Theme(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Theme fromValue(String v) {
        for (Theme c: Theme.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
