
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="LastLoginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ClearCredential" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LoginBannerText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PasswordExpired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CodewordsSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "lastLoginTime",
    "clearCredential",
    "loginBannerText",
    "passwordExpired",
    "codewordsSet"
})
@XmlRootElement(name = "AuthenticateUserResponse")
public class AuthenticateUserResponse {

    @XmlElement(name = "Authenticator", required = true)
    protected String authenticator;
    @XmlElement(name = "LastLoginTime", defaultValue = "0001-01-01T00:00:00")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLoginTime;
    @XmlElement(name = "ClearCredential")
    protected boolean clearCredential;
    @XmlElement(name = "LoginBannerText", required = true)
    protected String loginBannerText;
    @XmlElement(name = "PasswordExpired")
    protected boolean passwordExpired;
    @XmlElement(name = "CodewordsSet")
    protected boolean codewordsSet;

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
     * Gets the value of the lastLoginTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Sets the value of the lastLoginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLoginTime(XMLGregorianCalendar value) {
        this.lastLoginTime = value;
    }

    /**
     * Gets the value of the clearCredential property.
     * 
     */
    public boolean isClearCredential() {
        return clearCredential;
    }

    /**
     * Sets the value of the clearCredential property.
     * 
     */
    public void setClearCredential(boolean value) {
        this.clearCredential = value;
    }

    /**
     * Gets the value of the loginBannerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginBannerText() {
        return loginBannerText;
    }

    /**
     * Sets the value of the loginBannerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginBannerText(String value) {
        this.loginBannerText = value;
    }

    /**
     * Gets the value of the passwordExpired property.
     * 
     */
    public boolean isPasswordExpired() {
        return passwordExpired;
    }

    /**
     * Sets the value of the passwordExpired property.
     * 
     */
    public void setPasswordExpired(boolean value) {
        this.passwordExpired = value;
    }

    /**
     * Gets the value of the codewordsSet property.
     * 
     */
    public boolean isCodewordsSet() {
        return codewordsSet;
    }

    /**
     * Sets the value of the codewordsSet property.
     * 
     */
    public void setCodewordsSet(boolean value) {
        this.codewordsSet = value;
    }

}
