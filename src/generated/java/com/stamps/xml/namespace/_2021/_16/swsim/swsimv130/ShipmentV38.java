
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ShipmentV38 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentV38"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StampsTxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentStatus" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ShipmentStatusV2" minOccurs="0"/&gt;
 *         &lt;element name="PrintDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MailDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DeliveredDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-1-128" minOccurs="0"/&gt;
 *         &lt;element name="ReturnTrackingNumber" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-1-128" minOccurs="0"/&gt;
 *         &lt;element name="ScanFormId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ServicesV21" minOccurs="0"/&gt;
 *         &lt;element name="AddOns" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfAddOnV20" minOccurs="0"/&gt;
 *         &lt;element name="FromZIPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnTo" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Address" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Address" minOccurs="0"/&gt;
 *         &lt;element name="PackageInfo" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PackageInfoV6" minOccurs="0"/&gt;
 *         &lt;element name="References" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ReferencesV3" minOccurs="0"/&gt;
 *         &lt;element name="RefundType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}RefundTypeV1" minOccurs="0"/&gt;
 *         &lt;element name="RefundStatus" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}RefundStatusV1" minOccurs="0"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Reserved" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ServicesV21" minOccurs="0"/&gt;
 *         &lt;element name="AdjustmentDetails" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}AdjustmentDetails" minOccurs="0"/&gt;
 *         &lt;element name="ClaimDetails" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PGClaimDetails" minOccurs="0"/&gt;
 *         &lt;element name="Surcharges" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfSurchargeV5" minOccurs="0"/&gt;
 *         &lt;element name="LabelCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentV38", propOrder = {
    "stampsTxId",
    "shipmentStatus",
    "printDate",
    "mailDate",
    "deliveredDate",
    "trackingNumber",
    "returnTrackingNumber",
    "scanFormId",
    "service",
    "addOns",
    "fromZIPCode",
    "returnTo",
    "shipTo",
    "packageInfo",
    "references",
    "refundType",
    "refundStatus",
    "expiryDate",
    "reserved",
    "adjustmentDetails",
    "claimDetails",
    "surcharges",
    "labelCategory"
})
public class ShipmentV38 {

    @XmlElement(name = "StampsTxId")
    protected String stampsTxId;
    @XmlElementRef(name = "ShipmentStatus", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<ShipmentStatusV2> shipmentStatus;
    @XmlElementRef(name = "PrintDate", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> printDate;
    @XmlElementRef(name = "MailDate", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> mailDate;
    @XmlElementRef(name = "DeliveredDate", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> deliveredDate;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "ReturnTrackingNumber")
    protected String returnTrackingNumber;
    @XmlElement(name = "ScanFormId")
    protected String scanFormId;
    @XmlElement(name = "Service")
    protected ServicesV21 service;
    @XmlElement(name = "AddOns")
    protected ArrayOfAddOnV20 addOns;
    @XmlElement(name = "FromZIPCode")
    protected String fromZIPCode;
    @XmlElement(name = "ReturnTo")
    protected Address returnTo;
    @XmlElement(name = "ShipTo")
    protected Address shipTo;
    @XmlElement(name = "PackageInfo")
    protected PackageInfoV6 packageInfo;
    @XmlElement(name = "References")
    protected ReferencesV3 references;
    @XmlElementRef(name = "RefundType", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<RefundTypeV1> refundType;
    @XmlElement(name = "RefundStatus")
    protected RefundStatusV1 refundStatus;
    @XmlElementRef(name = "ExpiryDate", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expiryDate;
    @XmlElement(name = "Reserved")
    protected ServicesV21 reserved;
    @XmlElement(name = "AdjustmentDetails")
    protected AdjustmentDetails adjustmentDetails;
    @XmlElement(name = "ClaimDetails")
    protected PGClaimDetails claimDetails;
    @XmlElement(name = "Surcharges")
    protected ArrayOfSurchargeV5 surcharges;
    @XmlElementRef(name = "LabelCategory", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> labelCategory;

    /**
     * Gets the value of the stampsTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStampsTxId() {
        return stampsTxId;
    }

    /**
     * Sets the value of the stampsTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStampsTxId(String value) {
        this.stampsTxId = value;
    }

    /**
     * Gets the value of the shipmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ShipmentStatusV2 }{@code >}
     *     
     */
    public JAXBElement<ShipmentStatusV2> getShipmentStatus() {
        return shipmentStatus;
    }

    /**
     * Sets the value of the shipmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ShipmentStatusV2 }{@code >}
     *     
     */
    public void setShipmentStatus(JAXBElement<ShipmentStatusV2> value) {
        this.shipmentStatus = value;
    }

    /**
     * Gets the value of the printDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPrintDate() {
        return printDate;
    }

    /**
     * Sets the value of the printDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPrintDate(JAXBElement<XMLGregorianCalendar> value) {
        this.printDate = value;
    }

    /**
     * Gets the value of the mailDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMailDate() {
        return mailDate;
    }

    /**
     * Sets the value of the mailDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMailDate(JAXBElement<XMLGregorianCalendar> value) {
        this.mailDate = value;
    }

    /**
     * Gets the value of the deliveredDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDeliveredDate() {
        return deliveredDate;
    }

    /**
     * Sets the value of the deliveredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDeliveredDate(JAXBElement<XMLGregorianCalendar> value) {
        this.deliveredDate = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the returnTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnTrackingNumber() {
        return returnTrackingNumber;
    }

    /**
     * Sets the value of the returnTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnTrackingNumber(String value) {
        this.returnTrackingNumber = value;
    }

    /**
     * Gets the value of the scanFormId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanFormId() {
        return scanFormId;
    }

    /**
     * Sets the value of the scanFormId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanFormId(String value) {
        this.scanFormId = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServicesV21 }
     *     
     */
    public ServicesV21 getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicesV21 }
     *     
     */
    public void setService(ServicesV21 value) {
        this.service = value;
    }

    /**
     * Gets the value of the addOns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddOnV20 }
     *     
     */
    public ArrayOfAddOnV20 getAddOns() {
        return addOns;
    }

    /**
     * Sets the value of the addOns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddOnV20 }
     *     
     */
    public void setAddOns(ArrayOfAddOnV20 value) {
        this.addOns = value;
    }

    /**
     * Gets the value of the fromZIPCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromZIPCode() {
        return fromZIPCode;
    }

    /**
     * Sets the value of the fromZIPCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromZIPCode(String value) {
        this.fromZIPCode = value;
    }

    /**
     * Gets the value of the returnTo property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getReturnTo() {
        return returnTo;
    }

    /**
     * Sets the value of the returnTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setReturnTo(Address value) {
        this.returnTo = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setShipTo(Address value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the packageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PackageInfoV6 }
     *     
     */
    public PackageInfoV6 getPackageInfo() {
        return packageInfo;
    }

    /**
     * Sets the value of the packageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageInfoV6 }
     *     
     */
    public void setPackageInfo(PackageInfoV6 value) {
        this.packageInfo = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencesV3 }
     *     
     */
    public ReferencesV3 getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencesV3 }
     *     
     */
    public void setReferences(ReferencesV3 value) {
        this.references = value;
    }

    /**
     * Gets the value of the refundType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RefundTypeV1 }{@code >}
     *     
     */
    public JAXBElement<RefundTypeV1> getRefundType() {
        return refundType;
    }

    /**
     * Sets the value of the refundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RefundTypeV1 }{@code >}
     *     
     */
    public void setRefundType(JAXBElement<RefundTypeV1> value) {
        this.refundType = value;
    }

    /**
     * Gets the value of the refundStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RefundStatusV1 }
     *     
     */
    public RefundStatusV1 getRefundStatus() {
        return refundStatus;
    }

    /**
     * Sets the value of the refundStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundStatusV1 }
     *     
     */
    public void setRefundStatus(RefundStatusV1 value) {
        this.refundStatus = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpiryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the reserved property.
     * 
     * @return
     *     possible object is
     *     {@link ServicesV21 }
     *     
     */
    public ServicesV21 getReserved() {
        return reserved;
    }

    /**
     * Sets the value of the reserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicesV21 }
     *     
     */
    public void setReserved(ServicesV21 value) {
        this.reserved = value;
    }

    /**
     * Gets the value of the adjustmentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentDetails }
     *     
     */
    public AdjustmentDetails getAdjustmentDetails() {
        return adjustmentDetails;
    }

    /**
     * Sets the value of the adjustmentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentDetails }
     *     
     */
    public void setAdjustmentDetails(AdjustmentDetails value) {
        this.adjustmentDetails = value;
    }

    /**
     * Gets the value of the claimDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PGClaimDetails }
     *     
     */
    public PGClaimDetails getClaimDetails() {
        return claimDetails;
    }

    /**
     * Sets the value of the claimDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PGClaimDetails }
     *     
     */
    public void setClaimDetails(PGClaimDetails value) {
        this.claimDetails = value;
    }

    /**
     * Gets the value of the surcharges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSurchargeV5 }
     *     
     */
    public ArrayOfSurchargeV5 getSurcharges() {
        return surcharges;
    }

    /**
     * Sets the value of the surcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSurchargeV5 }
     *     
     */
    public void setSurcharges(ArrayOfSurchargeV5 value) {
        this.surcharges = value;
    }

    /**
     * Gets the value of the labelCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLabelCategory() {
        return labelCategory;
    }

    /**
     * Sets the value of the labelCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLabelCategory(JAXBElement<Integer> value) {
        this.labelCategory = value;
    }

}
