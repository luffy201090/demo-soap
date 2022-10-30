
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Trigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Trigger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotificationType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}NotificationType"/&gt;
 *         &lt;element name="Channels" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfChannel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trigger", propOrder = {
    "notificationType",
    "channels"
})
public class Trigger {

    @XmlElement(name = "NotificationType", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationType notificationType;
    @XmlElement(name = "Channels")
    protected ArrayOfChannel channels;

    /**
     * Gets the value of the notificationType property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType }
     *     
     */
    public NotificationType getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType }
     *     
     */
    public void setNotificationType(NotificationType value) {
        this.notificationType = value;
    }

    /**
     * Gets the value of the channels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChannel }
     *     
     */
    public ArrayOfChannel getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChannel }
     *     
     */
    public void setChannels(ArrayOfChannel value) {
        this.channels = value;
    }

}
