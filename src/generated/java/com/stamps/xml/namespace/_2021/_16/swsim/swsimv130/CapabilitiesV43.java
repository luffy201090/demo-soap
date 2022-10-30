
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV43 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV43"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV42"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanUsePPL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV43", propOrder = {
    "canUsePPL"
})
@XmlSeeAlso({
    CapabilitiesV44 .class
})
public class CapabilitiesV43
    extends CapabilitiesV42
{

    @XmlElement(name = "CanUsePPL")
    protected boolean canUsePPL;

    /**
     * Gets the value of the canUsePPL property.
     * 
     */
    public boolean isCanUsePPL() {
        return canUsePPL;
    }

    /**
     * Sets the value of the canUsePPL property.
     * 
     */
    public void setCanUsePPL(boolean value) {
        this.canUsePPL = value;
    }

}
