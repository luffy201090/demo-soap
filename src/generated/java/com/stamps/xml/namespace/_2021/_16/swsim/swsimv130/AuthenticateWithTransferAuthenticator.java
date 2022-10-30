
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
 *         &lt;element name="integrationID" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="transferAuthenticator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "integrationID",
    "transferAuthenticator"
})
@XmlRootElement(name = "AuthenticateWithTransferAuthenticator")
public class AuthenticateWithTransferAuthenticator {

    @XmlElement(required = true)
    protected String integrationID;
    @XmlElement(required = true)
    protected String transferAuthenticator;

    /**
     * Gets the value of the integrationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationID() {
        return integrationID;
    }

    /**
     * Sets the value of the integrationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationID(String value) {
        this.integrationID = value;
    }

    /**
     * Gets the value of the transferAuthenticator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferAuthenticator() {
        return transferAuthenticator;
    }

    /**
     * Sets the value of the transferAuthenticator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferAuthenticator(String value) {
        this.transferAuthenticator = value;
    }

}
