
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
 *         &lt;choice&gt;
 *           &lt;element name="Authenticator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="Credentials" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Credentials" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="NotificationSetting" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}NotificationSetting" minOccurs="0"/&gt;
 *         &lt;element name="SetAsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "notificationSetting",
    "setAsDefault"
})
@XmlRootElement(name = "ModifyNotificationSetting")
public class ModifyNotificationSetting {

    @XmlElement(name = "Authenticator")
    protected String authenticator;
    @XmlElement(name = "Credentials")
    protected Credentials credentials;
    @XmlElement(name = "NotificationSetting")
    protected NotificationSetting notificationSetting;
    @XmlElement(name = "SetAsDefault", defaultValue = "false")
    protected Boolean setAsDefault;

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
     * Gets the value of the notificationSetting property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationSetting }
     *     
     */
    public NotificationSetting getNotificationSetting() {
        return notificationSetting;
    }

    /**
     * Sets the value of the notificationSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationSetting }
     *     
     */
    public void setNotificationSetting(NotificationSetting value) {
        this.notificationSetting = value;
    }

    /**
     * Gets the value of the setAsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetAsDefault() {
        return setAsDefault;
    }

    /**
     * Sets the value of the setAsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetAsDefault(Boolean value) {
        this.setAsDefault = value;
    }

}
