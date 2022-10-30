
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeightLb" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="WeightOz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TrackingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrandingId" type="{http://microsoft.com/wsdl/types/}guid" minOccurs="0"/&gt;
 *         &lt;element name="NotificationSettingId" type="{http://microsoft.com/wsdl/types/}guid" minOccurs="0"/&gt;
 *         &lt;element name="EmailSenderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="From" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Address"/&gt;
 *         &lt;element name="To" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Address" minOccurs="0"/&gt;
 *         &lt;element name="OrderDetails" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}OrderDetails" minOccurs="0"/&gt;
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "trackingNumber",
    "carrier",
    "weightLb",
    "weightOz",
    "trackingType",
    "brandingId",
    "notificationSettingId",
    "emailSenderName",
    "from",
    "to",
    "orderDetails",
    "shipDate",
    "sendEmail"
})
@XmlRootElement(name = "CreateShipmentNotification")
public class CreateShipmentNotification {

    @XmlElement(name = "Authenticator")
    protected String authenticator;
    @XmlElement(name = "Credentials")
    protected Credentials credentials;
    @XmlElement(name = "TrackingNumber", required = true)
    protected String trackingNumber;
    @XmlElement(name = "Carrier")
    protected String carrier;
    @XmlElement(name = "WeightLb", defaultValue = "0")
    protected Double weightLb;
    @XmlElement(name = "WeightOz", defaultValue = "0")
    protected Double weightOz;
    @XmlElement(name = "TrackingType")
    protected String trackingType;
    @XmlElementRef(name = "BrandingId", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brandingId;
    @XmlElementRef(name = "NotificationSettingId", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notificationSettingId;
    @XmlElement(name = "EmailSenderName", required = true)
    protected String emailSenderName;
    @XmlElement(name = "From", required = true)
    protected Address from;
    @XmlElement(name = "To")
    protected Address to;
    @XmlElement(name = "OrderDetails")
    protected OrderDetails orderDetails;
    @XmlElement(name = "ShipDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipDate;
    @XmlElement(name = "SendEmail", defaultValue = "true")
    protected Boolean sendEmail;

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
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the weightLb property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeightLb() {
        return weightLb;
    }

    /**
     * Sets the value of the weightLb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeightLb(Double value) {
        this.weightLb = value;
    }

    /**
     * Gets the value of the weightOz property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeightOz() {
        return weightOz;
    }

    /**
     * Sets the value of the weightOz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeightOz(Double value) {
        this.weightOz = value;
    }

    /**
     * Gets the value of the trackingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingType() {
        return trackingType;
    }

    /**
     * Sets the value of the trackingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingType(String value) {
        this.trackingType = value;
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
     * Gets the value of the emailSenderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSenderName() {
        return emailSenderName;
    }

    /**
     * Sets the value of the emailSenderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSenderName(String value) {
        this.emailSenderName = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setFrom(Address value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setTo(Address value) {
        this.to = value;
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
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDate(XMLGregorianCalendar value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the sendEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendEmail() {
        return sendEmail;
    }

    /**
     * Sets the value of the sendEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendEmail(Boolean value) {
        this.sendEmail = value;
    }

}
