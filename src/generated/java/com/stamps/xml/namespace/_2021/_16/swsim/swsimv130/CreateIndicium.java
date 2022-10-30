
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Authenticator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="Credentials" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Credentials" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="IntegratorTxID" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-1-128"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-128" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}RateV45"/&gt;
 *         &lt;element name="ReturnTo" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Address" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-1-64" minOccurs="0"/&gt;
 *         &lt;element name="Customs" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CustomsV8" minOccurs="0"/&gt;
 *         &lt;element name="SampleOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PostageMode" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PostageMode" minOccurs="0"/&gt;
 *         &lt;element name="ImageType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ImageType" minOccurs="0"/&gt;
 *         &lt;element name="EltronPrinterDPIType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}EltronPrinterDPIType" minOccurs="0"/&gt;
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cost_code_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="deliveryNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentNotification" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ShipmentNotification" minOccurs="0"/&gt;
 *         &lt;element name="rotationDegrees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="horizontalOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="verticalOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="printDensity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="printMemo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="printInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="requestPostageHash" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nonDeliveryOption" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}NonDeliveryOption" minOccurs="0"/&gt;
 *         &lt;element name="RedirectTo" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Address" minOccurs="0"/&gt;
 *         &lt;element name="OutboundTransactionID" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-128" minOccurs="0"/&gt;
 *         &lt;element name="OriginalPostageHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnImageData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InternalTransactionNumber" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-1-35" minOccurs="0"/&gt;
 *         &lt;element name="PaperSize" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PaperSizeV1" minOccurs="0"/&gt;
 *         &lt;element name="EmailLabelTo" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}LabelRecipientInfo" minOccurs="0"/&gt;
 *         &lt;element name="PayOnPrint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReturnLabelExpirationDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ImageDpi" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ImageDpi" minOccurs="0"/&gt;
 *         &lt;element name="RateToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderId" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-100" minOccurs="0"/&gt;
 *         &lt;element name="BypassCleanseAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ImageId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Reference1" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-100" minOccurs="0"/&gt;
 *         &lt;element name="Reference2" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-100" minOccurs="0"/&gt;
 *         &lt;element name="Reference3" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-100" minOccurs="0"/&gt;
 *         &lt;element name="Reference4" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-100" minOccurs="0"/&gt;
 *         &lt;element name="ReturnIndiciumData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedPostageInfo" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ExtendedPostageInfoV1" minOccurs="0"/&gt;
 *         &lt;element name="EnclosedServiceType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}EnclosedServiceType" minOccurs="0"/&gt;
 *         &lt;element name="EnclosedPackageType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}EnclosedPackageType" minOccurs="0"/&gt;
 *         &lt;element name="OrderDetails" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}OrderDetails" minOccurs="0"/&gt;
 *         &lt;element name="BrandingId" type="{http://microsoft.com/wsdl/types/}guid" minOccurs="0"/&gt;
 *         &lt;element name="NotificationSettingId" type="{http://microsoft.com/wsdl/types/}guid" minOccurs="0"/&gt;
 *         &lt;element name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authenticator",
    "credentials",
    "integratorTxID",
    "trackingNumber",
    "rate",
    "returnTo",
    "customerID",
    "customs",
    "sampleOnly",
    "postageMode",
    "imageType",
    "eltronPrinterDPIType",
    "memo",
    "costCodeId",
    "deliveryNotification",
    "shipmentNotification",
    "rotationDegrees",
    "horizontalOffset",
    "verticalOffset",
    "printDensity",
    "printMemo",
    "printInstructions",
    "requestPostageHash",
    "nonDeliveryOption",
    "redirectTo",
    "outboundTransactionID",
    "originalPostageHash",
    "returnImageData",
    "internalTransactionNumber",
    "paperSize",
    "emailLabelTo",
    "payOnPrint",
    "returnLabelExpirationDays",
    "imageDpi",
    "rateToken",
    "orderId",
    "bypassCleanseAddress",
    "imageId",
    "reference1",
    "reference2",
    "reference3",
    "reference4",
    "returnIndiciumData",
    "extendedPostageInfo",
    "enclosedServiceType",
    "enclosedPackageType",
    "orderDetails",
    "brandingId",
    "notificationSettingId",
    "groupCode",
    "description"
})
@XmlRootElement(name = "CreateIndicium")
public class CreateIndicium {

    @XmlElement(name = "Authenticator")
    protected String authenticator;
    @XmlElement(name = "Credentials")
    protected Credentials credentials;
    @XmlElement(name = "IntegratorTxID", required = true)
    protected String integratorTxID;
    @XmlElement(name = "TrackingNumber", defaultValue = "")
    protected String trackingNumber;
    @XmlElement(name = "Rate", required = true)
    protected RateV45 rate;
    @XmlElement(name = "ReturnTo")
    protected Address returnTo;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "Customs")
    protected CustomsV8 customs;
    @XmlElement(name = "SampleOnly", defaultValue = "false")
    protected Boolean sampleOnly;
    @XmlElement(name = "PostageMode", defaultValue = "Normal")
    @XmlSchemaType(name = "string")
    protected PostageMode postageMode;
    @XmlElement(name = "ImageType", defaultValue = "Auto")
    @XmlSchemaType(name = "string")
    protected ImageType imageType;
    @XmlElement(name = "EltronPrinterDPIType", defaultValue = "Default")
    @XmlSchemaType(name = "string")
    protected EltronPrinterDPIType eltronPrinterDPIType;
    @XmlElement(defaultValue = "")
    protected String memo;
    @XmlElement(name = "cost_code_id", defaultValue = "0")
    protected Integer costCodeId;
    @XmlElement(defaultValue = "false")
    protected Boolean deliveryNotification;
    @XmlElement(name = "ShipmentNotification")
    protected ShipmentNotification shipmentNotification;
    @XmlElement(defaultValue = "0")
    protected Integer rotationDegrees;
    @XmlElementRef(name = "horizontalOffset", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> horizontalOffset;
    @XmlElementRef(name = "verticalOffset", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> verticalOffset;
    @XmlElementRef(name = "printDensity", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> printDensity;
    @XmlElementRef(name = "printMemo", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> printMemo;
    @XmlElementRef(name = "printInstructions", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> printInstructions;
    @XmlElement(defaultValue = "false")
    protected Boolean requestPostageHash;
    @XmlElement(defaultValue = "Undefined")
    @XmlSchemaType(name = "string")
    protected NonDeliveryOption nonDeliveryOption;
    @XmlElement(name = "RedirectTo")
    protected Address redirectTo;
    @XmlElement(name = "OutboundTransactionID", defaultValue = "")
    protected String outboundTransactionID;
    @XmlElement(name = "OriginalPostageHash", defaultValue = "")
    protected String originalPostageHash;
    @XmlElementRef(name = "ReturnImageData", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> returnImageData;
    @XmlElement(name = "InternalTransactionNumber")
    protected String internalTransactionNumber;
    @XmlElement(name = "PaperSize", defaultValue = "Default")
    @XmlSchemaType(name = "string")
    protected PaperSizeV1 paperSize;
    @XmlElement(name = "EmailLabelTo")
    protected LabelRecipientInfo emailLabelTo;
    @XmlElement(name = "PayOnPrint", defaultValue = "false")
    protected Boolean payOnPrint;
    @XmlElementRef(name = "ReturnLabelExpirationDays", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> returnLabelExpirationDays;
    @XmlElement(name = "ImageDpi", defaultValue = "ImageDpiDefault")
    @XmlSchemaType(name = "string")
    protected ImageDpi imageDpi;
    @XmlElement(name = "RateToken")
    protected String rateToken;
    @XmlElement(name = "OrderId")
    protected String orderId;
    @XmlElement(name = "BypassCleanseAddress", defaultValue = "false")
    protected Boolean bypassCleanseAddress;
    @XmlElement(name = "ImageId", defaultValue = "0")
    protected Integer imageId;
    @XmlElement(name = "Reference1")
    protected String reference1;
    @XmlElement(name = "Reference2")
    protected String reference2;
    @XmlElement(name = "Reference3")
    protected String reference3;
    @XmlElement(name = "Reference4")
    protected String reference4;
    @XmlElement(name = "ReturnIndiciumData", defaultValue = "false")
    protected Boolean returnIndiciumData;
    @XmlElement(name = "ExtendedPostageInfo")
    protected ExtendedPostageInfoV1 extendedPostageInfo;
    @XmlElement(name = "EnclosedServiceType", defaultValue = "Unknown")
    @XmlSchemaType(name = "string")
    protected EnclosedServiceType enclosedServiceType;
    @XmlElement(name = "EnclosedPackageType", defaultValue = "Unknown")
    @XmlSchemaType(name = "string")
    protected EnclosedPackageType enclosedPackageType;
    @XmlElement(name = "OrderDetails")
    protected OrderDetails orderDetails;
    @XmlElementRef(name = "BrandingId", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brandingId;
    @XmlElementRef(name = "NotificationSettingId", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notificationSettingId;
    @XmlElement(name = "GroupCode")
    protected String groupCode;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the authenticator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticator() {
        return authenticator;
    }

    /**
     * Sets the value of the authenticator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticator(String value) {
        this.authenticator = value;
    }

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link Credentials }
     *     
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credentials }
     *     
     */
    public void setCredentials(Credentials value) {
        this.credentials = value;
    }

    /**
     * Gets the value of the integratorTxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegratorTxID() {
        return integratorTxID;
    }

    /**
     * Sets the value of the integratorTxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegratorTxID(String value) {
        this.integratorTxID = value;
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
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link RateV45 }
     *     
     */
    public RateV45 getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateV45 }
     *     
     */
    public void setRate(RateV45 value) {
        this.rate = value;
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
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the customs property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsV8 }
     *     
     */
    public CustomsV8 getCustoms() {
        return customs;
    }

    /**
     * Sets the value of the customs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsV8 }
     *     
     */
    public void setCustoms(CustomsV8 value) {
        this.customs = value;
    }

    /**
     * Gets the value of the sampleOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSampleOnly() {
        return sampleOnly;
    }

    /**
     * Sets the value of the sampleOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSampleOnly(Boolean value) {
        this.sampleOnly = value;
    }

    /**
     * Gets the value of the postageMode property.
     * 
     * @return
     *     possible object is
     *     {@link PostageMode }
     *     
     */
    public PostageMode getPostageMode() {
        return postageMode;
    }

    /**
     * Sets the value of the postageMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostageMode }
     *     
     */
    public void setPostageMode(PostageMode value) {
        this.postageMode = value;
    }

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link ImageType }
     *     
     */
    public ImageType getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageType }
     *     
     */
    public void setImageType(ImageType value) {
        this.imageType = value;
    }

    /**
     * Gets the value of the eltronPrinterDPIType property.
     * 
     * @return
     *     possible object is
     *     {@link EltronPrinterDPIType }
     *     
     */
    public EltronPrinterDPIType getEltronPrinterDPIType() {
        return eltronPrinterDPIType;
    }

    /**
     * Sets the value of the eltronPrinterDPIType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EltronPrinterDPIType }
     *     
     */
    public void setEltronPrinterDPIType(EltronPrinterDPIType value) {
        this.eltronPrinterDPIType = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the costCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCostCodeId() {
        return costCodeId;
    }

    /**
     * Sets the value of the costCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCostCodeId(Integer value) {
        this.costCodeId = value;
    }

    /**
     * Gets the value of the deliveryNotification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryNotification() {
        return deliveryNotification;
    }

    /**
     * Sets the value of the deliveryNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryNotification(Boolean value) {
        this.deliveryNotification = value;
    }

    /**
     * Gets the value of the shipmentNotification property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentNotification }
     *     
     */
    public ShipmentNotification getShipmentNotification() {
        return shipmentNotification;
    }

    /**
     * Sets the value of the shipmentNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentNotification }
     *     
     */
    public void setShipmentNotification(ShipmentNotification value) {
        this.shipmentNotification = value;
    }

    /**
     * Gets the value of the rotationDegrees property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRotationDegrees() {
        return rotationDegrees;
    }

    /**
     * Sets the value of the rotationDegrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRotationDegrees(Integer value) {
        this.rotationDegrees = value;
    }

    /**
     * Gets the value of the horizontalOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHorizontalOffset() {
        return horizontalOffset;
    }

    /**
     * Sets the value of the horizontalOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHorizontalOffset(JAXBElement<Integer> value) {
        this.horizontalOffset = value;
    }

    /**
     * Gets the value of the verticalOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVerticalOffset() {
        return verticalOffset;
    }

    /**
     * Sets the value of the verticalOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVerticalOffset(JAXBElement<Integer> value) {
        this.verticalOffset = value;
    }

    /**
     * Gets the value of the printDensity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrintDensity() {
        return printDensity;
    }

    /**
     * Sets the value of the printDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrintDensity(JAXBElement<Integer> value) {
        this.printDensity = value;
    }

    /**
     * Gets the value of the printMemo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPrintMemo() {
        return printMemo;
    }

    /**
     * Sets the value of the printMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPrintMemo(JAXBElement<Boolean> value) {
        this.printMemo = value;
    }

    /**
     * Gets the value of the printInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPrintInstructions() {
        return printInstructions;
    }

    /**
     * Sets the value of the printInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPrintInstructions(JAXBElement<Boolean> value) {
        this.printInstructions = value;
    }

    /**
     * Gets the value of the requestPostageHash property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestPostageHash() {
        return requestPostageHash;
    }

    /**
     * Sets the value of the requestPostageHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestPostageHash(Boolean value) {
        this.requestPostageHash = value;
    }

    /**
     * Gets the value of the nonDeliveryOption property.
     * 
     * @return
     *     possible object is
     *     {@link NonDeliveryOption }
     *     
     */
    public NonDeliveryOption getNonDeliveryOption() {
        return nonDeliveryOption;
    }

    /**
     * Sets the value of the nonDeliveryOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDeliveryOption }
     *     
     */
    public void setNonDeliveryOption(NonDeliveryOption value) {
        this.nonDeliveryOption = value;
    }

    /**
     * Gets the value of the redirectTo property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getRedirectTo() {
        return redirectTo;
    }

    /**
     * Sets the value of the redirectTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setRedirectTo(Address value) {
        this.redirectTo = value;
    }

    /**
     * Gets the value of the outboundTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundTransactionID() {
        return outboundTransactionID;
    }

    /**
     * Sets the value of the outboundTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundTransactionID(String value) {
        this.outboundTransactionID = value;
    }

    /**
     * Gets the value of the originalPostageHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalPostageHash() {
        return originalPostageHash;
    }

    /**
     * Sets the value of the originalPostageHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalPostageHash(String value) {
        this.originalPostageHash = value;
    }

    /**
     * Gets the value of the returnImageData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReturnImageData() {
        return returnImageData;
    }

    /**
     * Sets the value of the returnImageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReturnImageData(JAXBElement<Boolean> value) {
        this.returnImageData = value;
    }

    /**
     * Gets the value of the internalTransactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalTransactionNumber() {
        return internalTransactionNumber;
    }

    /**
     * Sets the value of the internalTransactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalTransactionNumber(String value) {
        this.internalTransactionNumber = value;
    }

    /**
     * Gets the value of the paperSize property.
     * 
     * @return
     *     possible object is
     *     {@link PaperSizeV1 }
     *     
     */
    public PaperSizeV1 getPaperSize() {
        return paperSize;
    }

    /**
     * Sets the value of the paperSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperSizeV1 }
     *     
     */
    public void setPaperSize(PaperSizeV1 value) {
        this.paperSize = value;
    }

    /**
     * Gets the value of the emailLabelTo property.
     * 
     * @return
     *     possible object is
     *     {@link LabelRecipientInfo }
     *     
     */
    public LabelRecipientInfo getEmailLabelTo() {
        return emailLabelTo;
    }

    /**
     * Sets the value of the emailLabelTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelRecipientInfo }
     *     
     */
    public void setEmailLabelTo(LabelRecipientInfo value) {
        this.emailLabelTo = value;
    }

    /**
     * Gets the value of the payOnPrint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayOnPrint() {
        return payOnPrint;
    }

    /**
     * Sets the value of the payOnPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayOnPrint(Boolean value) {
        this.payOnPrint = value;
    }

    /**
     * Gets the value of the returnLabelExpirationDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReturnLabelExpirationDays() {
        return returnLabelExpirationDays;
    }

    /**
     * Sets the value of the returnLabelExpirationDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReturnLabelExpirationDays(JAXBElement<Integer> value) {
        this.returnLabelExpirationDays = value;
    }

    /**
     * Gets the value of the imageDpi property.
     * 
     * @return
     *     possible object is
     *     {@link ImageDpi }
     *     
     */
    public ImageDpi getImageDpi() {
        return imageDpi;
    }

    /**
     * Sets the value of the imageDpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageDpi }
     *     
     */
    public void setImageDpi(ImageDpi value) {
        this.imageDpi = value;
    }

    /**
     * Gets the value of the rateToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateToken() {
        return rateToken;
    }

    /**
     * Sets the value of the rateToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateToken(String value) {
        this.rateToken = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the bypassCleanseAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBypassCleanseAddress() {
        return bypassCleanseAddress;
    }

    /**
     * Sets the value of the bypassCleanseAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBypassCleanseAddress(Boolean value) {
        this.bypassCleanseAddress = value;
    }

    /**
     * Gets the value of the imageId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageId() {
        return imageId;
    }

    /**
     * Sets the value of the imageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageId(Integer value) {
        this.imageId = value;
    }

    /**
     * Gets the value of the reference1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference1() {
        return reference1;
    }

    /**
     * Sets the value of the reference1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference1(String value) {
        this.reference1 = value;
    }

    /**
     * Gets the value of the reference2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference2() {
        return reference2;
    }

    /**
     * Sets the value of the reference2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference2(String value) {
        this.reference2 = value;
    }

    /**
     * Gets the value of the reference3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference3() {
        return reference3;
    }

    /**
     * Sets the value of the reference3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference3(String value) {
        this.reference3 = value;
    }

    /**
     * Gets the value of the reference4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference4() {
        return reference4;
    }

    /**
     * Sets the value of the reference4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference4(String value) {
        this.reference4 = value;
    }

    /**
     * Gets the value of the returnIndiciumData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnIndiciumData() {
        return returnIndiciumData;
    }

    /**
     * Sets the value of the returnIndiciumData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnIndiciumData(Boolean value) {
        this.returnIndiciumData = value;
    }

    /**
     * Gets the value of the extendedPostageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedPostageInfoV1 }
     *     
     */
    public ExtendedPostageInfoV1 getExtendedPostageInfo() {
        return extendedPostageInfo;
    }

    /**
     * Sets the value of the extendedPostageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedPostageInfoV1 }
     *     
     */
    public void setExtendedPostageInfo(ExtendedPostageInfoV1 value) {
        this.extendedPostageInfo = value;
    }

    /**
     * Gets the value of the enclosedServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link EnclosedServiceType }
     *     
     */
    public EnclosedServiceType getEnclosedServiceType() {
        return enclosedServiceType;
    }

    /**
     * Sets the value of the enclosedServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnclosedServiceType }
     *     
     */
    public void setEnclosedServiceType(EnclosedServiceType value) {
        this.enclosedServiceType = value;
    }

    /**
     * Gets the value of the enclosedPackageType property.
     * 
     * @return
     *     possible object is
     *     {@link EnclosedPackageType }
     *     
     */
    public EnclosedPackageType getEnclosedPackageType() {
        return enclosedPackageType;
    }

    /**
     * Sets the value of the enclosedPackageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnclosedPackageType }
     *     
     */
    public void setEnclosedPackageType(EnclosedPackageType value) {
        this.enclosedPackageType = value;
    }

    /**
     * Gets the value of the orderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDetails }
     *     
     */
    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    /**
     * Sets the value of the orderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDetails }
     *     
     */
    public void setOrderDetails(OrderDetails value) {
        this.orderDetails = value;
    }

    /**
     * Gets the value of the brandingId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrandingId() {
        return brandingId;
    }

    /**
     * Sets the value of the brandingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrandingId(JAXBElement<String> value) {
        this.brandingId = value;
    }

    /**
     * Gets the value of the notificationSettingId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotificationSettingId() {
        return notificationSettingId;
    }

    /**
     * Sets the value of the notificationSettingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotificationSettingId(JAXBElement<String> value) {
        this.notificationSettingId = value;
    }

    /**
     * Gets the value of the groupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
