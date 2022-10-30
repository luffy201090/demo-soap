
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoBuySettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoBuySettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoBuyEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PurchaseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TriggerAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoBuySettings", propOrder = {
    "autoBuyEnabled",
    "purchaseAmount",
    "triggerAmount"
})
public class AutoBuySettings {

    @XmlElement(name = "AutoBuyEnabled")
    protected boolean autoBuyEnabled;
    @XmlElement(name = "PurchaseAmount", defaultValue = "0.0")
    protected BigDecimal purchaseAmount;
    @XmlElement(name = "TriggerAmount", defaultValue = "0.0")
    protected BigDecimal triggerAmount;

    /**
     * Gets the value of the autoBuyEnabled property.
     * 
     */
    public boolean isAutoBuyEnabled() {
        return autoBuyEnabled;
    }

    /**
     * Sets the value of the autoBuyEnabled property.
     * 
     */
    public void setAutoBuyEnabled(boolean value) {
        this.autoBuyEnabled = value;
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
     * Gets the value of the triggerAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTriggerAmount() {
        return triggerAmount;
    }

    /**
     * Sets the value of the triggerAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTriggerAmount(BigDecimal value) {
        this.triggerAmount = value;
    }

}
