
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV12"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV11"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintGPPayOnUse" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintGPSmartSaverPayOnUse" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV12", propOrder = {
    "canPrintGPPayOnUse",
    "canPrintGPSmartSaverPayOnUse"
})
@XmlSeeAlso({
    CapabilitiesV13 .class
})
public class CapabilitiesV12
    extends CapabilitiesV11
{

    @XmlElement(name = "CanPrintGPPayOnUse")
    protected boolean canPrintGPPayOnUse;
    @XmlElement(name = "CanPrintGPSmartSaverPayOnUse")
    protected boolean canPrintGPSmartSaverPayOnUse;

    /**
     * Gets the value of the canPrintGPPayOnUse property.
     * 
     */
    public boolean isCanPrintGPPayOnUse() {
        return canPrintGPPayOnUse;
    }

    /**
     * Sets the value of the canPrintGPPayOnUse property.
     * 
     */
    public void setCanPrintGPPayOnUse(boolean value) {
        this.canPrintGPPayOnUse = value;
    }

    /**
     * Gets the value of the canPrintGPSmartSaverPayOnUse property.
     * 
     */
    public boolean isCanPrintGPSmartSaverPayOnUse() {
        return canPrintGPSmartSaverPayOnUse;
    }

    /**
     * Sets the value of the canPrintGPSmartSaverPayOnUse property.
     * 
     */
    public void setCanPrintGPSmartSaverPayOnUse(boolean value) {
        this.canPrintGPSmartSaverPayOnUse = value;
    }

}
