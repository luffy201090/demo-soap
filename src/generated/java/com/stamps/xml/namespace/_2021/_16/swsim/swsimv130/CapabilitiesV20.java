
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV19"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanUseMCW" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV20", propOrder = {
    "canUseMCW"
})
@XmlSeeAlso({
    CapabilitiesV21 .class
})
public class CapabilitiesV20
    extends CapabilitiesV19
{

    @XmlElement(name = "CanUseMCW")
    protected boolean canUseMCW;

    /**
     * Gets the value of the canUseMCW property.
     * 
     */
    public boolean isCanUseMCW() {
        return canUseMCW;
    }

    /**
     * Sets the value of the canUseMCW property.
     * 
     */
    public void setCanUseMCW(boolean value) {
        this.canUseMCW = value;
    }

}
