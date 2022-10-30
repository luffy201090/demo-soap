
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndiciumInfoV38 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndiciumInfoV38"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rate" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}RateV45"/&gt;
 *         &lt;element name="ReturnAddress" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Address" minOccurs="0"/&gt;
 *         &lt;element name="CostCodeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndiciumInfoV38", propOrder = {
    "rate",
    "returnAddress",
    "costCodeId"
})
public class IndiciumInfoV38 {

    @XmlElement(name = "Rate", required = true)
    protected RateV45 rate;
    @XmlElement(name = "ReturnAddress")
    protected Address returnAddress;
    @XmlElement(name = "CostCodeId", defaultValue = "0")
    protected Integer costCodeId;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link RateV45 }
     *     
     */
    public RateV45 getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateV45 }
     *     
     */
    public void setRate(RateV45 value) {
        this.rate = value;
    }

    /**
     * Gets the value of the returnAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getReturnAddress() {
        return returnAddress;
    }

    /**
     * Sets the value of the returnAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setReturnAddress(Address value) {
        this.returnAddress = value;
    }

    /**
     * Gets the value of the costCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCostCodeId() {
        return costCodeId;
    }

    /**
     * Sets the value of the costCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCostCodeId(Integer value) {
        this.costCodeId = value;
    }

}
