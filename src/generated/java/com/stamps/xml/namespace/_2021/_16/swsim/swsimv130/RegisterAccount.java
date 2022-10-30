
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
 *         &lt;element name="IntegrationID" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Codeword1Type" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CodewordType" minOccurs="0"/&gt;
 *         &lt;element name="Codeword1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Codeword2Type" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CodewordType" minOccurs="0"/&gt;
 *         &lt;element name="Codeword2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalAddress" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Address"/&gt;
 *         &lt;element name="MailingAddress" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Address" minOccurs="0"/&gt;
 *         &lt;element name="MachineInfo" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}MachineInfo"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}AccountType"/&gt;
 *         &lt;element name="PromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="CreditCard" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CreditCard" minOccurs="0"/&gt;
 *           &lt;element name="AchAccount" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}AchAccount" minOccurs="0"/&gt;
 *           &lt;element name="PPL" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PPLAccount" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="SendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResetPasswordAfterRegistration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "integrationID",
    "userName",
    "password",
    "codeword1Type",
    "codeword1",
    "codeword2Type",
    "codeword2",
    "physicalAddress",
    "mailingAddress",
    "machineInfo",
    "email",
    "accountType",
    "promoCode",
    "creditCard",
    "achAccount",
    "ppl",
    "sendEmail",
    "resetPasswordAfterRegistration",
    "userCurrency"
})
@XmlRootElement(name = "RegisterAccount")
public class RegisterAccount {

    @XmlElement(name = "IntegrationID", required = true)
    protected String integrationID;
    @XmlElement(name = "UserName", required = true)
    protected String userName;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "Codeword1Type")
    @XmlSchemaType(name = "string")
    protected CodewordType codeword1Type;
    @XmlElement(name = "Codeword1")
    protected String codeword1;
    @XmlElement(name = "Codeword2Type")
    @XmlSchemaType(name = "string")
    protected CodewordType codeword2Type;
    @XmlElement(name = "Codeword2")
    protected String codeword2;
    @XmlElement(name = "PhysicalAddress", required = true)
    protected Address physicalAddress;
    @XmlElement(name = "MailingAddress")
    protected Address mailingAddress;
    @XmlElement(name = "MachineInfo", required = true)
    protected MachineInfo machineInfo;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "AccountType", required = true)
    @XmlSchemaType(name = "string")
    protected AccountType accountType;
    @XmlElement(name = "PromoCode")
    protected String promoCode;
    @XmlElement(name = "CreditCard")
    protected CreditCard creditCard;
    @XmlElement(name = "AchAccount")
    protected AchAccount achAccount;
    @XmlElement(name = "PPL")
    protected PPLAccount ppl;
    @XmlElementRef(name = "SendEmail", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sendEmail;
    @XmlElementRef(name = "ResetPasswordAfterRegistration", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> resetPasswordAfterRegistration;
    @XmlElement(name = "UserCurrency", defaultValue = "USD")
    protected String userCurrency;

    /**
     * Gets the value of the integrationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationID() {
        return integrationID;
    }

    /**
     * Sets the value of the integrationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationID(String value) {
        this.integrationID = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the codeword1Type property.
     * 
     * @return
     *     possible object is
     *     {@link CodewordType }
     *     
     */
    public CodewordType getCodeword1Type() {
        return codeword1Type;
    }

    /**
     * Sets the value of the codeword1Type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodewordType }
     *     
     */
    public void setCodeword1Type(CodewordType value) {
        this.codeword1Type = value;
    }

    /**
     * Gets the value of the codeword1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeword1() {
        return codeword1;
    }

    /**
     * Sets the value of the codeword1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeword1(String value) {
        this.codeword1 = value;
    }

    /**
     * Gets the value of the codeword2Type property.
     * 
     * @return
     *     possible object is
     *     {@link CodewordType }
     *     
     */
    public CodewordType getCodeword2Type() {
        return codeword2Type;
    }

    /**
     * Sets the value of the codeword2Type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodewordType }
     *     
     */
    public void setCodeword2Type(CodewordType value) {
        this.codeword2Type = value;
    }

    /**
     * Gets the value of the codeword2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeword2() {
        return codeword2;
    }

    /**
     * Sets the value of the codeword2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeword2(String value) {
        this.codeword2 = value;
    }

    /**
     * Gets the value of the physicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * Sets the value of the physicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setPhysicalAddress(Address value) {
        this.physicalAddress = value;
    }

    /**
     * Gets the value of the mailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setMailingAddress(Address value) {
        this.mailingAddress = value;
    }

    /**
     * Gets the value of the machineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MachineInfo }
     *     
     */
    public MachineInfo getMachineInfo() {
        return machineInfo;
    }

    /**
     * Sets the value of the machineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MachineInfo }
     *     
     */
    public void setMachineInfo(MachineInfo value) {
        this.machineInfo = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountType(AccountType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the achAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AchAccount }
     *     
     */
    public AchAccount getAchAccount() {
        return achAccount;
    }

    /**
     * Sets the value of the achAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AchAccount }
     *     
     */
    public void setAchAccount(AchAccount value) {
        this.achAccount = value;
    }

    /**
     * Gets the value of the ppl property.
     * 
     * @return
     *     possible object is
     *     {@link PPLAccount }
     *     
     */
    public PPLAccount getPPL() {
        return ppl;
    }

    /**
     * Sets the value of the ppl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PPLAccount }
     *     
     */
    public void setPPL(PPLAccount value) {
        this.ppl = value;
    }

    /**
     * Gets the value of the sendEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSendEmail() {
        return sendEmail;
    }

    /**
     * Sets the value of the sendEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSendEmail(JAXBElement<Boolean> value) {
        this.sendEmail = value;
    }

    /**
     * Gets the value of the resetPasswordAfterRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getResetPasswordAfterRegistration() {
        return resetPasswordAfterRegistration;
    }

    /**
     * Sets the value of the resetPasswordAfterRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setResetPasswordAfterRegistration(JAXBElement<Boolean> value) {
        this.resetPasswordAfterRegistration = value;
    }

    /**
     * Gets the value of the userCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCurrency() {
        return userCurrency;
    }

    /**
     * Sets the value of the userCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCurrency(String value) {
        this.userCurrency = value;
    }

}
