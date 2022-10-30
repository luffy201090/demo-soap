
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostageBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostageBalance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailablePostage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ControlTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostageBalance", propOrder = {
    "availablePostage",
    "controlTotal"
})
public class PostageBalance {

    @XmlElement(name = "AvailablePostage", required = true)
    protected BigDecimal availablePostage;
    @XmlElement(name = "ControlTotal", required = true)
    protected BigDecimal controlTotal;

    /**
     * Gets the value of the availablePostage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailablePostage() {
        return availablePostage;
    }

    /**
     * Sets the value of the availablePostage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailablePostage(BigDecimal value) {
        this.availablePostage = value;
    }

    /**
     * Gets the value of the controlTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getControlTotal() {
        return controlTotal;
    }

    /**
     * Sets the value of the controlTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setControlTotal(BigDecimal value) {
        this.controlTotal = value;
    }

}
