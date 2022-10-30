
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="Authenticator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TrackingEvents" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfTrackingEvent"/&gt;
 *         &lt;element name="GuaranteedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ExpectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ServiceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationInfo" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}DestinationInfo" minOccurs="0"/&gt;
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
    "trackingEvents",
    "guaranteedDeliveryDate",
    "expectedDeliveryDate",
    "serviceDescription",
    "carrier",
    "destinationInfo"
})
@XmlRootElement(name = "TrackShipmentResponse")
public class TrackShipmentResponse {

    @XmlElement(name = "Authenticator", required = true)
    protected String authenticator;
    @XmlElement(name = "TrackingEvents", required = true)
    protected ArrayOfTrackingEvent trackingEvents;
    @XmlElement(name = "GuaranteedDeliveryDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar guaranteedDeliveryDate;
    @XmlElement(name = "ExpectedDeliveryDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedDeliveryDate;
    @XmlElement(name = "ServiceDescription")
    protected String serviceDescription;
    @XmlElement(name = "Carrier")
    protected String carrier;
    @XmlElement(name = "DestinationInfo")
    protected DestinationInfo destinationInfo;

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
     * Gets the value of the trackingEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrackingEvent }
     *     
     */
    public ArrayOfTrackingEvent getTrackingEvents() {
        return trackingEvents;
    }

    /**
     * Sets the value of the trackingEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrackingEvent }
     *     
     */
    public void setTrackingEvents(ArrayOfTrackingEvent value) {
        this.trackingEvents = value;
    }

    /**
     * Gets the value of the guaranteedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGuaranteedDeliveryDate() {
        return guaranteedDeliveryDate;
    }

    /**
     * Sets the value of the guaranteedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGuaranteedDeliveryDate(XMLGregorianCalendar value) {
        this.guaranteedDeliveryDate = value;
    }

    /**
     * Gets the value of the expectedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    /**
     * Sets the value of the expectedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDeliveryDate(XMLGregorianCalendar value) {
        this.expectedDeliveryDate = value;
    }

    /**
     * Gets the value of the serviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Sets the value of the serviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDescription(String value) {
        this.serviceDescription = value;
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
     * Gets the value of the destinationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationInfo }
     *     
     */
    public DestinationInfo getDestinationInfo() {
        return destinationInfo;
    }

    /**
     * Sets the value of the destinationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationInfo }
     *     
     */
    public void setDestinationInfo(DestinationInfo value) {
        this.destinationInfo = value;
    }

}
