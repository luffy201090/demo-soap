
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
 *         &lt;element name="UserOwnedAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Carrier" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Carrier"/&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountZIPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Address" minOccurs="0"/&gt;
 *         &lt;element name="AgreeToEula" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Invoice" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Invoice" minOccurs="0"/&gt;
 *         &lt;element name="NegotiatedRates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeviceIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientSecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickupNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DistributionCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "userOwnedAccount",
    "carrier",
    "accountNumber",
    "accountZIPCode",
    "accountCountry",
    "address",
    "agreeToEula",
    "invoice",
    "negotiatedRates",
    "deviceIdentity",
    "clientId",
    "clientSecret",
    "pickupNumber",
    "distributionCenter"
})
@XmlRootElement(name = "AddCarrier")
public class AddCarrier {

    @XmlElement(name = "Authenticator")
    protected String authenticator;
    @XmlElement(name = "Credentials")
    protected Credentials credentials;
    @XmlElement(name = "UserOwnedAccount")
    protected boolean userOwnedAccount;
    @XmlElement(name = "Carrier", required = true)
    @XmlSchemaType(name = "string")
    protected Carrier carrier;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "AccountZIPCode")
    protected String accountZIPCode;
    @XmlElement(name = "AccountCountry", defaultValue = "US")
    protected String accountCountry;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "AgreeToEula", defaultValue = "false")
    protected Boolean agreeToEula;
    @XmlElement(name = "Invoice")
    protected Invoice invoice;
    @XmlElement(name = "NegotiatedRates", defaultValue = "false")
    protected Boolean negotiatedRates;
    @XmlElement(name = "DeviceIdentity")
    protected String deviceIdentity;
    @XmlElement(name = "ClientId")
    protected String clientId;
    @XmlElement(name = "ClientSecret")
    protected String clientSecret;
    @XmlElement(name = "PickupNumber")
    protected String pickupNumber;
    @XmlElement(name = "DistributionCenter")
    protected String distributionCenter;

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
     * Gets the value of the userOwnedAccount property.
     * 
     */
    public boolean isUserOwnedAccount() {
        return userOwnedAccount;
    }

    /**
     * Sets the value of the userOwnedAccount property.
     * 
     */
    public void setUserOwnedAccount(boolean value) {
        this.userOwnedAccount = value;
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
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountZIPCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountZIPCode() {
        return accountZIPCode;
    }

    /**
     * Sets the value of the accountZIPCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountZIPCode(String value) {
        this.accountZIPCode = value;
    }

    /**
     * Gets the value of the accountCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCountry() {
        return accountCountry;
    }

    /**
     * Sets the value of the accountCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCountry(String value) {
        this.accountCountry = value;
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
     * Gets the value of the agreeToEula property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgreeToEula() {
        return agreeToEula;
    }

    /**
     * Sets the value of the agreeToEula property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgreeToEula(Boolean value) {
        this.agreeToEula = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice }
     *     
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice }
     *     
     */
    public void setInvoice(Invoice value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the negotiatedRates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegotiatedRates() {
        return negotiatedRates;
    }

    /**
     * Sets the value of the negotiatedRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegotiatedRates(Boolean value) {
        this.negotiatedRates = value;
    }

    /**
     * Gets the value of the deviceIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceIdentity() {
        return deviceIdentity;
    }

    /**
     * Sets the value of the deviceIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceIdentity(String value) {
        this.deviceIdentity = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the clientSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Sets the value of the clientSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSecret(String value) {
        this.clientSecret = value;
    }

    /**
     * Gets the value of the pickupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupNumber() {
        return pickupNumber;
    }

    /**
     * Sets the value of the pickupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupNumber(String value) {
        this.pickupNumber = value;
    }

    /**
     * Gets the value of the distributionCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionCenter() {
        return distributionCenter;
    }

    /**
     * Sets the value of the distributionCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionCenter(String value) {
        this.distributionCenter = value;
    }

}
