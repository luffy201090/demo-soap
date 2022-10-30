
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
 *         &lt;element name="Username" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-40"/&gt;
 *         &lt;element name="Codeword1" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-40"/&gt;
 *         &lt;element name="Codeword2" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-40"/&gt;
 *         &lt;element name="IntegrationId" type="{http://microsoft.com/wsdl/types/}guid" minOccurs="0"/&gt;
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
    "username",
    "codeword1",
    "codeword2",
    "integrationId"
})
@XmlRootElement(name = "StartPasswordReset")
public class StartPasswordReset {

    @XmlElement(name = "Username", required = true)
    protected String username;
    @XmlElement(name = "Codeword1", required = true)
    protected String codeword1;
    @XmlElement(name = "Codeword2", required = true)
    protected String codeword2;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the codeword1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeword1() {
        return codeword1;
    }

    /**
     * Sets the value of the codeword1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeword1(String value) {
        this.codeword1 = value;
    }

    /**
     * Gets the value of the codeword2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeword2() {
        return codeword2;
    }

    /**
     * Sets the value of the codeword2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeword2(String value) {
        this.codeword2 = value;
    }

    /**
     * Gets the value of the integrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationId() {
        return integrationId;
    }

    /**
     * Sets the value of the integrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationId(String value) {
        this.integrationId = value;
    }

}
