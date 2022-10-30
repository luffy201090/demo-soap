
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV5"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanUseInvoicing" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV6", propOrder = {
    "canUseInvoicing"
})
@XmlSeeAlso({
    CapabilitiesV7 .class
})
public class CapabilitiesV6
    extends CapabilitiesV5
{

    @XmlElement(name = "CanUseInvoicing")
    protected boolean canUseInvoicing;

    /**
     * Gets the value of the canUseInvoicing property.
     * 
     */
    public boolean isCanUseInvoicing() {
        return canUseInvoicing;
    }

    /**
     * Sets the value of the canUseInvoicing property.
     * 
     */
    public void setCanUseInvoicing(boolean value) {
        this.canUseInvoicing = value;
    }

}
