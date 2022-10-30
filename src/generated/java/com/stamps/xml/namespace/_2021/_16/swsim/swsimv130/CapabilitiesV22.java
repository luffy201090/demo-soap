
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV22 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV22"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV21"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintUSPSReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintStandaloneUSPSReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV22", propOrder = {
    "canPrintUSPSReturn",
    "canPrintStandaloneUSPSReturn"
})
@XmlSeeAlso({
    CapabilitiesV23 .class
})
public class CapabilitiesV22
    extends CapabilitiesV21
{

    @XmlElement(name = "CanPrintUSPSReturn")
    protected boolean canPrintUSPSReturn;
    @XmlElement(name = "CanPrintStandaloneUSPSReturn")
    protected boolean canPrintStandaloneUSPSReturn;

    /**
     * Gets the value of the canPrintUSPSReturn property.
     * 
     */
    public boolean isCanPrintUSPSReturn() {
        return canPrintUSPSReturn;
    }

    /**
     * Sets the value of the canPrintUSPSReturn property.
     * 
     */
    public void setCanPrintUSPSReturn(boolean value) {
        this.canPrintUSPSReturn = value;
    }

    /**
     * Gets the value of the canPrintStandaloneUSPSReturn property.
     * 
     */
    public boolean isCanPrintStandaloneUSPSReturn() {
        return canPrintStandaloneUSPSReturn;
    }

    /**
     * Sets the value of the canPrintStandaloneUSPSReturn property.
     * 
     */
    public void setCanPrintStandaloneUSPSReturn(boolean value) {
        this.canPrintStandaloneUSPSReturn = value;
    }

}
