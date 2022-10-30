
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV38 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV38"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV37"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanUseBrandedTracking" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV38", propOrder = {
    "canUseBrandedTracking"
})
@XmlSeeAlso({
    CapabilitiesV39 .class
})
public class CapabilitiesV38
    extends CapabilitiesV37
{

    @XmlElement(name = "CanUseBrandedTracking")
    protected boolean canUseBrandedTracking;

    /**
     * Gets the value of the canUseBrandedTracking property.
     * 
     */
    public boolean isCanUseBrandedTracking() {
        return canUseBrandedTracking;
    }

    /**
     * Sets the value of the canUseBrandedTracking property.
     * 
     */
    public void setCanUseBrandedTracking(boolean value) {
        this.canUseBrandedTracking = value;
    }

}
