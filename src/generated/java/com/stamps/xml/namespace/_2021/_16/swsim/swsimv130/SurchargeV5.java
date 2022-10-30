
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurchargeV5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurchargeV5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SurchargeType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}SurchargeTypeV5"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurchargeV5", propOrder = {
    "amount",
    "surchargeType"
})
public class SurchargeV5 {

    @XmlElement(name = "Amount", defaultValue = "0.0")
    protected BigDecimal amount;
    @XmlElement(name = "SurchargeType", required = true)
    @XmlSchemaType(name = "string")
    protected SurchargeTypeV5 surchargeType;

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
     * Gets the value of the surchargeType property.
     * 
     * @return
     *     possible object is
     *     {@link SurchargeTypeV5 }
     *     
     */
    public SurchargeTypeV5 getSurchargeType() {
        return surchargeType;
    }

    /**
     * Sets the value of the surchargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurchargeTypeV5 }
     *     
     */
    public void setSurchargeType(SurchargeTypeV5 value) {
        this.surchargeType = value;
    }

}
