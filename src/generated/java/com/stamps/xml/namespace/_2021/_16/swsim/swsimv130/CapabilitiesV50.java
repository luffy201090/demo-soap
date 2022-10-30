
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV50 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV50"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV49"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintUPSPayOnUse" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV50", propOrder = {
    "canPrintUPSPayOnUse"
})
public class CapabilitiesV50
    extends CapabilitiesV49
{

    @XmlElement(name = "CanPrintUPSPayOnUse")
    protected boolean canPrintUPSPayOnUse;

    /**
     * Gets the value of the canPrintUPSPayOnUse property.
     * 
     */
    public boolean isCanPrintUPSPayOnUse() {
        return canPrintUPSPayOnUse;
    }

    /**
     * Sets the value of the canPrintUPSPayOnUse property.
     * 
     */
    public void setCanPrintUPSPayOnUse(boolean value) {
        this.canPrintUPSPayOnUse = value;
    }

}
