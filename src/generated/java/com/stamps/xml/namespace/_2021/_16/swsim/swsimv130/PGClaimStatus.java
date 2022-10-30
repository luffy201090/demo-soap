
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PGClaimStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PGClaimStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Received"/&gt;
 *     &lt;enumeration value="PendingRecipientVerification"/&gt;
 *     &lt;enumeration value="PendingAdditionalInfo"/&gt;
 *     &lt;enumeration value="PendingReview"/&gt;
 *     &lt;enumeration value="Approved"/&gt;
 *     &lt;enumeration value="Closed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PGClaimStatus")
@XmlEnum
public enum PGClaimStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Received")
    RECEIVED("Received"),
    @XmlEnumValue("PendingRecipientVerification")
    PENDING_RECIPIENT_VERIFICATION("PendingRecipientVerification"),
    @XmlEnumValue("PendingAdditionalInfo")
    PENDING_ADDITIONAL_INFO("PendingAdditionalInfo"),
    @XmlEnumValue("PendingReview")
    PENDING_REVIEW("PendingReview"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Closed")
    CLOSED("Closed");
    private final String value;

    PGClaimStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PGClaimStatus fromValue(String v) {
        for (PGClaimStatus c: PGClaimStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
