
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateAdvance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAdvance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxDateAdvanceEnvelope" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxDateAdvanceMailingLabel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxDateAdvanceShippingLabel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAdvance", propOrder = {
    "maxDateAdvanceEnvelope",
    "maxDateAdvanceMailingLabel",
    "maxDateAdvanceShippingLabel"
})
public class DateAdvance {

    @XmlElement(name = "MaxDateAdvanceEnvelope")
    protected int maxDateAdvanceEnvelope;
    @XmlElement(name = "MaxDateAdvanceMailingLabel")
    protected int maxDateAdvanceMailingLabel;
    @XmlElement(name = "MaxDateAdvanceShippingLabel")
    protected int maxDateAdvanceShippingLabel;

    /**
     * Gets the value of the maxDateAdvanceEnvelope property.
     * 
     */
    public int getMaxDateAdvanceEnvelope() {
        return maxDateAdvanceEnvelope;
    }

    /**
     * Sets the value of the maxDateAdvanceEnvelope property.
     * 
     */
    public void setMaxDateAdvanceEnvelope(int value) {
        this.maxDateAdvanceEnvelope = value;
    }

    /**
     * Gets the value of the maxDateAdvanceMailingLabel property.
     * 
     */
    public int getMaxDateAdvanceMailingLabel() {
        return maxDateAdvanceMailingLabel;
    }

    /**
     * Sets the value of the maxDateAdvanceMailingLabel property.
     * 
     */
    public void setMaxDateAdvanceMailingLabel(int value) {
        this.maxDateAdvanceMailingLabel = value;
    }

    /**
     * Gets the value of the maxDateAdvanceShippingLabel property.
     * 
     */
    public int getMaxDateAdvanceShippingLabel() {
        return maxDateAdvanceShippingLabel;
    }

    /**
     * Sets the value of the maxDateAdvanceShippingLabel property.
     * 
     */
    public void setMaxDateAdvanceShippingLabel(int value) {
        this.maxDateAdvanceShippingLabel = value;
    }

}
