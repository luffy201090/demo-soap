
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AchAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AchAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AchAccountType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}AchAccountType"/&gt;
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AchAccount", propOrder = {
    "achAccountType",
    "bankName",
    "accountNumber",
    "routeID",
    "accountHolderName"
})
public class AchAccount {

    @XmlElement(name = "AchAccountType", required = true)
    @XmlSchemaType(name = "string")
    protected AchAccountType achAccountType;
    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "RouteID")
    protected String routeID;
    @XmlElement(name = "AccountHolderName")
    protected String accountHolderName;

    /**
     * Gets the value of the achAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link AchAccountType }
     *     
     */
    public AchAccountType getAchAccountType() {
        return achAccountType;
    }

    /**
     * Sets the value of the achAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AchAccountType }
     *     
     */
    public void setAchAccountType(AchAccountType value) {
        this.achAccountType = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
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
     * Gets the value of the routeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteID() {
        return routeID;
    }

    /**
     * Sets the value of the routeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteID(String value) {
        this.routeID = value;
    }

    /**
     * Gets the value of the accountHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Sets the value of the accountHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderName(String value) {
        this.accountHolderName = value;
    }

}
