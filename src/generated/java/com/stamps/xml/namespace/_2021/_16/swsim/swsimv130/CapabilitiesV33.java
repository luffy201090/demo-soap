
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV33 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV33"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV32"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintGPDomestic" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV33", propOrder = {
    "canPrintGPDomestic"
})
@XmlSeeAlso({
    CapabilitiesV34 .class
})
public class CapabilitiesV33
    extends CapabilitiesV32
{

    @XmlElement(name = "CanPrintGPDomestic")
    protected boolean canPrintGPDomestic;

    /**
     * Gets the value of the canPrintGPDomestic property.
     * 
     */
    public boolean isCanPrintGPDomestic() {
        return canPrintGPDomestic;
    }

    /**
     * Sets the value of the canPrintGPDomestic property.
     * 
     */
    public void setCanPrintGPDomestic(boolean value) {
        this.canPrintGPDomestic = value;
    }

}
