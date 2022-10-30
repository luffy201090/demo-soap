
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="PurchaseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ControlTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MI" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}MachineInfo" minOccurs="0"/&gt;
 *         &lt;element name="IntegratorTxID" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-1-128" minOccurs="0"/&gt;
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
    "purchaseAmount",
    "controlTotal",
    "mi",
    "integratorTxID",
    "sendEmail"
})
@XmlRootElement(name = "PurchasePostage")
public class PurchasePostage {

    @XmlElement(name = "Authenticator")
    protected String authenticator;
    @XmlElement(name = "Credentials")
    protected Credentials credentials;
    @XmlElement(name = "PurchaseAmount", required = true)
    protected BigDecimal purchaseAmount;
    @XmlElement(name = "ControlTotal", required = true)
    protected BigDecimal controlTotal;
    @XmlElement(name = "MI")
    protected MachineInfo mi;
    @XmlElement(name = "IntegratorTxID")
    protected String integratorTxID;
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
     * Gets the value of the purchaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPurchaseAmount() {
        return purchaseAmount;
    }

    /**
     * Sets the value of the purchaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPurchaseAmount(BigDecimal value) {
        this.purchaseAmount = value;
    }

    /**
     * Gets the value of the controlTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getControlTotal() {
        return controlTotal;
    }

    /**
     * Sets the value of the controlTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setControlTotal(BigDecimal value) {
        this.controlTotal = value;
    }

    /**
     * Gets the value of the mi property.
     * 
     * @return
     *     possible object is
     *     {@link MachineInfo }
     *     
     */
    public MachineInfo getMI() {
        return mi;
    }

    /**
     * Sets the value of the mi property.
     * 
     * @param value
     *     allowed object is
     *     {@link MachineInfo }
     *     
     */
    public void setMI(MachineInfo value) {
        this.mi = value;
    }

    /**
     * Gets the value of the integratorTxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegratorTxID() {
        return integratorTxID;
    }

    /**
     * Sets the value of the integratorTxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegratorTxID(String value) {
        this.integratorTxID = value;
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
