
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV11"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV10"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintGPSmartSaver" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV11", propOrder = {
    "canPrintGPSmartSaver"
})
@XmlSeeAlso({
    CapabilitiesV12 .class
})
public class CapabilitiesV11
    extends CapabilitiesV10
{

    @XmlElement(name = "CanPrintGPSmartSaver")
    protected boolean canPrintGPSmartSaver;

    /**
     * Gets the value of the canPrintGPSmartSaver property.
     * 
     */
    public boolean isCanPrintGPSmartSaver() {
        return canPrintGPSmartSaver;
    }

    /**
     * Sets the value of the canPrintGPSmartSaver property.
     * 
     */
    public void setCanPrintGPSmartSaver(boolean value) {
        this.canPrintGPSmartSaver = value;
    }

}
