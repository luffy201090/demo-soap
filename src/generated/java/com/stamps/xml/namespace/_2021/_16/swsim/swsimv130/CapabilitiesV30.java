
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV30 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV30"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV29"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintUPS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV30", propOrder = {
    "canPrintUPS"
})
@XmlSeeAlso({
    CapabilitiesV31 .class
})
public class CapabilitiesV30
    extends CapabilitiesV29
{

    @XmlElement(name = "CanPrintUPS")
    protected boolean canPrintUPS;

    /**
     * Gets the value of the canPrintUPS property.
     * 
     */
    public boolean isCanPrintUPS() {
        return canPrintUPS;
    }

    /**
     * Sets the value of the canPrintUPS property.
     * 
     */
    public void setCanPrintUPS(boolean value) {
        this.canPrintUPS = value;
    }

}
