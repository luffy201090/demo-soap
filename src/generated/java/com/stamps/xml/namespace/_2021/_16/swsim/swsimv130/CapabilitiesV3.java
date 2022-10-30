
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV2"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintReturnShippingLabel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanManageUsers" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintNetStamps" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanEmailNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanViewReports" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanCreateSCANForm" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AllowRestrictedSheets" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HideUnavailableFeatures" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WebPostage" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanViewInsuranceHistory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanChangeServicePlan" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HideEstimatedDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPurchaseFromStore" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanChangePhysicalAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanChangePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanChangeContactInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanViewAdvancedReporting" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV3", propOrder = {
    "canPrintReturnShippingLabel",
    "canManageUsers",
    "canPrintNetStamps",
    "canEmailNotifications",
    "canViewReports",
    "canCreateSCANForm",
    "allowRestrictedSheets",
    "hideUnavailableFeatures",
    "webPostage",
    "canViewInsuranceHistory",
    "canChangeServicePlan",
    "hideEstimatedDeliveryTime",
    "canPurchaseFromStore",
    "canChangePhysicalAddress",
    "canChangePaymentMethod",
    "canChangeContactInfo",
    "canViewAdvancedReporting"
})
@XmlSeeAlso({
    CapabilitiesV4 .class
})
public class CapabilitiesV3
    extends CapabilitiesV2
{

    @XmlElement(name = "CanPrintReturnShippingLabel")
    protected boolean canPrintReturnShippingLabel;
    @XmlElement(name = "CanManageUsers")
    protected boolean canManageUsers;
    @XmlElement(name = "CanPrintNetStamps")
    protected boolean canPrintNetStamps;
    @XmlElement(name = "CanEmailNotifications")
    protected boolean canEmailNotifications;
    @XmlElement(name = "CanViewReports")
    protected boolean canViewReports;
    @XmlElement(name = "CanCreateSCANForm")
    protected boolean canCreateSCANForm;
    @XmlElement(name = "AllowRestrictedSheets")
    protected boolean allowRestrictedSheets;
    @XmlElement(name = "HideUnavailableFeatures")
    protected boolean hideUnavailableFeatures;
    @XmlElement(name = "WebPostage")
    protected boolean webPostage;
    @XmlElement(name = "CanViewInsuranceHistory")
    protected boolean canViewInsuranceHistory;
    @XmlElement(name = "CanChangeServicePlan")
    protected boolean canChangeServicePlan;
    @XmlElement(name = "HideEstimatedDeliveryTime")
    protected boolean hideEstimatedDeliveryTime;
    @XmlElement(name = "CanPurchaseFromStore")
    protected boolean canPurchaseFromStore;
    @XmlElement(name = "CanChangePhysicalAddress")
    protected boolean canChangePhysicalAddress;
    @XmlElement(name = "CanChangePaymentMethod")
    protected boolean canChangePaymentMethod;
    @XmlElement(name = "CanChangeContactInfo")
    protected boolean canChangeContactInfo;
    @XmlElement(name = "CanViewAdvancedReporting")
    protected boolean canViewAdvancedReporting;

    /**
     * Gets the value of the canPrintReturnShippingLabel property.
     * 
     */
    public boolean isCanPrintReturnShippingLabel() {
        return canPrintReturnShippingLabel;
    }

    /**
     * Sets the value of the canPrintReturnShippingLabel property.
     * 
     */
    public void setCanPrintReturnShippingLabel(boolean value) {
        this.canPrintReturnShippingLabel = value;
    }

    /**
     * Gets the value of the canManageUsers property.
     * 
     */
    public boolean isCanManageUsers() {
        return canManageUsers;
    }

    /**
     * Sets the value of the canManageUsers property.
     * 
     */
    public void setCanManageUsers(boolean value) {
        this.canManageUsers = value;
    }

    /**
     * Gets the value of the canPrintNetStamps property.
     * 
     */
    public boolean isCanPrintNetStamps() {
        return canPrintNetStamps;
    }

    /**
     * Sets the value of the canPrintNetStamps property.
     * 
     */
    public void setCanPrintNetStamps(boolean value) {
        this.canPrintNetStamps = value;
    }

    /**
     * Gets the value of the canEmailNotifications property.
     * 
     */
    public boolean isCanEmailNotifications() {
        return canEmailNotifications;
    }

    /**
     * Sets the value of the canEmailNotifications property.
     * 
     */
    public void setCanEmailNotifications(boolean value) {
        this.canEmailNotifications = value;
    }

    /**
     * Gets the value of the canViewReports property.
     * 
     */
    public boolean isCanViewReports() {
        return canViewReports;
    }

    /**
     * Sets the value of the canViewReports property.
     * 
     */
    public void setCanViewReports(boolean value) {
        this.canViewReports = value;
    }

    /**
     * Gets the value of the canCreateSCANForm property.
     * 
     */
    public boolean isCanCreateSCANForm() {
        return canCreateSCANForm;
    }

    /**
     * Sets the value of the canCreateSCANForm property.
     * 
     */
    public void setCanCreateSCANForm(boolean value) {
        this.canCreateSCANForm = value;
    }

    /**
     * Gets the value of the allowRestrictedSheets property.
     * 
     */
    public boolean isAllowRestrictedSheets() {
        return allowRestrictedSheets;
    }

    /**
     * Sets the value of the allowRestrictedSheets property.
     * 
     */
    public void setAllowRestrictedSheets(boolean value) {
        this.allowRestrictedSheets = value;
    }

    /**
     * Gets the value of the hideUnavailableFeatures property.
     * 
     */
    public boolean isHideUnavailableFeatures() {
        return hideUnavailableFeatures;
    }

    /**
     * Sets the value of the hideUnavailableFeatures property.
     * 
     */
    public void setHideUnavailableFeatures(boolean value) {
        this.hideUnavailableFeatures = value;
    }

    /**
     * Gets the value of the webPostage property.
     * 
     */
    public boolean isWebPostage() {
        return webPostage;
    }

    /**
     * Sets the value of the webPostage property.
     * 
     */
    public void setWebPostage(boolean value) {
        this.webPostage = value;
    }

    /**
     * Gets the value of the canViewInsuranceHistory property.
     * 
     */
    public boolean isCanViewInsuranceHistory() {
        return canViewInsuranceHistory;
    }

    /**
     * Sets the value of the canViewInsuranceHistory property.
     * 
     */
    public void setCanViewInsuranceHistory(boolean value) {
        this.canViewInsuranceHistory = value;
    }

    /**
     * Gets the value of the canChangeServicePlan property.
     * 
     */
    public boolean isCanChangeServicePlan() {
        return canChangeServicePlan;
    }

    /**
     * Sets the value of the canChangeServicePlan property.
     * 
     */
    public void setCanChangeServicePlan(boolean value) {
        this.canChangeServicePlan = value;
    }

    /**
     * Gets the value of the hideEstimatedDeliveryTime property.
     * 
     */
    public boolean isHideEstimatedDeliveryTime() {
        return hideEstimatedDeliveryTime;
    }

    /**
     * Sets the value of the hideEstimatedDeliveryTime property.
     * 
     */
    public void setHideEstimatedDeliveryTime(boolean value) {
        this.hideEstimatedDeliveryTime = value;
    }

    /**
     * Gets the value of the canPurchaseFromStore property.
     * 
     */
    public boolean isCanPurchaseFromStore() {
        return canPurchaseFromStore;
    }

    /**
     * Sets the value of the canPurchaseFromStore property.
     * 
     */
    public void setCanPurchaseFromStore(boolean value) {
        this.canPurchaseFromStore = value;
    }

    /**
     * Gets the value of the canChangePhysicalAddress property.
     * 
     */
    public boolean isCanChangePhysicalAddress() {
        return canChangePhysicalAddress;
    }

    /**
     * Sets the value of the canChangePhysicalAddress property.
     * 
     */
    public void setCanChangePhysicalAddress(boolean value) {
        this.canChangePhysicalAddress = value;
    }

    /**
     * Gets the value of the canChangePaymentMethod property.
     * 
     */
    public boolean isCanChangePaymentMethod() {
        return canChangePaymentMethod;
    }

    /**
     * Sets the value of the canChangePaymentMethod property.
     * 
     */
    public void setCanChangePaymentMethod(boolean value) {
        this.canChangePaymentMethod = value;
    }

    /**
     * Gets the value of the canChangeContactInfo property.
     * 
     */
    public boolean isCanChangeContactInfo() {
        return canChangeContactInfo;
    }

    /**
     * Sets the value of the canChangeContactInfo property.
     * 
     */
    public void setCanChangeContactInfo(boolean value) {
        this.canChangeContactInfo = value;
    }

    /**
     * Gets the value of the canViewAdvancedReporting property.
     * 
     */
    public boolean isCanViewAdvancedReporting() {
        return canViewAdvancedReporting;
    }

    /**
     * Sets the value of the canViewAdvancedReporting property.
     * 
     */
    public void setCanViewAdvancedReporting(boolean value) {
        this.canViewAdvancedReporting = value;
    }

}
