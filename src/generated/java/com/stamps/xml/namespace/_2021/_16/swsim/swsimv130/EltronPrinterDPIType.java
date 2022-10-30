
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EltronPrinterDPIType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EltronPrinterDPIType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="High"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EltronPrinterDPIType")
@XmlEnum
public enum EltronPrinterDPIType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("High")
    HIGH("High");
    private final String value;

    EltronPrinterDPIType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EltronPrinterDPIType fromValue(String v) {
        for (EltronPrinterDPIType c: EltronPrinterDPIType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
