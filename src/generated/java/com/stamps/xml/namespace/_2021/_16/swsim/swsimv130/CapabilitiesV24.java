
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV24 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV24"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV23"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintGlobalPostPlus" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV24", propOrder = {
    "canPrintGlobalPostPlus"
})
@XmlSeeAlso({
    CapabilitiesV25 .class
})
public class CapabilitiesV24
    extends CapabilitiesV23
{

    @XmlElement(name = "CanPrintGlobalPostPlus")
    protected boolean canPrintGlobalPostPlus;

    /**
     * Gets the value of the canPrintGlobalPostPlus property.
     * 
     */
    public boolean isCanPrintGlobalPostPlus() {
        return canPrintGlobalPostPlus;
    }

    /**
     * Sets the value of the canPrintGlobalPostPlus property.
     * 
     */
    public void setCanPrintGlobalPostPlus(boolean value) {
        this.canPrintGlobalPostPlus = value;
    }

}
