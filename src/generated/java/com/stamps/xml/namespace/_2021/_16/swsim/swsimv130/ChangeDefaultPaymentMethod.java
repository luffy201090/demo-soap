
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
 *         &lt;choice&gt;
 *           &lt;element name="Authenticator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="Credentials" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Credentials" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="MachineInfo" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}MachineInfo"/&gt;
 *         &lt;element name="PaymentType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}DefaultPaymentMethodTypeOptions" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethodID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "machineInfo",
    "paymentType",
    "paymentMethodID",
    "sendEmail"
})
@XmlRootElement(name = "ChangeDefaultPaymentMethod")
public class ChangeDefaultPaymentMethod {

    @XmlElement(name = "Authenticator")
    protected String authenticator;
    @XmlElement(name = "Credentials")
    protected Credentials credentials;
    @XmlElement(name = "MachineInfo", required = true)
    protected MachineInfo machineInfo;
    @XmlElement(name = "PaymentType")
    @XmlSchemaType(name = "string")
    protected DefaultPaymentMethodTypeOptions paymentType;
    @XmlElement(name = "PaymentMethodID")
    protected String paymentMethodID;
    @XmlElementRef(name = "SendEmail", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sendEmail;

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
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultPaymentMethodTypeOptions }
     *     
     */
    public DefaultPaymentMethodTypeOptions getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultPaymentMethodTypeOptions }
     *     
     */
    public void setPaymentType(DefaultPaymentMethodTypeOptions value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the paymentMethodID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodID() {
        return paymentMethodID;
    }

    /**
     * Sets the value of the paymentMethodID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodID(String value) {
        this.paymentMethodID = value;
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

}
