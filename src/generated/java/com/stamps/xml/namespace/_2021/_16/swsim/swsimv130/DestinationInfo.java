
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DestinationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DestinationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DestinationCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DestinationState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DestinationZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DestinationCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationInfo", propOrder = {
    "destinationCity",
    "destinationState",
    "destinationZip",
    "destinationCountry"
})
public class DestinationInfo {

    @XmlElement(name = "DestinationCity", required = true)
    protected String destinationCity;
    @XmlElement(name = "DestinationState", required = true)
    protected String destinationState;
    @XmlElement(name = "DestinationZip", required = true)
    protected String destinationZip;
    @XmlElement(name = "DestinationCountry", required = true)
    protected String destinationCountry;

    /**
     * Gets the value of the destinationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCity() {
        return destinationCity;
    }

    /**
     * Sets the value of the destinationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCity(String value) {
        this.destinationCity = value;
    }

    /**
     * Gets the value of the destinationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationState() {
        return destinationState;
    }

    /**
     * Sets the value of the destinationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationState(String value) {
        this.destinationState = value;
    }

    /**
     * Gets the value of the destinationZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationZip() {
        return destinationZip;
    }

    /**
     * Sets the value of the destinationZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationZip(String value) {
        this.destinationZip = value;
    }

    /**
     * Gets the value of the destinationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /**
     * Sets the value of the destinationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountry(String value) {
        this.destinationCountry = value;
    }

}
