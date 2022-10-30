
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationSetting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotificationSettingId" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="NotificationSettingProperties" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}NotificationSettingProperties" minOccurs="0"/&gt;
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationSetting", propOrder = {
    "notificationSettingId",
    "notificationSettingProperties",
    "reference"
})
public class NotificationSetting {

    @XmlElement(name = "NotificationSettingId", required = true)
    protected String notificationSettingId;
    @XmlElement(name = "NotificationSettingProperties")
    protected NotificationSettingProperties notificationSettingProperties;
    @XmlElement(name = "Reference")
    protected String reference;

    /**
     * Gets the value of the notificationSettingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationSettingId() {
        return notificationSettingId;
    }

    /**
     * Sets the value of the notificationSettingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationSettingId(String value) {
        this.notificationSettingId = value;
    }

    /**
     * Gets the value of the notificationSettingProperties property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationSettingProperties }
     *     
     */
    public NotificationSettingProperties getNotificationSettingProperties() {
        return notificationSettingProperties;
    }

    /**
     * Sets the value of the notificationSettingProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationSettingProperties }
     *     
     */
    public void setNotificationSettingProperties(NotificationSettingProperties value) {
        this.notificationSettingProperties = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

}
