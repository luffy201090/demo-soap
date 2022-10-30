
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CarrierPickupInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierPickupInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Carrier" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Carrier"/&gt;
 *         &lt;element name="PickupDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PickUpDayOfWeek" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContactInformation" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CarrierPickupContactInformationV2"/&gt;
 *         &lt;element name="Address" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CarrierPickupAddressV2"/&gt;
 *         &lt;element name="PackageInformation" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CarrierPickupPackageInformation"/&gt;
 *         &lt;element name="PickupTimeEarliest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickupTimeLatest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PickupType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CarrierPickupType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierPickupInformation", propOrder = {
    "confirmationNumber",
    "carrier",
    "pickupDate",
    "pickUpDayOfWeek",
    "contactInformation",
    "address",
    "packageInformation",
    "pickupTimeEarliest",
    "pickupTimeLatest",
    "estimatedAmount",
    "pickupType"
})
public class CarrierPickupInformation {

    @XmlElement(name = "ConfirmationNumber", required = true)
    protected String confirmationNumber;
    @XmlElement(name = "Carrier", required = true)
    @XmlSchemaType(name = "string")
    protected Carrier carrier;
    @XmlElement(name = "PickupDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickupDate;
    @XmlElement(name = "PickUpDayOfWeek", required = true)
    protected String pickUpDayOfWeek;
    @XmlElement(name = "ContactInformation", required = true)
    protected CarrierPickupContactInformationV2 contactInformation;
    @XmlElement(name = "Address", required = true)
    protected CarrierPickupAddressV2 address;
    @XmlElement(name = "PackageInformation", required = true)
    protected CarrierPickupPackageInformation packageInformation;
    @XmlElement(name = "PickupTimeEarliest", defaultValue = "")
    protected String pickupTimeEarliest;
    @XmlElement(name = "PickupTimeLatest", defaultValue = "")
    protected String pickupTimeLatest;
    @XmlElement(name = "EstimatedAmount", required = true)
    protected BigDecimal estimatedAmount;
    @XmlElement(name = "PickupType", required = true)
    @XmlSchemaType(name = "string")
    protected CarrierPickupType pickupType;

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
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link Carrier }
     *     
     */
    public Carrier getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Carrier }
     *     
     */
    public void setCarrier(Carrier value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the pickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickupDate() {
        return pickupDate;
    }

    /**
     * Sets the value of the pickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickupDate(XMLGregorianCalendar value) {
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
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierPickupContactInformationV2 }
     *     
     */
    public CarrierPickupContactInformationV2 getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierPickupContactInformationV2 }
     *     
     */
    public void setContactInformation(CarrierPickupContactInformationV2 value) {
        this.contactInformation = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierPickupAddressV2 }
     *     
     */
    public CarrierPickupAddressV2 getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierPickupAddressV2 }
     *     
     */
    public void setAddress(CarrierPickupAddressV2 value) {
        this.address = value;
    }

    /**
     * Gets the value of the packageInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierPickupPackageInformation }
     *     
     */
    public CarrierPickupPackageInformation getPackageInformation() {
        return packageInformation;
    }

    /**
     * Sets the value of the packageInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierPickupPackageInformation }
     *     
     */
    public void setPackageInformation(CarrierPickupPackageInformation value) {
        this.packageInformation = value;
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

    /**
     * Gets the value of the pickupType property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierPickupType }
     *     
     */
    public CarrierPickupType getPickupType() {
        return pickupType;
    }

    /**
     * Sets the value of the pickupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierPickupType }
     *     
     */
    public void setPickupType(CarrierPickupType value) {
        this.pickupType = value;
    }

}
