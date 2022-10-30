
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrackingEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ManifestAcknowledgement"/&gt;
 *     &lt;enumeration value="ElectronicNotification"/&gt;
 *     &lt;enumeration value="Delivered"/&gt;
 *     &lt;enumeration value="AttemptedNoticeLeft"/&gt;
 *     &lt;enumeration value="AcceptOrPickup"/&gt;
 *     &lt;enumeration value="Refused"/&gt;
 *     &lt;enumeration value="Undeliverable"/&gt;
 *     &lt;enumeration value="Forwarded"/&gt;
 *     &lt;enumeration value="ArrivalAtUnit"/&gt;
 *     &lt;enumeration value="Missent"/&gt;
 *     &lt;enumeration value="ReturnToSender"/&gt;
 *     &lt;enumeration value="Enroute"/&gt;
 *     &lt;enumeration value="DeadLetter"/&gt;
 *     &lt;enumeration value="ArrivalAtPickupPoint"/&gt;
 *     &lt;enumeration value="NoSuchNumber"/&gt;
 *     &lt;enumeration value="InsufficientAddress"/&gt;
 *     &lt;enumeration value="MovedNoForwarding"/&gt;
 *     &lt;enumeration value="ForwardingExpired"/&gt;
 *     &lt;enumeration value="AddresseeUnknown"/&gt;
 *     &lt;enumeration value="Vacant"/&gt;
 *     &lt;enumeration value="Unclaimed"/&gt;
 *     &lt;enumeration value="Deceased"/&gt;
 *     &lt;enumeration value="ReturnedOtherReason"/&gt;
 *     &lt;enumeration value="PickedUpByShippingPartner"/&gt;
 *     &lt;enumeration value="ArrivedAtShippingPartner"/&gt;
 *     &lt;enumeration value="DepartedFromShippingPartner"/&gt;
 *     &lt;enumeration value="USPS Event"/&gt;
 *     &lt;enumeration value="ArriveSortFacility_A1"/&gt;
 *     &lt;enumeration value="AcceptedAtDestination"/&gt;
 *     &lt;enumeration value="ArrivedUSPSSortFacility"/&gt;
 *     &lt;enumeration value="Processed_BE"/&gt;
 *     &lt;enumeration value="DepartUSPSSortFacility"/&gt;
 *     &lt;enumeration value="DeliveryStatusNotUpdated"/&gt;
 *     &lt;enumeration value="DispatchedFromSortFacility"/&gt;
 *     &lt;enumeration value="ShippingLabelCreated"/&gt;
 *     &lt;enumeration value="DepartSortFacility_L1"/&gt;
 *     &lt;enumeration value="PickedUpAndProcessedByAgent"/&gt;
 *     &lt;enumeration value="OriginAcceptance"/&gt;
 *     &lt;enumeration value="ProcessedAtDestinationFacility"/&gt;
 *     &lt;enumeration value="OutForDelivery"/&gt;
 *     &lt;enumeration value="Sorting_ProcessingComplete"/&gt;
 *     &lt;enumeration value="DispatchedToSortFacility"/&gt;
 *     &lt;enumeration value="ArriveSortFacility_R1"/&gt;
 *     &lt;enumeration value="Processed_RB"/&gt;
 *     &lt;enumeration value="DepartSortFacility_T1"/&gt;
 *     &lt;enumeration value="ShipmentAcceptance"/&gt;
 *     &lt;enumeration value="In_processAcceptance"/&gt;
 *     &lt;enumeration value="ArriveSortFacility_U1"/&gt;
 *     &lt;enumeration value="Mis_shipped"/&gt;
 *     &lt;enumeration value="AvailableForPickup"/&gt;
 *     &lt;enumeration value="PickedUpByAgent"/&gt;
 *     &lt;enumeration value="ReturnToSender_NotPickedUp"/&gt;
 *     &lt;enumeration value="DeadMail_DisposedByPostOffice"/&gt;
 *     &lt;enumeration value="DeadMail_SentToRecoveryCenter"/&gt;
 *     &lt;enumeration value="Processed_RegisteredMailOnly_35"/&gt;
 *     &lt;enumeration value="Processed_RegisteredMailOnly_36"/&gt;
 *     &lt;enumeration value="Processed_RegisteredMailOnly_38"/&gt;
 *     &lt;enumeration value="Processed_RegisteredMailOnly_39"/&gt;
 *     &lt;enumeration value="Processed_RegisteredMailOnly_40"/&gt;
 *     &lt;enumeration value="ReceivedAtOpeningUnit"/&gt;
 *     &lt;enumeration value="USPSHandoffToShippingPartner"/&gt;
 *     &lt;enumeration value="PickedUp"/&gt;
 *     &lt;enumeration value="CustomerRecall"/&gt;
 *     &lt;enumeration value="DispatchedToMilitary"/&gt;
 *     &lt;enumeration value="DuplicateLabelID"/&gt;
 *     &lt;enumeration value="BusinessClosed"/&gt;
 *     &lt;enumeration value="NoticeLeft"/&gt;
 *     &lt;enumeration value="ReceptacleBlocked"/&gt;
 *     &lt;enumeration value="ReceptacleFull"/&gt;
 *     &lt;enumeration value="NoSecureLocationAvailable"/&gt;
 *     &lt;enumeration value="NoAuthorizedRecipientAvailable"/&gt;
 *     &lt;enumeration value="TenderedToAgentForFinalDelivery"/&gt;
 *     &lt;enumeration value="TenderedToPostalService"/&gt;
 *     &lt;enumeration value="ArrivedAgentFacility"/&gt;
 *     &lt;enumeration value="DepartedAgentFacility"/&gt;
 *     &lt;enumeration value="DeliveredByAgentToMerchant"/&gt;
 *     &lt;enumeration value="FinalDispositionByMerchant"/&gt;
 *     &lt;enumeration value="MailConsigned"/&gt;
 *     &lt;enumeration value="ForeginReceipt"/&gt;
 *     &lt;enumeration value="CustomsClearance"/&gt;
 *     &lt;enumeration value="RecipientActionRequired"/&gt;
 *     &lt;enumeration value="Delay"/&gt;
 *     &lt;enumeration value="ReturnToSender_CO"/&gt;
 *     &lt;enumeration value="AttemptedNoticeLeft_H0"/&gt;
 *     &lt;enumeration value="ServiceDelay"/&gt;
 *     &lt;enumeration value="ErrorDataNotAvailable"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackingEventType")
@XmlEnum
public enum TrackingEventType {

    @XmlEnumValue("ManifestAcknowledgement")
    MANIFEST_ACKNOWLEDGEMENT("ManifestAcknowledgement"),
    @XmlEnumValue("ElectronicNotification")
    ELECTRONIC_NOTIFICATION("ElectronicNotification"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("AttemptedNoticeLeft")
    ATTEMPTED_NOTICE_LEFT("AttemptedNoticeLeft"),
    @XmlEnumValue("AcceptOrPickup")
    ACCEPT_OR_PICKUP("AcceptOrPickup"),
    @XmlEnumValue("Refused")
    REFUSED("Refused"),
    @XmlEnumValue("Undeliverable")
    UNDELIVERABLE("Undeliverable"),
    @XmlEnumValue("Forwarded")
    FORWARDED("Forwarded"),
    @XmlEnumValue("ArrivalAtUnit")
    ARRIVAL_AT_UNIT("ArrivalAtUnit"),
    @XmlEnumValue("Missent")
    MISSENT("Missent"),
    @XmlEnumValue("ReturnToSender")
    RETURN_TO_SENDER("ReturnToSender"),
    @XmlEnumValue("Enroute")
    ENROUTE("Enroute"),
    @XmlEnumValue("DeadLetter")
    DEAD_LETTER("DeadLetter"),
    @XmlEnumValue("ArrivalAtPickupPoint")
    ARRIVAL_AT_PICKUP_POINT("ArrivalAtPickupPoint"),
    @XmlEnumValue("NoSuchNumber")
    NO_SUCH_NUMBER("NoSuchNumber"),
    @XmlEnumValue("InsufficientAddress")
    INSUFFICIENT_ADDRESS("InsufficientAddress"),
    @XmlEnumValue("MovedNoForwarding")
    MOVED_NO_FORWARDING("MovedNoForwarding"),
    @XmlEnumValue("ForwardingExpired")
    FORWARDING_EXPIRED("ForwardingExpired"),
    @XmlEnumValue("AddresseeUnknown")
    ADDRESSEE_UNKNOWN("AddresseeUnknown"),
    @XmlEnumValue("Vacant")
    VACANT("Vacant"),
    @XmlEnumValue("Unclaimed")
    UNCLAIMED("Unclaimed"),
    @XmlEnumValue("Deceased")
    DECEASED("Deceased"),
    @XmlEnumValue("ReturnedOtherReason")
    RETURNED_OTHER_REASON("ReturnedOtherReason"),
    @XmlEnumValue("PickedUpByShippingPartner")
    PICKED_UP_BY_SHIPPING_PARTNER("PickedUpByShippingPartner"),
    @XmlEnumValue("ArrivedAtShippingPartner")
    ARRIVED_AT_SHIPPING_PARTNER("ArrivedAtShippingPartner"),
    @XmlEnumValue("DepartedFromShippingPartner")
    DEPARTED_FROM_SHIPPING_PARTNER("DepartedFromShippingPartner"),
    @XmlEnumValue("USPS Event")
    USPS_EVENT("USPS Event"),
    @XmlEnumValue("ArriveSortFacility_A1")
    ARRIVE_SORT_FACILITY_A_1("ArriveSortFacility_A1"),
    @XmlEnumValue("AcceptedAtDestination")
    ACCEPTED_AT_DESTINATION("AcceptedAtDestination"),
    @XmlEnumValue("ArrivedUSPSSortFacility")
    ARRIVED_USPS_SORT_FACILITY("ArrivedUSPSSortFacility"),
    @XmlEnumValue("Processed_BE")
    PROCESSED_BE("Processed_BE"),
    @XmlEnumValue("DepartUSPSSortFacility")
    DEPART_USPS_SORT_FACILITY("DepartUSPSSortFacility"),
    @XmlEnumValue("DeliveryStatusNotUpdated")
    DELIVERY_STATUS_NOT_UPDATED("DeliveryStatusNotUpdated"),
    @XmlEnumValue("DispatchedFromSortFacility")
    DISPATCHED_FROM_SORT_FACILITY("DispatchedFromSortFacility"),
    @XmlEnumValue("ShippingLabelCreated")
    SHIPPING_LABEL_CREATED("ShippingLabelCreated"),
    @XmlEnumValue("DepartSortFacility_L1")
    DEPART_SORT_FACILITY_L_1("DepartSortFacility_L1"),
    @XmlEnumValue("PickedUpAndProcessedByAgent")
    PICKED_UP_AND_PROCESSED_BY_AGENT("PickedUpAndProcessedByAgent"),
    @XmlEnumValue("OriginAcceptance")
    ORIGIN_ACCEPTANCE("OriginAcceptance"),
    @XmlEnumValue("ProcessedAtDestinationFacility")
    PROCESSED_AT_DESTINATION_FACILITY("ProcessedAtDestinationFacility"),
    @XmlEnumValue("OutForDelivery")
    OUT_FOR_DELIVERY("OutForDelivery"),
    @XmlEnumValue("Sorting_ProcessingComplete")
    SORTING_PROCESSING_COMPLETE("Sorting_ProcessingComplete"),
    @XmlEnumValue("DispatchedToSortFacility")
    DISPATCHED_TO_SORT_FACILITY("DispatchedToSortFacility"),
    @XmlEnumValue("ArriveSortFacility_R1")
    ARRIVE_SORT_FACILITY_R_1("ArriveSortFacility_R1"),
    @XmlEnumValue("Processed_RB")
    PROCESSED_RB("Processed_RB"),
    @XmlEnumValue("DepartSortFacility_T1")
    DEPART_SORT_FACILITY_T_1("DepartSortFacility_T1"),
    @XmlEnumValue("ShipmentAcceptance")
    SHIPMENT_ACCEPTANCE("ShipmentAcceptance"),
    @XmlEnumValue("In_processAcceptance")
    IN_PROCESS_ACCEPTANCE("In_processAcceptance"),
    @XmlEnumValue("ArriveSortFacility_U1")
    ARRIVE_SORT_FACILITY_U_1("ArriveSortFacility_U1"),
    @XmlEnumValue("Mis_shipped")
    MIS_SHIPPED("Mis_shipped"),
    @XmlEnumValue("AvailableForPickup")
    AVAILABLE_FOR_PICKUP("AvailableForPickup"),
    @XmlEnumValue("PickedUpByAgent")
    PICKED_UP_BY_AGENT("PickedUpByAgent"),
    @XmlEnumValue("ReturnToSender_NotPickedUp")
    RETURN_TO_SENDER_NOT_PICKED_UP("ReturnToSender_NotPickedUp"),
    @XmlEnumValue("DeadMail_DisposedByPostOffice")
    DEAD_MAIL_DISPOSED_BY_POST_OFFICE("DeadMail_DisposedByPostOffice"),
    @XmlEnumValue("DeadMail_SentToRecoveryCenter")
    DEAD_MAIL_SENT_TO_RECOVERY_CENTER("DeadMail_SentToRecoveryCenter"),
    @XmlEnumValue("Processed_RegisteredMailOnly_35")
    PROCESSED_REGISTERED_MAIL_ONLY_35("Processed_RegisteredMailOnly_35"),
    @XmlEnumValue("Processed_RegisteredMailOnly_36")
    PROCESSED_REGISTERED_MAIL_ONLY_36("Processed_RegisteredMailOnly_36"),
    @XmlEnumValue("Processed_RegisteredMailOnly_38")
    PROCESSED_REGISTERED_MAIL_ONLY_38("Processed_RegisteredMailOnly_38"),
    @XmlEnumValue("Processed_RegisteredMailOnly_39")
    PROCESSED_REGISTERED_MAIL_ONLY_39("Processed_RegisteredMailOnly_39"),
    @XmlEnumValue("Processed_RegisteredMailOnly_40")
    PROCESSED_REGISTERED_MAIL_ONLY_40("Processed_RegisteredMailOnly_40"),
    @XmlEnumValue("ReceivedAtOpeningUnit")
    RECEIVED_AT_OPENING_UNIT("ReceivedAtOpeningUnit"),
    @XmlEnumValue("USPSHandoffToShippingPartner")
    USPS_HANDOFF_TO_SHIPPING_PARTNER("USPSHandoffToShippingPartner"),
    @XmlEnumValue("PickedUp")
    PICKED_UP("PickedUp"),
    @XmlEnumValue("CustomerRecall")
    CUSTOMER_RECALL("CustomerRecall"),
    @XmlEnumValue("DispatchedToMilitary")
    DISPATCHED_TO_MILITARY("DispatchedToMilitary"),
    @XmlEnumValue("DuplicateLabelID")
    DUPLICATE_LABEL_ID("DuplicateLabelID"),
    @XmlEnumValue("BusinessClosed")
    BUSINESS_CLOSED("BusinessClosed"),
    @XmlEnumValue("NoticeLeft")
    NOTICE_LEFT("NoticeLeft"),
    @XmlEnumValue("ReceptacleBlocked")
    RECEPTACLE_BLOCKED("ReceptacleBlocked"),
    @XmlEnumValue("ReceptacleFull")
    RECEPTACLE_FULL("ReceptacleFull"),
    @XmlEnumValue("NoSecureLocationAvailable")
    NO_SECURE_LOCATION_AVAILABLE("NoSecureLocationAvailable"),
    @XmlEnumValue("NoAuthorizedRecipientAvailable")
    NO_AUTHORIZED_RECIPIENT_AVAILABLE("NoAuthorizedRecipientAvailable"),
    @XmlEnumValue("TenderedToAgentForFinalDelivery")
    TENDERED_TO_AGENT_FOR_FINAL_DELIVERY("TenderedToAgentForFinalDelivery"),
    @XmlEnumValue("TenderedToPostalService")
    TENDERED_TO_POSTAL_SERVICE("TenderedToPostalService"),
    @XmlEnumValue("ArrivedAgentFacility")
    ARRIVED_AGENT_FACILITY("ArrivedAgentFacility"),
    @XmlEnumValue("DepartedAgentFacility")
    DEPARTED_AGENT_FACILITY("DepartedAgentFacility"),
    @XmlEnumValue("DeliveredByAgentToMerchant")
    DELIVERED_BY_AGENT_TO_MERCHANT("DeliveredByAgentToMerchant"),
    @XmlEnumValue("FinalDispositionByMerchant")
    FINAL_DISPOSITION_BY_MERCHANT("FinalDispositionByMerchant"),
    @XmlEnumValue("MailConsigned")
    MAIL_CONSIGNED("MailConsigned"),
    @XmlEnumValue("ForeginReceipt")
    FOREGIN_RECEIPT("ForeginReceipt"),
    @XmlEnumValue("CustomsClearance")
    CUSTOMS_CLEARANCE("CustomsClearance"),
    @XmlEnumValue("RecipientActionRequired")
    RECIPIENT_ACTION_REQUIRED("RecipientActionRequired"),
    @XmlEnumValue("Delay")
    DELAY("Delay"),
    @XmlEnumValue("ReturnToSender_CO")
    RETURN_TO_SENDER_CO("ReturnToSender_CO"),
    @XmlEnumValue("AttemptedNoticeLeft_H0")
    ATTEMPTED_NOTICE_LEFT_H_0("AttemptedNoticeLeft_H0"),
    @XmlEnumValue("ServiceDelay")
    SERVICE_DELAY("ServiceDelay"),
    @XmlEnumValue("ErrorDataNotAvailable")
    ERROR_DATA_NOT_AVAILABLE("ErrorDataNotAvailable"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    TrackingEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrackingEventType fromValue(String v) {
        for (TrackingEventType c: TrackingEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
