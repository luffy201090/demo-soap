
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ContactInformation" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CarrierPickupContactInformation" minOccurs="0"/&gt;
 *         &lt;element name="PackageInformation" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CarrierPickupPackageInformation" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Carrier" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Carrier" minOccurs="0"/&gt;
 *         &lt;element name="PickupType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CarrierPickupType" minOccurs="0"/&gt;
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
    "contactInformation",
    "packageInformation",
    "confirmationNumber",
    "carrier",
    "pickupType"
})
@XmlRootElement(name = "ModifyCarrierPickup")
public class ModifyCarrierPickup {

    @XmlElement(name = "Authenticator")
    protected String authenticator;
    @XmlElement(name = "Credentials")
    protected Credentials credentials;
    @XmlElement(name = "ContactInformation")
    protected CarrierPickupContactInformation contactInformation;
    @XmlElement(name = "PackageInformation")
    protected CarrierPickupPackageInformation packageInformation;
    @XmlElement(name = "ConfirmationNumber", required = true)
    protected String confirmationNumber;
    @XmlElement(name = "Carrier", defaultValue = "USPS")
    @XmlSchemaType(name = "string")
    protected Carrier carrier;
    @XmlElement(name = "PickupType", defaultValue = "Default")
    @XmlSchemaType(name = "string")
    protected CarrierPickupType pickupType;

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
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierPickupContactInformation }
     *     
     */
    public CarrierPickupContactInformation getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierPickupContactInformation }
     *     
     */
    public void setContactInformation(CarrierPickupContactInformation value) {
        this.contactInformation = value;
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
