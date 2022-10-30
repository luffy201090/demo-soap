
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV39 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV39"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV38"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanUseAutomationRules" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanUseAdvancedAutomationRules" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanUseFBA" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV39", propOrder = {
    "canUseAutomationRules",
    "canUseAdvancedAutomationRules",
    "canUseFBA"
})
@XmlSeeAlso({
    CapabilitiesV40 .class
})
public class CapabilitiesV39
    extends CapabilitiesV38
{

    @XmlElement(name = "CanUseAutomationRules")
    protected boolean canUseAutomationRules;
    @XmlElement(name = "CanUseAdvancedAutomationRules")
    protected boolean canUseAdvancedAutomationRules;
    @XmlElement(name = "CanUseFBA")
    protected boolean canUseFBA;

    /**
     * Gets the value of the canUseAutomationRules property.
     * 
     */
    public boolean isCanUseAutomationRules() {
        return canUseAutomationRules;
    }

    /**
     * Sets the value of the canUseAutomationRules property.
     * 
     */
    public void setCanUseAutomationRules(boolean value) {
        this.canUseAutomationRules = value;
    }

    /**
     * Gets the value of the canUseAdvancedAutomationRules property.
     * 
     */
    public boolean isCanUseAdvancedAutomationRules() {
        return canUseAdvancedAutomationRules;
    }

    /**
     * Sets the value of the canUseAdvancedAutomationRules property.
     * 
     */
    public void setCanUseAdvancedAutomationRules(boolean value) {
        this.canUseAdvancedAutomationRules = value;
    }

    /**
     * Gets the value of the canUseFBA property.
     * 
     */
    public boolean isCanUseFBA() {
        return canUseFBA;
    }

    /**
     * Sets the value of the canUseFBA property.
     * 
     */
    public void setCanUseFBA(boolean value) {
        this.canUseFBA = value;
    }

}
