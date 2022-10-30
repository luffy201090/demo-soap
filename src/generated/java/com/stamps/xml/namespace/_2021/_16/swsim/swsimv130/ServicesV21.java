
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServicesV21 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicesV21"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ServiceType"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CubicPricingTier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsMetroRate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Carrier" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Carrier"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicesV21", propOrder = {
    "serviceType",
    "amount",
    "cubicPricingTier",
    "isMetroRate",
    "carrier"
})
public class ServicesV21 {

    @XmlElement(name = "ServiceType", required = true)
    @XmlSchemaType(name = "string")
    protected ServiceType serviceType;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "CubicPricingTier")
    protected int cubicPricingTier;
    @XmlElement(name = "IsMetroRate")
    protected boolean isMetroRate;
    @XmlElement(name = "Carrier", required = true)
    @XmlSchemaType(name = "string")
    protected Carrier carrier;

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceType(ServiceType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the cubicPricingTier property.
     * 
     */
    public int getCubicPricingTier() {
        return cubicPricingTier;
    }

    /**
     * Sets the value of the cubicPricingTier property.
     * 
     */
    public void setCubicPricingTier(int value) {
        this.cubicPricingTier = value;
    }

    /**
     * Gets the value of the isMetroRate property.
     * 
     */
    public boolean isIsMetroRate() {
        return isMetroRate;
    }

    /**
     * Sets the value of the isMetroRate property.
     * 
     */
    public void setIsMetroRate(boolean value) {
        this.isMetroRate = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link Carrier }
     *     
     */
    public Carrier getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Carrier }
     *     
     */
    public void setCarrier(Carrier value) {
        this.carrier = value;
    }

}
