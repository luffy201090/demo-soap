
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedPostageInfoV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedPostageInfoV1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eRefundAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="orderID" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-100" minOccurs="0"/&gt;
 *         &lt;element name="storeProfileName" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-50" minOccurs="0"/&gt;
 *         &lt;element name="storeProfileID" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-50" minOccurs="0"/&gt;
 *         &lt;element name="formattedOrderDetails" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-8192" minOccurs="0"/&gt;
 *         &lt;element name="mediaID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="printerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="netstampSerialNumber" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-50" minOccurs="0"/&gt;
 *         &lt;element name="mcatTracking" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-50" minOccurs="0"/&gt;
 *         &lt;element name="bridgeProfileType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-50" minOccurs="0"/&gt;
 *         &lt;element name="clientVersion" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-16" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedPostageInfoV1", propOrder = {
    "eRefundAllowed",
    "orderID",
    "storeProfileName",
    "storeProfileID",
    "formattedOrderDetails",
    "mediaID",
    "printerID",
    "netstampSerialNumber",
    "mcatTracking",
    "bridgeProfileType",
    "clientVersion"
})
public class ExtendedPostageInfoV1 {

    @XmlElement(defaultValue = "false")
    protected Boolean eRefundAllowed;
    protected String orderID;
    protected String storeProfileName;
    protected String storeProfileID;
    protected String formattedOrderDetails;
    @XmlElement(defaultValue = "0")
    protected Integer mediaID;
    @XmlElement(defaultValue = "0")
    protected Integer printerID;
    protected String netstampSerialNumber;
    protected String mcatTracking;
    protected String bridgeProfileType;
    protected String clientVersion;

    /**
     * Gets the value of the eRefundAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isERefundAllowed() {
        return eRefundAllowed;
    }

    /**
     * Sets the value of the eRefundAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setERefundAllowed(Boolean value) {
        this.eRefundAllowed = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the storeProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreProfileName() {
        return storeProfileName;
    }

    /**
     * Sets the value of the storeProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreProfileName(String value) {
        this.storeProfileName = value;
    }

    /**
     * Gets the value of the storeProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreProfileID() {
        return storeProfileID;
    }

    /**
     * Sets the value of the storeProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreProfileID(String value) {
        this.storeProfileID = value;
    }

    /**
     * Gets the value of the formattedOrderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedOrderDetails() {
        return formattedOrderDetails;
    }

    /**
     * Sets the value of the formattedOrderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedOrderDetails(String value) {
        this.formattedOrderDetails = value;
    }

    /**
     * Gets the value of the mediaID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMediaID() {
        return mediaID;
    }

    /**
     * Sets the value of the mediaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMediaID(Integer value) {
        this.mediaID = value;
    }

    /**
     * Gets the value of the printerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrinterID() {
        return printerID;
    }

    /**
     * Sets the value of the printerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrinterID(Integer value) {
        this.printerID = value;
    }

    /**
     * Gets the value of the netstampSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetstampSerialNumber() {
        return netstampSerialNumber;
    }

    /**
     * Sets the value of the netstampSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetstampSerialNumber(String value) {
        this.netstampSerialNumber = value;
    }

    /**
     * Gets the value of the mcatTracking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcatTracking() {
        return mcatTracking;
    }

    /**
     * Sets the value of the mcatTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcatTracking(String value) {
        this.mcatTracking = value;
    }

    /**
     * Gets the value of the bridgeProfileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBridgeProfileType() {
        return bridgeProfileType;
    }

    /**
     * Sets the value of the bridgeProfileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBridgeProfileType(String value) {
        this.bridgeProfileType = value;
    }

    /**
     * Gets the value of the clientVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientVersion() {
        return clientVersion;
    }

    /**
     * Sets the value of the clientVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientVersion(String value) {
        this.clientVersion = value;
    }

}
