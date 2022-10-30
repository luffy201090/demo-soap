
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Plan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Plan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlanId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PlanName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MonthlyBaseFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Plan", propOrder = {
    "planId",
    "planName",
    "monthlyBaseFee"
})
public class Plan {

    @XmlElement(name = "PlanId")
    protected int planId;
    @XmlElement(name = "PlanName", required = true)
    protected String planName;
    @XmlElement(name = "MonthlyBaseFee", required = true)
    protected BigDecimal monthlyBaseFee;

    /**
     * Gets the value of the planId property.
     * 
     */
    public int getPlanId() {
        return planId;
    }

    /**
     * Sets the value of the planId property.
     * 
     */
    public void setPlanId(int value) {
        this.planId = value;
    }

    /**
     * Gets the value of the planName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * Sets the value of the planName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanName(String value) {
        this.planName = value;
    }

    /**
     * Gets the value of the monthlyBaseFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthlyBaseFee() {
        return monthlyBaseFee;
    }

    /**
     * Sets the value of the monthlyBaseFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthlyBaseFee(BigDecimal value) {
        this.monthlyBaseFee = value;
    }

}
