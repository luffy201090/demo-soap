
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV37 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV37"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV36"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanUseAutoPickupUSPS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV37", propOrder = {
    "canUseAutoPickupUSPS"
})
@XmlSeeAlso({
    CapabilitiesV38 .class
})
public class CapabilitiesV37
    extends CapabilitiesV36
{

    @XmlElement(name = "CanUseAutoPickupUSPS")
    protected boolean canUseAutoPickupUSPS;

    /**
     * Gets the value of the canUseAutoPickupUSPS property.
     * 
     */
    public boolean isCanUseAutoPickupUSPS() {
        return canUseAutoPickupUSPS;
    }

    /**
     * Sets the value of the canUseAutoPickupUSPS property.
     * 
     */
    public void setCanUseAutoPickupUSPS(boolean value) {
        this.canUseAutoPickupUSPS = value;
    }

}
