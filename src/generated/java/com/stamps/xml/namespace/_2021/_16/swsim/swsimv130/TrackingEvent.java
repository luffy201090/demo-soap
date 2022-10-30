
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrackingEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackingEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Event" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TrackingEventType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}TrackingEventType"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SignedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AuthorizedAgent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingEvent", propOrder = {
    "timestamp",
    "event",
    "trackingEventType",
    "city",
    "state",
    "zip",
    "country",
    "signedBy",
    "authorizedAgent"
})
public class TrackingEvent {

    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "Event", required = true)
    protected String event;
    @XmlElement(name = "TrackingEventType", required = true)
    @XmlSchemaType(name = "string")
    protected TrackingEventType trackingEventType;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "State", required = true)
    protected String state;
    @XmlElement(name = "Zip", required = true)
    protected String zip;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "SignedBy", required = true)
    protected String signedBy;
    @XmlElement(name = "AuthorizedAgent")
    protected boolean authorizedAgent;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent(String value) {
        this.event = value;
    }

    /**
     * Gets the value of the trackingEventType property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingEventType }
     *     
     */
    public TrackingEventType getTrackingEventType() {
        return trackingEventType;
    }

    /**
     * Sets the value of the trackingEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingEventType }
     *     
     */
    public void setTrackingEventType(TrackingEventType value) {
        this.trackingEventType = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the signedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedBy() {
        return signedBy;
    }

    /**
     * Sets the value of the signedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedBy(String value) {
        this.signedBy = value;
    }

    /**
     * Gets the value of the authorizedAgent property.
     * 
     */
    public boolean isAuthorizedAgent() {
        return authorizedAgent;
    }

    /**
     * Sets the value of the authorizedAgent property.
     * 
     */
    public void setAuthorizedAgent(boolean value) {
        this.authorizedAgent = value;
    }

}
