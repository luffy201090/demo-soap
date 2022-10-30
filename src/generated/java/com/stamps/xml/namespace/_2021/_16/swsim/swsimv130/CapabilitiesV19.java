
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV19 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV19"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV18"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintFX" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintFXPayOnUse" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV19", propOrder = {
    "canPrintFX",
    "canPrintFXPayOnUse"
})
@XmlSeeAlso({
    CapabilitiesV20 .class
})
public class CapabilitiesV19
    extends CapabilitiesV18
{

    @XmlElement(name = "CanPrintFX")
    protected boolean canPrintFX;
    @XmlElement(name = "CanPrintFXPayOnUse")
    protected boolean canPrintFXPayOnUse;

    /**
     * Gets the value of the canPrintFX property.
     * 
     */
    public boolean isCanPrintFX() {
        return canPrintFX;
    }

    /**
     * Sets the value of the canPrintFX property.
     * 
     */
    public void setCanPrintFX(boolean value) {
        this.canPrintFX = value;
    }

    /**
     * Gets the value of the canPrintFXPayOnUse property.
     * 
     */
    public boolean isCanPrintFXPayOnUse() {
        return canPrintFXPayOnUse;
    }

    /**
     * Sets the value of the canPrintFXPayOnUse property.
     * 
     */
    public void setCanPrintFXPayOnUse(boolean value) {
        this.canPrintFXPayOnUse = value;
    }

}
