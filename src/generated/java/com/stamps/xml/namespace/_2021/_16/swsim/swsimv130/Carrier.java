
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Carrier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Carrier"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="USPS"/&gt;
 *     &lt;enumeration value="FedEx"/&gt;
 *     &lt;enumeration value="DHLExpress"/&gt;
 *     &lt;enumeration value="UPS"/&gt;
 *     &lt;enumeration value="CanadaPost"/&gt;
 *     &lt;enumeration value="DhlECommerce"/&gt;
 *     &lt;enumeration value="Zorbit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Carrier")
@XmlEnum
public enum Carrier {

    @XmlEnumValue("All")
    ALL("All"),
    USPS("USPS"),
    @XmlEnumValue("FedEx")
    FED_EX("FedEx"),
    @XmlEnumValue("DHLExpress")
    DHL_EXPRESS("DHLExpress"),
    UPS("UPS"),
    @XmlEnumValue("CanadaPost")
    CANADA_POST("CanadaPost"),
    @XmlEnumValue("DhlECommerce")
    DHL_E_COMMERCE("DhlECommerce"),
    @XmlEnumValue("Zorbit")
    ZORBIT("Zorbit");
    private final String value;

    Carrier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Carrier fromValue(String v) {
        for (Carrier c: Carrier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
