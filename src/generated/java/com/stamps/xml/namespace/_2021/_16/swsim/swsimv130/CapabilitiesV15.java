
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV15"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV14"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintDX" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintDXPayOnUse" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV15", propOrder = {
    "canPrintDX",
    "canPrintDXPayOnUse"
})
@XmlSeeAlso({
    CapabilitiesV16 .class
})
public class CapabilitiesV15
    extends CapabilitiesV14
{

    @XmlElement(name = "CanPrintDX")
    protected boolean canPrintDX;
    @XmlElement(name = "CanPrintDXPayOnUse")
    protected boolean canPrintDXPayOnUse;

    /**
     * Gets the value of the canPrintDX property.
     * 
     */
    public boolean isCanPrintDX() {
        return canPrintDX;
    }

    /**
     * Sets the value of the canPrintDX property.
     * 
     */
    public void setCanPrintDX(boolean value) {
        this.canPrintDX = value;
    }

    /**
     * Gets the value of the canPrintDXPayOnUse property.
     * 
     */
    public boolean isCanPrintDXPayOnUse() {
        return canPrintDXPayOnUse;
    }

    /**
     * Sets the value of the canPrintDXPayOnUse property.
     * 
     */
    public void setCanPrintDXPayOnUse(boolean value) {
        this.canPrintDXPayOnUse = value;
    }

}
