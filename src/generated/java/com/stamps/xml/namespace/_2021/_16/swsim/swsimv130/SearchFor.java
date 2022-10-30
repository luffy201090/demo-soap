
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchFor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SearchFor"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Refund"/&gt;
 *     &lt;enumeration value="Adjustments"/&gt;
 *     &lt;enumeration value="ClaimEligibleLostOrDamaged"/&gt;
 *     &lt;enumeration value="ClaimIneligible"/&gt;
 *     &lt;enumeration value="ClaimReceived"/&gt;
 *     &lt;enumeration value="ClaimPendingReview"/&gt;
 *     &lt;enumeration value="ClaimPendingAdditionalInfo"/&gt;
 *     &lt;enumeration value="ClaimApproved"/&gt;
 *     &lt;enumeration value="ClaimRejected"/&gt;
 *     &lt;enumeration value="OutstandingLabels"/&gt;
 *     &lt;enumeration value="PayOnUse"/&gt;
 *     &lt;enumeration value="DHLExpress"/&gt;
 *     &lt;enumeration value="FedEx"/&gt;
 *     &lt;enumeration value="PayOnUseReturn"/&gt;
 *     &lt;enumeration value="ClaimPendingRecipientVerification"/&gt;
 *     &lt;enumeration value="ClaimEligibleDamaged"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchFor")
@XmlEnum
public enum SearchFor {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("Adjustments")
    ADJUSTMENTS("Adjustments"),
    @XmlEnumValue("ClaimEligibleLostOrDamaged")
    CLAIM_ELIGIBLE_LOST_OR_DAMAGED("ClaimEligibleLostOrDamaged"),
    @XmlEnumValue("ClaimIneligible")
    CLAIM_INELIGIBLE("ClaimIneligible"),
    @XmlEnumValue("ClaimReceived")
    CLAIM_RECEIVED("ClaimReceived"),
    @XmlEnumValue("ClaimPendingReview")
    CLAIM_PENDING_REVIEW("ClaimPendingReview"),
    @XmlEnumValue("ClaimPendingAdditionalInfo")
    CLAIM_PENDING_ADDITIONAL_INFO("ClaimPendingAdditionalInfo"),
    @XmlEnumValue("ClaimApproved")
    CLAIM_APPROVED("ClaimApproved"),
    @XmlEnumValue("ClaimRejected")
    CLAIM_REJECTED("ClaimRejected"),
    @XmlEnumValue("OutstandingLabels")
    OUTSTANDING_LABELS("OutstandingLabels"),
    @XmlEnumValue("PayOnUse")
    PAY_ON_USE("PayOnUse"),
    @XmlEnumValue("DHLExpress")
    DHL_EXPRESS("DHLExpress"),
    @XmlEnumValue("FedEx")
    FED_EX("FedEx"),
    @XmlEnumValue("PayOnUseReturn")
    PAY_ON_USE_RETURN("PayOnUseReturn"),
    @XmlEnumValue("ClaimPendingRecipientVerification")
    CLAIM_PENDING_RECIPIENT_VERIFICATION("ClaimPendingRecipientVerification"),
    @XmlEnumValue("ClaimEligibleDamaged")
    CLAIM_ELIGIBLE_DAMAGED("ClaimEligibleDamaged");
    private final String value;

    SearchFor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchFor fromValue(String v) {
        for (SearchFor c: SearchFor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
