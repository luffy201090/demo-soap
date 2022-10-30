
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV9"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV8"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintGP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="GPShipToConsolidator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV9", propOrder = {
    "canPrintGP",
    "gpShipToConsolidator"
})
@XmlSeeAlso({
    CapabilitiesV10 .class
})
public class CapabilitiesV9
    extends CapabilitiesV8
{

    @XmlElement(name = "CanPrintGP")
    protected boolean canPrintGP;
    @XmlElement(name = "GPShipToConsolidator")
    protected boolean gpShipToConsolidator;

    /**
     * Gets the value of the canPrintGP property.
     * 
     */
    public boolean isCanPrintGP() {
        return canPrintGP;
    }

    /**
     * Sets the value of the canPrintGP property.
     * 
     */
    public void setCanPrintGP(boolean value) {
        this.canPrintGP = value;
    }

    /**
     * Gets the value of the gpShipToConsolidator property.
     * 
     */
    public boolean isGPShipToConsolidator() {
        return gpShipToConsolidator;
    }

    /**
     * Sets the value of the gpShipToConsolidator property.
     * 
     */
    public void setGPShipToConsolidator(boolean value) {
        this.gpShipToConsolidator = value;
    }

}
