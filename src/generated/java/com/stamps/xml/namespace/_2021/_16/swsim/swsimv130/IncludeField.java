
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncludeField.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="IncludeField"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="StampsTxId"/&gt;
 *     &lt;enumeration value="ShipmentStatus"/&gt;
 *     &lt;enumeration value="PrintDate"/&gt;
 *     &lt;enumeration value="MailDate"/&gt;
 *     &lt;enumeration value="DeliveredDate"/&gt;
 *     &lt;enumeration value="TrackingNumber"/&gt;
 *     &lt;enumeration value="ScanFormId"/&gt;
 *     &lt;enumeration value="Service"/&gt;
 *     &lt;enumeration value="AddOns"/&gt;
 *     &lt;enumeration value="FromZIPCode"/&gt;
 *     &lt;enumeration value="ReturnTo"/&gt;
 *     &lt;enumeration value="ShipTo"/&gt;
 *     &lt;enumeration value="PackageInfo"/&gt;
 *     &lt;enumeration value="References"/&gt;
 *     &lt;enumeration value="RefundType"/&gt;
 *     &lt;enumeration value="RefundStatus"/&gt;
 *     &lt;enumeration value="ExpiryDate"/&gt;
 *     &lt;enumeration value="Reserved"/&gt;
 *     &lt;enumeration value="AdjustmentDetails"/&gt;
 *     &lt;enumeration value="ClaimDetails"/&gt;
 *     &lt;enumeration value="ReturnTrackingNumber"/&gt;
 *     &lt;enumeration value="Surcharges"/&gt;
 *     &lt;enumeration value="LabelCategory"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IncludeField")
@XmlEnum
public enum IncludeField {

    @XmlEnumValue("StampsTxId")
    STAMPS_TX_ID("StampsTxId"),
    @XmlEnumValue("ShipmentStatus")
    SHIPMENT_STATUS("ShipmentStatus"),
    @XmlEnumValue("PrintDate")
    PRINT_DATE("PrintDate"),
    @XmlEnumValue("MailDate")
    MAIL_DATE("MailDate"),
    @XmlEnumValue("DeliveredDate")
    DELIVERED_DATE("DeliveredDate"),
    @XmlEnumValue("TrackingNumber")
    TRACKING_NUMBER("TrackingNumber"),
    @XmlEnumValue("ScanFormId")
    SCAN_FORM_ID("ScanFormId"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("AddOns")
    ADD_ONS("AddOns"),
    @XmlEnumValue("FromZIPCode")
    FROM_ZIP_CODE("FromZIPCode"),
    @XmlEnumValue("ReturnTo")
    RETURN_TO("ReturnTo"),
    @XmlEnumValue("ShipTo")
    SHIP_TO("ShipTo"),
    @XmlEnumValue("PackageInfo")
    PACKAGE_INFO("PackageInfo"),
    @XmlEnumValue("References")
    REFERENCES("References"),
    @XmlEnumValue("RefundType")
    REFUND_TYPE("RefundType"),
    @XmlEnumValue("RefundStatus")
    REFUND_STATUS("RefundStatus"),
    @XmlEnumValue("ExpiryDate")
    EXPIRY_DATE("ExpiryDate"),
    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),
    @XmlEnumValue("AdjustmentDetails")
    ADJUSTMENT_DETAILS("AdjustmentDetails"),
    @XmlEnumValue("ClaimDetails")
    CLAIM_DETAILS("ClaimDetails"),
    @XmlEnumValue("ReturnTrackingNumber")
    RETURN_TRACKING_NUMBER("ReturnTrackingNumber"),
    @XmlEnumValue("Surcharges")
    SURCHARGES("Surcharges"),
    @XmlEnumValue("LabelCategory")
    LABEL_CATEGORY("LabelCategory");
    private final String value;

    IncludeField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncludeField fromValue(String v) {
        for (IncludeField c: IncludeField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
