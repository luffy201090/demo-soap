
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV34 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV34"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV33"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPurchaseUSPSInsurance" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV34", propOrder = {
    "canPurchaseUSPSInsurance"
})
@XmlSeeAlso({
    CapabilitiesV35 .class
})
public class CapabilitiesV34
    extends CapabilitiesV33
{

    @XmlElement(name = "CanPurchaseUSPSInsurance")
    protected boolean canPurchaseUSPSInsurance;

    /**
     * Gets the value of the canPurchaseUSPSInsurance property.
     * 
     */
    public boolean isCanPurchaseUSPSInsurance() {
        return canPurchaseUSPSInsurance;
    }

    /**
     * Sets the value of the canPurchaseUSPSInsurance property.
     * 
     */
    public void setCanPurchaseUSPSInsurance(boolean value) {
        this.canPurchaseUSPSInsurance = value;
    }

}
