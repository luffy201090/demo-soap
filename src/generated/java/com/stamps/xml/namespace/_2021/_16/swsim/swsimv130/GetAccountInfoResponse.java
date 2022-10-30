
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

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
 *         &lt;element name="AccountInfo" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}AccountInfoV65"/&gt;
 *         &lt;element name="Address" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Address"/&gt;
 *         &lt;element name="CustomerEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateAdvanceConfig" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}DateAdvance"/&gt;
 *         &lt;element name="VerificationPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VerificationPhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "accountInfo",
    "address",
    "customerEmail",
    "accountStatus",
    "dateAdvanceConfig",
    "verificationPhoneNumber",
    "verificationPhoneExtension"
})
@XmlRootElement(name = "GetAccountInfoResponse")
public class GetAccountInfoResponse {

    @XmlElement(name = "Authenticator", required = true)
    protected String authenticator;
    @XmlElement(name = "AccountInfo", required = true)
    protected AccountInfoV65 accountInfo;
    @XmlElement(name = "Address", required = true)
    protected Address address;
    @XmlElement(name = "CustomerEmail", required = true)
    protected String customerEmail;
    @XmlElement(name = "AccountStatus")
    protected String accountStatus;
    @XmlElement(name = "DateAdvanceConfig", required = true)
    protected DateAdvance dateAdvanceConfig;
    @XmlElement(name = "VerificationPhoneNumber")
    protected String verificationPhoneNumber;
    @XmlElement(name = "VerificationPhoneExtension")
    protected String verificationPhoneExtension;

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
     * Gets the value of the accountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfoV65 }
     *     
     */
    public AccountInfoV65 getAccountInfo() {
        return accountInfo;
    }

    /**
     * Sets the value of the accountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfoV65 }
     *     
     */
    public void setAccountInfo(AccountInfoV65 value) {
        this.accountInfo = value;
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
     * Gets the value of the customerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Sets the value of the customerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmail(String value) {
        this.customerEmail = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the dateAdvanceConfig property.
     * 
     * @return
     *     possible object is
     *     {@link DateAdvance }
     *     
     */
    public DateAdvance getDateAdvanceConfig() {
        return dateAdvanceConfig;
    }

    /**
     * Sets the value of the dateAdvanceConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAdvance }
     *     
     */
    public void setDateAdvanceConfig(DateAdvance value) {
        this.dateAdvanceConfig = value;
    }

    /**
     * Gets the value of the verificationPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationPhoneNumber() {
        return verificationPhoneNumber;
    }

    /**
     * Sets the value of the verificationPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationPhoneNumber(String value) {
        this.verificationPhoneNumber = value;
    }

    /**
     * Gets the value of the verificationPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationPhoneExtension() {
        return verificationPhoneExtension;
    }

    /**
     * Sets the value of the verificationPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationPhoneExtension(String value) {
        this.verificationPhoneExtension = value;
    }

}
