
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
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
 *         &lt;element name="Authenticator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StoreOrderId" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-50" minOccurs="0"/&gt;
 *         &lt;element name="StoreOrderTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
    "storeOrderId",
    "storeOrderTotal"
})
@XmlRootElement(name = "PlaceOrderResponse")
public class PlaceOrderResponse {

    @XmlElement(name = "Authenticator", required = true)
    protected String authenticator;
    @XmlElement(name = "StoreOrderId", defaultValue = "")
    protected String storeOrderId;
    @XmlElement(name = "StoreOrderTotal", defaultValue = "0.0")
    protected BigDecimal storeOrderTotal;

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
     * Gets the value of the storeOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreOrderId() {
        return storeOrderId;
    }

    /**
     * Sets the value of the storeOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreOrderId(String value) {
        this.storeOrderId = value;
    }

    /**
     * Gets the value of the storeOrderTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStoreOrderTotal() {
        return storeOrderTotal;
    }

    /**
     * Sets the value of the storeOrderTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStoreOrderTotal(BigDecimal value) {
        this.storeOrderTotal = value;
    }

}
