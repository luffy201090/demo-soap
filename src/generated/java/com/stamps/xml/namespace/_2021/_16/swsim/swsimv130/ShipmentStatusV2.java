
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentStatusV2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipmentStatusV2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Printed"/&gt;
 *     &lt;enumeration value="In Transit"/&gt;
 *     &lt;enumeration value="Received at Opening Unit"/&gt;
 *     &lt;enumeration value="Delivered"/&gt;
 *     &lt;enumeration value="Pending Refund"/&gt;
 *     &lt;enumeration value="Refunded"/&gt;
 *     &lt;enumeration value="Voided"/&gt;
 *     &lt;enumeration value="Unprinted"/&gt;
 *     &lt;enumeration value="Expired"/&gt;
 *     &lt;enumeration value="Recipient Action Required"/&gt;
 *     &lt;enumeration value="Action Required"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipmentStatusV2")
@XmlEnum
public enum ShipmentStatusV2 {

    @XmlEnumValue("Printed")
    PRINTED("Printed"),
    @XmlEnumValue("In Transit")
    IN_TRANSIT("In Transit"),
    @XmlEnumValue("Received at Opening Unit")
    RECEIVED_AT_OPENING_UNIT("Received at Opening Unit"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("Pending Refund")
    PENDING_REFUND("Pending Refund"),
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded"),
    @XmlEnumValue("Voided")
    VOIDED("Voided"),
    @XmlEnumValue("Unprinted")
    UNPRINTED("Unprinted"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("Recipient Action Required")
    RECIPIENT_ACTION_REQUIRED("Recipient Action Required"),
    @XmlEnumValue("Action Required")
    ACTION_REQUIRED("Action Required");
    private final String value;

    ShipmentStatusV2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShipmentStatusV2 fromValue(String v) {
        for (ShipmentStatusV2 c: ShipmentStatusV2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
