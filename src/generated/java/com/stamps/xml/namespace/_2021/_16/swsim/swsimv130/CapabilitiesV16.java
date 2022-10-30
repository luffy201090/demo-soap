
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV16"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV15"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintFCIPresort" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintPMIPresort" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintPMEIPresort" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintPresortPayOnUse" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanChangePaymentType" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV16", propOrder = {
    "canPrintFCIPresort",
    "canPrintPMIPresort",
    "canPrintPMEIPresort",
    "canPrintPresortPayOnUse",
    "canChangePaymentType"
})
@XmlSeeAlso({
    CapabilitiesV17 .class
})
public class CapabilitiesV16
    extends CapabilitiesV15
{

    @XmlElement(name = "CanPrintFCIPresort")
    protected boolean canPrintFCIPresort;
    @XmlElement(name = "CanPrintPMIPresort")
    protected boolean canPrintPMIPresort;
    @XmlElement(name = "CanPrintPMEIPresort")
    protected boolean canPrintPMEIPresort;
    @XmlElement(name = "CanPrintPresortPayOnUse")
    protected boolean canPrintPresortPayOnUse;
    @XmlElement(name = "CanChangePaymentType")
    protected boolean canChangePaymentType;

    /**
     * Gets the value of the canPrintFCIPresort property.
     * 
     */
    public boolean isCanPrintFCIPresort() {
        return canPrintFCIPresort;
    }

    /**
     * Sets the value of the canPrintFCIPresort property.
     * 
     */
    public void setCanPrintFCIPresort(boolean value) {
        this.canPrintFCIPresort = value;
    }

    /**
     * Gets the value of the canPrintPMIPresort property.
     * 
     */
    public boolean isCanPrintPMIPresort() {
        return canPrintPMIPresort;
    }

    /**
     * Sets the value of the canPrintPMIPresort property.
     * 
     */
    public void setCanPrintPMIPresort(boolean value) {
        this.canPrintPMIPresort = value;
    }

    /**
     * Gets the value of the canPrintPMEIPresort property.
     * 
     */
    public boolean isCanPrintPMEIPresort() {
        return canPrintPMEIPresort;
    }

    /**
     * Sets the value of the canPrintPMEIPresort property.
     * 
     */
    public void setCanPrintPMEIPresort(boolean value) {
        this.canPrintPMEIPresort = value;
    }

    /**
     * Gets the value of the canPrintPresortPayOnUse property.
     * 
     */
    public boolean isCanPrintPresortPayOnUse() {
        return canPrintPresortPayOnUse;
    }

    /**
     * Sets the value of the canPrintPresortPayOnUse property.
     * 
     */
    public void setCanPrintPresortPayOnUse(boolean value) {
        this.canPrintPresortPayOnUse = value;
    }

    /**
     * Gets the value of the canChangePaymentType property.
     * 
     */
    public boolean isCanChangePaymentType() {
        return canChangePaymentType;
    }

    /**
     * Sets the value of the canChangePaymentType property.
     * 
     */
    public void setCanChangePaymentType(boolean value) {
        this.canChangePaymentType = value;
    }

}
