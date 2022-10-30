
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="Codeword1Type" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CodewordType" minOccurs="0"/&gt;
 *         &lt;element name="Codeword1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Codeword2Type" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CodewordType" minOccurs="0"/&gt;
 *         &lt;element name="Codeword2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "codeword1Type",
    "codeword1",
    "codeword2Type",
    "codeword2"
})
@XmlRootElement(name = "SetCodeWords")
public class SetCodeWords {

    @XmlElement(name = "Authenticator")
    protected String authenticator;
    @XmlElement(name = "Credentials")
    protected Credentials credentials;
    @XmlElement(name = "Codeword1Type")
    @XmlSchemaType(name = "string")
    protected CodewordType codeword1Type;
    @XmlElement(name = "Codeword1")
    protected String codeword1;
    @XmlElement(name = "Codeword2Type")
    @XmlSchemaType(name = "string")
    protected CodewordType codeword2Type;
    @XmlElement(name = "Codeword2")
    protected String codeword2;

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
     * Gets the value of the codeword1Type property.
     * 
     * @return
     *     possible object is
     *     {@link CodewordType }
     *     
     */
    public CodewordType getCodeword1Type() {
        return codeword1Type;
    }

    /**
     * Sets the value of the codeword1Type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodewordType }
     *     
     */
    public void setCodeword1Type(CodewordType value) {
        this.codeword1Type = value;
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
     * Gets the value of the codeword2Type property.
     * 
     * @return
     *     possible object is
     *     {@link CodewordType }
     *     
     */
    public CodewordType getCodeword2Type() {
        return codeword2Type;
    }

    /**
     * Sets the value of the codeword2Type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodewordType }
     *     
     */
    public void setCodeword2Type(CodewordType value) {
        this.codeword2Type = value;
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

}
