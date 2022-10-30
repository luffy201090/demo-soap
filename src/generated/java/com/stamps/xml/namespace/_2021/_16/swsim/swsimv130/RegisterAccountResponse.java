
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
 *         &lt;element name="RegistrationStatus" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}RegistrationStatus"/&gt;
 *         &lt;element name="SuggestedUserName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PromoUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "registrationStatus",
    "suggestedUserName",
    "userId",
    "promoUrl"
})
@XmlRootElement(name = "RegisterAccountResponse")
public class RegisterAccountResponse {

    @XmlElement(name = "RegistrationStatus", required = true)
    @XmlSchemaType(name = "string")
    protected RegistrationStatus registrationStatus;
    @XmlElement(name = "SuggestedUserName", required = true)
    protected String suggestedUserName;
    @XmlElement(name = "UserId")
    protected int userId;
    @XmlElement(name = "PromoUrl", required = true)
    protected String promoUrl;

    /**
     * Gets the value of the registrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationStatus }
     *     
     */
    public RegistrationStatus getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Sets the value of the registrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationStatus }
     *     
     */
    public void setRegistrationStatus(RegistrationStatus value) {
        this.registrationStatus = value;
    }

    /**
     * Gets the value of the suggestedUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestedUserName() {
        return suggestedUserName;
    }

    /**
     * Sets the value of the suggestedUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestedUserName(String value) {
        this.suggestedUserName = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

    /**
     * Gets the value of the promoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoUrl() {
        return promoUrl;
    }

    /**
     * Sets the value of the promoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoUrl(String value) {
        this.promoUrl = value;
    }

}
