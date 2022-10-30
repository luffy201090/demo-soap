
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="Authenticator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PickUpDayOfWeek" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PickupTimeEarliest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickupTimeLatest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
    "pickupDate",
    "pickUpDayOfWeek",
    "confirmationNumber",
    "pickupTimeEarliest",
    "pickupTimeLatest",
    "estimatedAmount"
})
@XmlRootElement(name = "ScheduleCarrierPickupResponse")
public class ScheduleCarrierPickupResponse {

    @XmlElement(name = "Authenticator", required = true)
    protected String authenticator;
    @XmlElement(name = "PickupDate", required = true)
    protected String pickupDate;
    @XmlElement(name = "PickUpDayOfWeek", required = true)
    protected String pickUpDayOfWeek;
    @XmlElement(name = "ConfirmationNumber", required = true)
    protected String confirmationNumber;
    @XmlElement(name = "PickupTimeEarliest", defaultValue = "")
    protected String pickupTimeEarliest;
    @XmlElement(name = "PickupTimeLatest", defaultValue = "")
    protected String pickupTimeLatest;
    @XmlElement(name = "EstimatedAmount", required = true)
    protected BigDecimal estimatedAmount;

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
     * Gets the value of the pickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupDate() {
        return pickupDate;
    }

    /**
     * Sets the value of the pickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupDate(String value) {
        this.pickupDate = value;
    }

    /**
     * Gets the value of the pickUpDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDayOfWeek() {
        return pickUpDayOfWeek;
    }

    /**
     * Sets the value of the pickUpDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDayOfWeek(String value) {
        this.pickUpDayOfWeek = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

    /**
     * Gets the value of the pickupTimeEarliest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupTimeEarliest() {
        return pickupTimeEarliest;
    }

    /**
     * Sets the value of the pickupTimeEarliest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupTimeEarliest(String value) {
        this.pickupTimeEarliest = value;
    }

    /**
     * Gets the value of the pickupTimeLatest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupTimeLatest() {
        return pickupTimeLatest;
    }

    /**
     * Sets the value of the pickupTimeLatest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupTimeLatest(String value) {
        this.pickupTimeLatest = value;
    }

    /**
     * Gets the value of the estimatedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstimatedAmount() {
        return estimatedAmount;
    }

    /**
     * Sets the value of the estimatedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstimatedAmount(BigDecimal value) {
        this.estimatedAmount = value;
    }

}
