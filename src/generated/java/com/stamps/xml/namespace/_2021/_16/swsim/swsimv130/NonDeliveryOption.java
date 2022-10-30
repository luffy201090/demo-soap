
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonDeliveryOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NonDeliveryOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Undefined"/&gt;
 *     &lt;enumeration value="Return"/&gt;
 *     &lt;enumeration value="Abandon"/&gt;
 *     &lt;enumeration value="Redirect"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NonDeliveryOption")
@XmlEnum
public enum NonDeliveryOption {

    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("Return")
    RETURN("Return"),
    @XmlEnumValue("Abandon")
    ABANDON("Abandon"),
    @XmlEnumValue("Redirect")
    REDIRECT("Redirect");
    private final String value;

    NonDeliveryOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonDeliveryOption fromValue(String v) {
        for (NonDeliveryOption c: NonDeliveryOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
