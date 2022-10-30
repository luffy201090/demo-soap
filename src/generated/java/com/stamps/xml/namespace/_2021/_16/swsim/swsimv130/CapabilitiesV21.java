
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV21 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV21"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV20"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintDeliveredDutyPaid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV21", propOrder = {
    "canPrintDeliveredDutyPaid"
})
@XmlSeeAlso({
    CapabilitiesV22 .class
})
public class CapabilitiesV21
    extends CapabilitiesV20
{

    @XmlElement(name = "CanPrintDeliveredDutyPaid")
    protected boolean canPrintDeliveredDutyPaid;

    /**
     * Gets the value of the canPrintDeliveredDutyPaid property.
     * 
     */
    public boolean isCanPrintDeliveredDutyPaid() {
        return canPrintDeliveredDutyPaid;
    }

    /**
     * Sets the value of the canPrintDeliveredDutyPaid property.
     * 
     */
    public void setCanPrintDeliveredDutyPaid(boolean value) {
        this.canPrintDeliveredDutyPaid = value;
    }

}
