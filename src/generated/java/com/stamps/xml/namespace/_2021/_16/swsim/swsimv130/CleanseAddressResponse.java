
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
 *         &lt;element name="Authenticator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Address" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Address"/&gt;
 *         &lt;element name="AddressMatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CityStateZipOK" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ResidentialDeliveryIndicator" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ResidentialDeliveryIndicatorType"/&gt;
 *         &lt;element name="IsPOBox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CandidateAddresses" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfAddress"/&gt;
 *         &lt;element name="StatusCodes" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}StatusCodes"/&gt;
 *         &lt;element name="Rates" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfRateV45" minOccurs="0"/&gt;
 *         &lt;element name="AddressCleansingResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VerificationLevel" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}AddressVerificationLevel"/&gt;
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
    "address",
    "addressMatch",
    "cityStateZipOK",
    "residentialDeliveryIndicator",
    "isPOBox",
    "candidateAddresses",
    "statusCodes",
    "rates",
    "addressCleansingResult",
    "verificationLevel"
})
@XmlRootElement(name = "CleanseAddressResponse")
public class CleanseAddressResponse {

    @XmlElement(name = "Authenticator", required = true)
    protected String authenticator;
    @XmlElement(name = "Address", required = true)
    protected Address address;
    @XmlElement(name = "AddressMatch")
    protected boolean addressMatch;
    @XmlElement(name = "CityStateZipOK")
    protected boolean cityStateZipOK;
    @XmlElement(name = "ResidentialDeliveryIndicator", required = true)
    @XmlSchemaType(name = "string")
    protected ResidentialDeliveryIndicatorType residentialDeliveryIndicator;
    @XmlElementRef(name = "IsPOBox", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isPOBox;
    @XmlElement(name = "CandidateAddresses", required = true)
    protected ArrayOfAddress candidateAddresses;
    @XmlElement(name = "StatusCodes", required = true)
    protected StatusCodes statusCodes;
    @XmlElement(name = "Rates")
    protected ArrayOfRateV45 rates;
    @XmlElement(name = "AddressCleansingResult")
    protected String addressCleansingResult;
    @XmlElement(name = "VerificationLevel", required = true)
    @XmlSchemaType(name = "string")
    protected AddressVerificationLevel verificationLevel;

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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the addressMatch property.
     * 
     */
    public boolean isAddressMatch() {
        return addressMatch;
    }

    /**
     * Sets the value of the addressMatch property.
     * 
     */
    public void setAddressMatch(boolean value) {
        this.addressMatch = value;
    }

    /**
     * Gets the value of the cityStateZipOK property.
     * 
     */
    public boolean isCityStateZipOK() {
        return cityStateZipOK;
    }

    /**
     * Sets the value of the cityStateZipOK property.
     * 
     */
    public void setCityStateZipOK(boolean value) {
        this.cityStateZipOK = value;
    }

    /**
     * Gets the value of the residentialDeliveryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ResidentialDeliveryIndicatorType }
     *     
     */
    public ResidentialDeliveryIndicatorType getResidentialDeliveryIndicator() {
        return residentialDeliveryIndicator;
    }

    /**
     * Sets the value of the residentialDeliveryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidentialDeliveryIndicatorType }
     *     
     */
    public void setResidentialDeliveryIndicator(ResidentialDeliveryIndicatorType value) {
        this.residentialDeliveryIndicator = value;
    }

    /**
     * Gets the value of the isPOBox property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsPOBox() {
        return isPOBox;
    }

    /**
     * Sets the value of the isPOBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsPOBox(JAXBElement<Boolean> value) {
        this.isPOBox = value;
    }

    /**
     * Gets the value of the candidateAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddress }
     *     
     */
    public ArrayOfAddress getCandidateAddresses() {
        return candidateAddresses;
    }

    /**
     * Sets the value of the candidateAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddress }
     *     
     */
    public void setCandidateAddresses(ArrayOfAddress value) {
        this.candidateAddresses = value;
    }

    /**
     * Gets the value of the statusCodes property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCodes }
     *     
     */
    public StatusCodes getStatusCodes() {
        return statusCodes;
    }

    /**
     * Sets the value of the statusCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodes }
     *     
     */
    public void setStatusCodes(StatusCodes value) {
        this.statusCodes = value;
    }

    /**
     * Gets the value of the rates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRateV45 }
     *     
     */
    public ArrayOfRateV45 getRates() {
        return rates;
    }

    /**
     * Sets the value of the rates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRateV45 }
     *     
     */
    public void setRates(ArrayOfRateV45 value) {
        this.rates = value;
    }

    /**
     * Gets the value of the addressCleansingResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCleansingResult() {
        return addressCleansingResult;
    }

    /**
     * Sets the value of the addressCleansingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCleansingResult(String value) {
        this.addressCleansingResult = value;
    }

    /**
     * Gets the value of the verificationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AddressVerificationLevel }
     *     
     */
    public AddressVerificationLevel getVerificationLevel() {
        return verificationLevel;
    }

    /**
     * Sets the value of the verificationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressVerificationLevel }
     *     
     */
    public void setVerificationLevel(AddressVerificationLevel value) {
        this.verificationLevel = value;
    }

}
