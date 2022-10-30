
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV36 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV36"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV35"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintInstaLabel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV36", propOrder = {
    "canPrintInstaLabel"
})
@XmlSeeAlso({
    CapabilitiesV37 .class
})
public class CapabilitiesV36
    extends CapabilitiesV35
{

    @XmlElement(name = "CanPrintInstaLabel")
    protected boolean canPrintInstaLabel;

    /**
     * Gets the value of the canPrintInstaLabel property.
     * 
     */
    public boolean isCanPrintInstaLabel() {
        return canPrintInstaLabel;
    }

    /**
     * Sets the value of the canPrintInstaLabel property.
     * 
     */
    public void setCanPrintInstaLabel(boolean value) {
        this.canPrintInstaLabel = value;
    }

}
