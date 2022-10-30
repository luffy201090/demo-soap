
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarrierPickupLocationV1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CarrierPickupLocationV1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FrontDoor"/&gt;
 *     &lt;enumeration value="BackDoor"/&gt;
 *     &lt;enumeration value="SideDoor"/&gt;
 *     &lt;enumeration value="KnockOnDoorOrRingBell"/&gt;
 *     &lt;enumeration value="MailRoom"/&gt;
 *     &lt;enumeration value="Office"/&gt;
 *     &lt;enumeration value="Reception"/&gt;
 *     &lt;enumeration value="InOrAtMailbox"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CarrierPickupLocationV1")
@XmlEnum
public enum CarrierPickupLocationV1 {

    @XmlEnumValue("FrontDoor")
    FRONT_DOOR("FrontDoor"),
    @XmlEnumValue("BackDoor")
    BACK_DOOR("BackDoor"),
    @XmlEnumValue("SideDoor")
    SIDE_DOOR("SideDoor"),
    @XmlEnumValue("KnockOnDoorOrRingBell")
    KNOCK_ON_DOOR_OR_RING_BELL("KnockOnDoorOrRingBell"),
    @XmlEnumValue("MailRoom")
    MAIL_ROOM("MailRoom"),
    @XmlEnumValue("Office")
    OFFICE("Office"),
    @XmlEnumValue("Reception")
    RECEPTION("Reception"),
    @XmlEnumValue("InOrAtMailbox")
    IN_OR_AT_MAILBOX("InOrAtMailbox"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CarrierPickupLocationV1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarrierPickupLocationV1 fromValue(String v) {
        for (CarrierPickupLocationV1 c: CarrierPickupLocationV1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
