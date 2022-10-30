
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV28 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV28"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV27"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintUnfundedIndicium" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV28", propOrder = {
    "canPrintUnfundedIndicium"
})
@XmlSeeAlso({
    CapabilitiesV29 .class
})
public class CapabilitiesV28
    extends CapabilitiesV27
{

    @XmlElement(name = "CanPrintUnfundedIndicium")
    protected boolean canPrintUnfundedIndicium;

    /**
     * Gets the value of the canPrintUnfundedIndicium property.
     * 
     */
    public boolean isCanPrintUnfundedIndicium() {
        return canPrintUnfundedIndicium;
    }

    /**
     * Sets the value of the canPrintUnfundedIndicium property.
     * 
     */
    public void setCanPrintUnfundedIndicium(boolean value) {
        this.canPrintUnfundedIndicium = value;
    }

}
