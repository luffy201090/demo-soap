
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV46 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV46"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV45"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintUPSPayOnUseReturns" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintUPSReturns" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintUPSStandalonePayOnUseReturns" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV46", propOrder = {
    "canPrintUPSPayOnUseReturns",
    "canPrintUPSReturns",
    "canPrintUPSStandalonePayOnUseReturns"
})
@XmlSeeAlso({
    CapabilitiesV47 .class
})
public class CapabilitiesV46
    extends CapabilitiesV45
{

    @XmlElement(name = "CanPrintUPSPayOnUseReturns")
    protected boolean canPrintUPSPayOnUseReturns;
    @XmlElement(name = "CanPrintUPSReturns")
    protected boolean canPrintUPSReturns;
    @XmlElement(name = "CanPrintUPSStandalonePayOnUseReturns")
    protected boolean canPrintUPSStandalonePayOnUseReturns;

    /**
     * Gets the value of the canPrintUPSPayOnUseReturns property.
     * 
     */
    public boolean isCanPrintUPSPayOnUseReturns() {
        return canPrintUPSPayOnUseReturns;
    }

    /**
     * Sets the value of the canPrintUPSPayOnUseReturns property.
     * 
     */
    public void setCanPrintUPSPayOnUseReturns(boolean value) {
        this.canPrintUPSPayOnUseReturns = value;
    }

    /**
     * Gets the value of the canPrintUPSReturns property.
     * 
     */
    public boolean isCanPrintUPSReturns() {
        return canPrintUPSReturns;
    }

    /**
     * Sets the value of the canPrintUPSReturns property.
     * 
     */
    public void setCanPrintUPSReturns(boolean value) {
        this.canPrintUPSReturns = value;
    }

    /**
     * Gets the value of the canPrintUPSStandalonePayOnUseReturns property.
     * 
     */
    public boolean isCanPrintUPSStandalonePayOnUseReturns() {
        return canPrintUPSStandalonePayOnUseReturns;
    }

    /**
     * Sets the value of the canPrintUPSStandalonePayOnUseReturns property.
     * 
     */
    public void setCanPrintUPSStandalonePayOnUseReturns(boolean value) {
        this.canPrintUPSStandalonePayOnUseReturns = value;
    }

}
