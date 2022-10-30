
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreShippingMethodOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreShippingMethodOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StoreShippingMethod" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}StoreShippingMethodType"/&gt;
 *         &lt;element name="StoreDeliveryTimeMinimum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StoreDeliveryTimeMaximum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Skus" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfSku"/&gt;
 *         &lt;element name="StoreProductTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="StoreProductDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="StoreShippingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="StoreTaxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "StoreShippingMethodOption", propOrder = {
    "storeShippingMethod",
    "storeDeliveryTimeMinimum",
    "storeDeliveryTimeMaximum",
    "skus",
    "storeProductTotal",
    "storeProductDiscount",
    "storeShippingAmount",
    "storeTaxTotal",
    "storeOrderTotal"
})
public class StoreShippingMethodOption {

    @XmlElement(name = "StoreShippingMethod", required = true)
    @XmlSchemaType(name = "string")
    protected StoreShippingMethodType storeShippingMethod;
    @XmlElement(name = "StoreDeliveryTimeMinimum")
    protected int storeDeliveryTimeMinimum;
    @XmlElement(name = "StoreDeliveryTimeMaximum")
    protected int storeDeliveryTimeMaximum;
    @XmlElement(name = "Skus", required = true)
    protected ArrayOfSku skus;
    @XmlElement(name = "StoreProductTotal", defaultValue = "0.0")
    protected BigDecimal storeProductTotal;
    @XmlElement(name = "StoreProductDiscount", defaultValue = "0.0")
    protected BigDecimal storeProductDiscount;
    @XmlElement(name = "StoreShippingAmount", defaultValue = "0.0")
    protected BigDecimal storeShippingAmount;
    @XmlElement(name = "StoreTaxTotal", defaultValue = "0.0")
    protected BigDecimal storeTaxTotal;
    @XmlElement(name = "StoreOrderTotal", defaultValue = "0.0")
    protected BigDecimal storeOrderTotal;

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

    /**
     * Gets the value of the storeDeliveryTimeMinimum property.
     * 
     */
    public int getStoreDeliveryTimeMinimum() {
        return storeDeliveryTimeMinimum;
    }

    /**
     * Sets the value of the storeDeliveryTimeMinimum property.
     * 
     */
    public void setStoreDeliveryTimeMinimum(int value) {
        this.storeDeliveryTimeMinimum = value;
    }

    /**
     * Gets the value of the storeDeliveryTimeMaximum property.
     * 
     */
    public int getStoreDeliveryTimeMaximum() {
        return storeDeliveryTimeMaximum;
    }

    /**
     * Sets the value of the storeDeliveryTimeMaximum property.
     * 
     */
    public void setStoreDeliveryTimeMaximum(int value) {
        this.storeDeliveryTimeMaximum = value;
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
     * Gets the value of the storeProductTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStoreProductTotal() {
        return storeProductTotal;
    }

    /**
     * Sets the value of the storeProductTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStoreProductTotal(BigDecimal value) {
        this.storeProductTotal = value;
    }

    /**
     * Gets the value of the storeProductDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStoreProductDiscount() {
        return storeProductDiscount;
    }

    /**
     * Sets the value of the storeProductDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStoreProductDiscount(BigDecimal value) {
        this.storeProductDiscount = value;
    }

    /**
     * Gets the value of the storeShippingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStoreShippingAmount() {
        return storeShippingAmount;
    }

    /**
     * Sets the value of the storeShippingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStoreShippingAmount(BigDecimal value) {
        this.storeShippingAmount = value;
    }

    /**
     * Gets the value of the storeTaxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStoreTaxTotal() {
        return storeTaxTotal;
    }

    /**
     * Sets the value of the storeTaxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStoreTaxTotal(BigDecimal value) {
        this.storeTaxTotal = value;
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
