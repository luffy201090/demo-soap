
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActualService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActualService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualServiceType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ServiceType"/&gt;
 *         &lt;element name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualService", propOrder = {
    "actualServiceType",
    "adjustedAmount"
})
public class ActualService {

    @XmlElement(name = "ActualServiceType", required = true)
    @XmlSchemaType(name = "string")
    protected ServiceType actualServiceType;
    @XmlElement(name = "AdjustedAmount", required = true)
    protected BigDecimal adjustedAmount;

    /**
     * Gets the value of the actualServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getActualServiceType() {
        return actualServiceType;
    }

    /**
     * Sets the value of the actualServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setActualServiceType(ServiceType value) {
        this.actualServiceType = value;
    }

    /**
     * Gets the value of the adjustedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustedAmount() {
        return adjustedAmount;
    }

    /**
     * Sets the value of the adjustedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustedAmount(BigDecimal value) {
        this.adjustedAmount = value;
    }

}
