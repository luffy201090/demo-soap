
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV49 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV49"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV48"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintUPSGroundSaver" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV49", propOrder = {
    "canPrintUPSGroundSaver"
})
@XmlSeeAlso({
    CapabilitiesV50 .class
})
public class CapabilitiesV49
    extends CapabilitiesV48
{

    @XmlElement(name = "CanPrintUPSGroundSaver")
    protected boolean canPrintUPSGroundSaver;

    /**
     * Gets the value of the canPrintUPSGroundSaver property.
     * 
     */
    public boolean isCanPrintUPSGroundSaver() {
        return canPrintUPSGroundSaver;
    }

    /**
     * Sets the value of the canPrintUPSGroundSaver property.
     * 
     */
    public void setCanPrintUPSGroundSaver(boolean value) {
        this.canPrintUPSGroundSaver = value;
    }

}
