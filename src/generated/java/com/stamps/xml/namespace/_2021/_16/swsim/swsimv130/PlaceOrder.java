
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
 *         &lt;element name="Skus" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfSku"/&gt;
 *         &lt;element name="PromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingAddress" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Address"/&gt;
 *         &lt;element name="StoreShippingMethod" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}StoreShippingMethodType"/&gt;
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
    "skus",
    "promoCode",
    "shippingAddress",
    "storeShippingMethod"
})
@XmlRootElement(name = "PlaceOrder")
public class PlaceOrder {

    @XmlElement(name = "Authenticator")
    protected String authenticator;
    @XmlElement(name = "Credentials")
    protected Credentials credentials;
    @XmlElement(name = "Skus", required = true)
    protected ArrayOfSku skus;
    @XmlElement(name = "PromoCode", defaultValue = "")
    protected String promoCode;
    @XmlElement(name = "ShippingAddress", required = true)
    protected Address shippingAddress;
    @XmlElement(name = "StoreShippingMethod", required = true)
    @XmlSchemaType(name = "string")
    protected StoreShippingMethodType storeShippingMethod;

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
     * Gets the value of the skus property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSku }
     *     
     */
    public ArrayOfSku getSkus() {
        return skus;
    }

    /**
     * Sets the value of the skus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSku }
     *     
     */
    public void setSkus(ArrayOfSku value) {
        this.skus = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setShippingAddress(Address value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the storeShippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link StoreShippingMethodType }
     *     
     */
    public StoreShippingMethodType getStoreShippingMethod() {
        return storeShippingMethod;
    }

    /**
     * Sets the value of the storeShippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreShippingMethodType }
     *     
     */
    public void setStoreShippingMethod(StoreShippingMethodType value) {
        this.storeShippingMethod = value;
    }

}
