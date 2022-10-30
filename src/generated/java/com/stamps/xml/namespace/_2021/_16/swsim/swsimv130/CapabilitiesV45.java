
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV45 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV45"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV44"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintUSPSReturnServicePrepaid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV45", propOrder = {
    "canPrintUSPSReturnServicePrepaid"
})
@XmlSeeAlso({
    CapabilitiesV46 .class
})
public class CapabilitiesV45
    extends CapabilitiesV44
{

    @XmlElement(name = "CanPrintUSPSReturnServicePrepaid")
    protected boolean canPrintUSPSReturnServicePrepaid;

    /**
     * Gets the value of the canPrintUSPSReturnServicePrepaid property.
     * 
     */
    public boolean isCanPrintUSPSReturnServicePrepaid() {
        return canPrintUSPSReturnServicePrepaid;
    }

    /**
     * Sets the value of the canPrintUSPSReturnServicePrepaid property.
     * 
     */
    public void setCanPrintUSPSReturnServicePrepaid(boolean value) {
        this.canPrintUSPSReturnServicePrepaid = value;
    }

}
