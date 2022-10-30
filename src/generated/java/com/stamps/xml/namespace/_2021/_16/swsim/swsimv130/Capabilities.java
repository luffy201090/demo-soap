
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Capabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Capabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintShipping" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanUseCostCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanUseHiddenPostage" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPurchaseSDCInsurance" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintMemoOnShippingLabel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintInternational" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPurchasePostage" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanEditCostCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MustUseCostCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanViewOnlineReports" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PerPrintLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities", propOrder = {
    "canPrintShipping",
    "canUseCostCodes",
    "canUseHiddenPostage",
    "canPurchaseSDCInsurance",
    "canPrintMemoOnShippingLabel",
    "canPrintInternational",
    "canPurchasePostage",
    "canEditCostCodes",
    "mustUseCostCodes",
    "canViewOnlineReports",
    "perPrintLimit"
})
@XmlSeeAlso({
    CapabilitiesV2 .class
})
public class Capabilities {

    @XmlElement(name = "CanPrintShipping")
    protected boolean canPrintShipping;
    @XmlElement(name = "CanUseCostCodes")
    protected boolean canUseCostCodes;
    @XmlElement(name = "CanUseHiddenPostage")
    protected boolean canUseHiddenPostage;
    @XmlElement(name = "CanPurchaseSDCInsurance")
    protected boolean canPurchaseSDCInsurance;
    @XmlElement(name = "CanPrintMemoOnShippingLabel")
    protected boolean canPrintMemoOnShippingLabel;
    @XmlElement(name = "CanPrintInternational")
    protected boolean canPrintInternational;
    @XmlElement(name = "CanPurchasePostage")
    protected boolean canPurchasePostage;
    @XmlElement(name = "CanEditCostCodes")
    protected boolean canEditCostCodes;
    @XmlElement(name = "MustUseCostCodes")
    protected boolean mustUseCostCodes;
    @XmlElement(name = "CanViewOnlineReports")
    protected boolean canViewOnlineReports;
    @XmlElement(name = "PerPrintLimit", required = true)
    protected BigDecimal perPrintLimit;

    /**
     * Gets the value of the canPrintShipping property.
     * 
     */
    public boolean isCanPrintShipping() {
        return canPrintShipping;
    }

    /**
     * Sets the value of the canPrintShipping property.
     * 
     */
    public void setCanPrintShipping(boolean value) {
        this.canPrintShipping = value;
    }

    /**
     * Gets the value of the canUseCostCodes property.
     * 
     */
    public boolean isCanUseCostCodes() {
        return canUseCostCodes;
    }

    /**
     * Sets the value of the canUseCostCodes property.
     * 
     */
    public void setCanUseCostCodes(boolean value) {
        this.canUseCostCodes = value;
    }

    /**
     * Gets the value of the canUseHiddenPostage property.
     * 
     */
    public boolean isCanUseHiddenPostage() {
        return canUseHiddenPostage;
    }

    /**
     * Sets the value of the canUseHiddenPostage property.
     * 
     */
    public void setCanUseHiddenPostage(boolean value) {
        this.canUseHiddenPostage = value;
    }

    /**
     * Gets the value of the canPurchaseSDCInsurance property.
     * 
     */
    public boolean isCanPurchaseSDCInsurance() {
        return canPurchaseSDCInsurance;
    }

    /**
     * Sets the value of the canPurchaseSDCInsurance property.
     * 
     */
    public void setCanPurchaseSDCInsurance(boolean value) {
        this.canPurchaseSDCInsurance = value;
    }

    /**
     * Gets the value of the canPrintMemoOnShippingLabel property.
     * 
     */
    public boolean isCanPrintMemoOnShippingLabel() {
        return canPrintMemoOnShippingLabel;
    }

    /**
     * Sets the value of the canPrintMemoOnShippingLabel property.
     * 
     */
    public void setCanPrintMemoOnShippingLabel(boolean value) {
        this.canPrintMemoOnShippingLabel = value;
    }

    /**
     * Gets the value of the canPrintInternational property.
     * 
     */
    public boolean isCanPrintInternational() {
        return canPrintInternational;
    }

    /**
     * Sets the value of the canPrintInternational property.
     * 
     */
    public void setCanPrintInternational(boolean value) {
        this.canPrintInternational = value;
    }

    /**
     * Gets the value of the canPurchasePostage property.
     * 
     */
    public boolean isCanPurchasePostage() {
        return canPurchasePostage;
    }

    /**
     * Sets the value of the canPurchasePostage property.
     * 
     */
    public void setCanPurchasePostage(boolean value) {
        this.canPurchasePostage = value;
    }

    /**
     * Gets the value of the canEditCostCodes property.
     * 
     */
    public boolean isCanEditCostCodes() {
        return canEditCostCodes;
    }

    /**
     * Sets the value of the canEditCostCodes property.
     * 
     */
    public void setCanEditCostCodes(boolean value) {
        this.canEditCostCodes = value;
    }

    /**
     * Gets the value of the mustUseCostCodes property.
     * 
     */
    public boolean isMustUseCostCodes() {
        return mustUseCostCodes;
    }

    /**
     * Sets the value of the mustUseCostCodes property.
     * 
     */
    public void setMustUseCostCodes(boolean value) {
        this.mustUseCostCodes = value;
    }

    /**
     * Gets the value of the canViewOnlineReports property.
     * 
     */
    public boolean isCanViewOnlineReports() {
        return canViewOnlineReports;
    }

    /**
     * Sets the value of the canViewOnlineReports property.
     * 
     */
    public void setCanViewOnlineReports(boolean value) {
        this.canViewOnlineReports = value;
    }

    /**
     * Gets the value of the perPrintLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerPrintLimit() {
        return perPrintLimit;
    }

    /**
     * Sets the value of the perPrintLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerPrintLimit(BigDecimal value) {
        this.perPrintLimit = value;
    }

}
