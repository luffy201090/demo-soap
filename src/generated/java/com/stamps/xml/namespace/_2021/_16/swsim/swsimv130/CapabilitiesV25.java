
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV25 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV25"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV24"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PostalOverride" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="GlobalPostPostal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPurchaseParcelGuardInsurance" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV25", propOrder = {
    "postalOverride",
    "globalPostPostal",
    "canPurchaseParcelGuardInsurance"
})
@XmlSeeAlso({
    CapabilitiesV26 .class
})
public class CapabilitiesV25
    extends CapabilitiesV24
{

    @XmlElement(name = "PostalOverride")
    protected boolean postalOverride;
    @XmlElement(name = "GlobalPostPostal")
    protected boolean globalPostPostal;
    @XmlElement(name = "CanPurchaseParcelGuardInsurance")
    protected boolean canPurchaseParcelGuardInsurance;

    /**
     * Gets the value of the postalOverride property.
     * 
     */
    public boolean isPostalOverride() {
        return postalOverride;
    }

    /**
     * Sets the value of the postalOverride property.
     * 
     */
    public void setPostalOverride(boolean value) {
        this.postalOverride = value;
    }

    /**
     * Gets the value of the globalPostPostal property.
     * 
     */
    public boolean isGlobalPostPostal() {
        return globalPostPostal;
    }

    /**
     * Sets the value of the globalPostPostal property.
     * 
     */
    public void setGlobalPostPostal(boolean value) {
        this.globalPostPostal = value;
    }

    /**
     * Gets the value of the canPurchaseParcelGuardInsurance property.
     * 
     */
    public boolean isCanPurchaseParcelGuardInsurance() {
        return canPurchaseParcelGuardInsurance;
    }

    /**
     * Sets the value of the canPurchaseParcelGuardInsurance property.
     * 
     */
    public void setCanPurchaseParcelGuardInsurance(boolean value) {
        this.canPurchaseParcelGuardInsurance = value;
    }

}
