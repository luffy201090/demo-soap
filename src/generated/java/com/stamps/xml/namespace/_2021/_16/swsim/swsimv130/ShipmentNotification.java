
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UseCompanyNameInFromLine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseCompanyNameInSubject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentNotification", propOrder = {
    "email",
    "useCompanyNameInFromLine",
    "useCompanyNameInSubject"
})
public class ShipmentNotification {

    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "UseCompanyNameInFromLine", defaultValue = "false")
    protected Boolean useCompanyNameInFromLine;
    @XmlElement(name = "UseCompanyNameInSubject", defaultValue = "false")
    protected Boolean useCompanyNameInSubject;

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
     * Gets the value of the useCompanyNameInFromLine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCompanyNameInFromLine() {
        return useCompanyNameInFromLine;
    }

    /**
     * Sets the value of the useCompanyNameInFromLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCompanyNameInFromLine(Boolean value) {
        this.useCompanyNameInFromLine = value;
    }

    /**
     * Gets the value of the useCompanyNameInSubject property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCompanyNameInSubject() {
        return useCompanyNameInSubject;
    }

    /**
     * Sets the value of the useCompanyNameInSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCompanyNameInSubject(Boolean value) {
        this.useCompanyNameInSubject = value;
    }

}
