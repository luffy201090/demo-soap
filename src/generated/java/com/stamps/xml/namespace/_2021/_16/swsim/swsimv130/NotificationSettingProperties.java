
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationSettingProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationSettingProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Triggers" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfTrigger" minOccurs="0"/&gt;
 *         &lt;element name="EmailConfig" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}EmailConfig" minOccurs="0"/&gt;
 *         &lt;element name="AllowSMSOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationSettingProperties", propOrder = {
    "triggers",
    "emailConfig",
    "allowSMSOptIn"
})
public class NotificationSettingProperties {

    @XmlElement(name = "Triggers")
    protected ArrayOfTrigger triggers;
    @XmlElement(name = "EmailConfig")
    protected EmailConfig emailConfig;
    @XmlElementRef(name = "AllowSMSOptIn", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> allowSMSOptIn;

    /**
     * Gets the value of the triggers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrigger }
     *     
     */
    public ArrayOfTrigger getTriggers() {
        return triggers;
    }

    /**
     * Sets the value of the triggers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrigger }
     *     
     */
    public void setTriggers(ArrayOfTrigger value) {
        this.triggers = value;
    }

    /**
     * Gets the value of the emailConfig property.
     * 
     * @return
     *     possible object is
     *     {@link EmailConfig }
     *     
     */
    public EmailConfig getEmailConfig() {
        return emailConfig;
    }

    /**
     * Sets the value of the emailConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailConfig }
     *     
     */
    public void setEmailConfig(EmailConfig value) {
        this.emailConfig = value;
    }

    /**
     * Gets the value of the allowSMSOptIn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAllowSMSOptIn() {
        return allowSMSOptIn;
    }

    /**
     * Sets the value of the allowSMSOptIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAllowSMSOptIn(JAXBElement<Boolean> value) {
        this.allowSMSOptIn = value;
    }

}
