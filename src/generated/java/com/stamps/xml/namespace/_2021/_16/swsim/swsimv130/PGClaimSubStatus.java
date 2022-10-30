
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PGClaimSubStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PGClaimSubStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="RecipientDeniedClaim"/&gt;
 *     &lt;enumeration value="InvalidProofOfValue"/&gt;
 *     &lt;enumeration value="InvalidProofOfDamage"/&gt;
 *     &lt;enumeration value="InvalidProofOfLoss"/&gt;
 *     &lt;enumeration value="InvalidProofOfValueAndDamage"/&gt;
 *     &lt;enumeration value="InvalidProofOfValueAndLoss"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *     &lt;enumeration value="Paid"/&gt;
 *     &lt;enumeration value="PendingPayment"/&gt;
 *     &lt;enumeration value="ClaimExpired"/&gt;
 *     &lt;enumeration value="ByCustomer"/&gt;
 *     &lt;enumeration value="ByAgent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PGClaimSubStatus")
@XmlEnum
public enum PGClaimSubStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("RecipientDeniedClaim")
    RECIPIENT_DENIED_CLAIM("RecipientDeniedClaim"),
    @XmlEnumValue("InvalidProofOfValue")
    INVALID_PROOF_OF_VALUE("InvalidProofOfValue"),
    @XmlEnumValue("InvalidProofOfDamage")
    INVALID_PROOF_OF_DAMAGE("InvalidProofOfDamage"),
    @XmlEnumValue("InvalidProofOfLoss")
    INVALID_PROOF_OF_LOSS("InvalidProofOfLoss"),
    @XmlEnumValue("InvalidProofOfValueAndDamage")
    INVALID_PROOF_OF_VALUE_AND_DAMAGE("InvalidProofOfValueAndDamage"),
    @XmlEnumValue("InvalidProofOfValueAndLoss")
    INVALID_PROOF_OF_VALUE_AND_LOSS("InvalidProofOfValueAndLoss"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Paid")
    PAID("Paid"),
    @XmlEnumValue("PendingPayment")
    PENDING_PAYMENT("PendingPayment"),
    @XmlEnumValue("ClaimExpired")
    CLAIM_EXPIRED("ClaimExpired"),
    @XmlEnumValue("ByCustomer")
    BY_CUSTOMER("ByCustomer"),
    @XmlEnumValue("ByAgent")
    BY_AGENT("ByAgent");
    private final String value;

    PGClaimSubStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PGClaimSubStatus fromValue(String v) {
        for (PGClaimSubStatus c: PGClaimSubStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
