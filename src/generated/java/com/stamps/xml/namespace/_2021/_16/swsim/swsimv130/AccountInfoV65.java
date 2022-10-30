
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountInfoV65 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountInfoV65"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MeterNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PostageBalance" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PostageBalance"/&gt;
 *         &lt;element name="MaxPostageBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="LPOCity" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-29"/&gt;
 *         &lt;element name="LPOState" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-3"/&gt;
 *         &lt;element name="LPOZip" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-6"/&gt;
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CorpID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StoreID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CostCodeLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MonthlyPostagePurchaseLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxUsers" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Capabilities" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV50"/&gt;
 *         &lt;element name="MeterPhysicalAddress" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Address"/&gt;
 *         &lt;element name="ResubmitStatus" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ResubmissionStatus"/&gt;
 *         &lt;element name="ResubmitCookie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PendingPlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Username" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-40"/&gt;
 *         &lt;element name="RatesetType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}RatesetType" minOccurs="0"/&gt;
 *         &lt;element name="USPSRep" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoBuySettings" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}AutoBuySettings" minOccurs="0"/&gt;
 *         &lt;element name="RateToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Terms" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Terms"/&gt;
 *         &lt;element name="OutstandingLabelBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MaxOutstandingLabelBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Merchant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeterProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxImageCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SEApiToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GAPickupCarrier" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PickupCarrier"/&gt;
 *         &lt;element name="LocalCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HasPOURMailerID" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MaxParcelGuardInsuredValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FacilityAssigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConfiguredCarriers" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfConfiguredCarriers" minOccurs="0"/&gt;
 *         &lt;element name="GPPickupCarrier" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PickupCarrier"/&gt;
 *         &lt;element name="MailingZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BalanceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrandedExternalPrints" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CustomerGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountInfoV65", propOrder = {
    "customerID",
    "meterNumber",
    "userID",
    "postageBalance",
    "maxPostageBalance",
    "lpoCity",
    "lpoState",
    "lpoZip",
    "accountId",
    "corpID",
    "storeID",
    "costCodeLimit",
    "monthlyPostagePurchaseLimit",
    "maxUsers",
    "capabilities",
    "meterPhysicalAddress",
    "resubmitStatus",
    "resubmitCookie",
    "planID",
    "pendingPlanId",
    "username",
    "ratesetType",
    "uspsRep",
    "autoBuySettings",
    "rateToken",
    "customerData",
    "terms",
    "outstandingLabelBalance",
    "maxOutstandingLabelBalance",
    "merchant",
    "meterProvider",
    "maxImageCount",
    "seApiToken",
    "gaPickupCarrier",
    "localCurrency",
    "hasPOURMailerID",
    "maxParcelGuardInsuredValue",
    "facilityAssigned",
    "configuredCarriers",
    "gpPickupCarrier",
    "mailingZipCode",
    "balanceID",
    "brandedExternalPrints",
    "customerGroup"
})
public class AccountInfoV65 {

    @XmlElement(name = "CustomerID")
    protected int customerID;
    @XmlElement(name = "MeterNumber")
    protected int meterNumber;
    @XmlElement(name = "UserID")
    protected int userID;
    @XmlElement(name = "PostageBalance", required = true)
    protected PostageBalance postageBalance;
    @XmlElement(name = "MaxPostageBalance", required = true)
    protected BigDecimal maxPostageBalance;
    @XmlElement(name = "LPOCity", required = true)
    protected String lpoCity;
    @XmlElement(name = "LPOState", required = true)
    protected String lpoState;
    @XmlElement(name = "LPOZip", required = true)
    protected String lpoZip;
    @XmlElement(name = "AccountId", defaultValue = "0")
    protected Long accountId;
    @XmlElement(name = "CorpID")
    protected int corpID;
    @XmlElement(name = "StoreID", required = true)
    protected String storeID;
    @XmlElement(name = "CostCodeLimit")
    protected int costCodeLimit;
    @XmlElement(name = "MonthlyPostagePurchaseLimit")
    protected int monthlyPostagePurchaseLimit;
    @XmlElement(name = "MaxUsers")
    protected int maxUsers;
    @XmlElement(name = "Capabilities", required = true)
    protected CapabilitiesV50 capabilities;
    @XmlElement(name = "MeterPhysicalAddress", required = true)
    protected Address meterPhysicalAddress;
    @XmlElement(name = "ResubmitStatus", required = true)
    @XmlSchemaType(name = "string")
    protected ResubmissionStatus resubmitStatus;
    @XmlElement(name = "ResubmitCookie", defaultValue = "")
    protected String resubmitCookie;
    @XmlElement(name = "PlanID")
    protected int planID;
    @XmlElementRef(name = "PendingPlanId", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pendingPlanId;
    @XmlElement(name = "Username", required = true)
    protected String username;
    @XmlElementRef(name = "RatesetType", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<RatesetType> ratesetType;
    @XmlElementRef(name = "USPSRep", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> uspsRep;
    @XmlElement(name = "AutoBuySettings")
    protected AutoBuySettings autoBuySettings;
    @XmlElement(name = "RateToken")
    protected String rateToken;
    @XmlElement(name = "CustomerData")
    protected String customerData;
    @XmlElement(name = "Terms", required = true)
    protected Terms terms;
    @XmlElementRef(name = "OutstandingLabelBalance", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> outstandingLabelBalance;
    @XmlElementRef(name = "MaxOutstandingLabelBalance", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> maxOutstandingLabelBalance;
    @XmlElement(name = "Merchant")
    protected String merchant;
    @XmlElement(name = "MeterProvider")
    protected String meterProvider;
    @XmlElement(name = "MaxImageCount")
    protected int maxImageCount;
    @XmlElement(name = "SEApiToken")
    protected String seApiToken;
    @XmlElement(name = "GAPickupCarrier", required = true)
    @XmlSchemaType(name = "string")
    protected PickupCarrier gaPickupCarrier;
    @XmlElement(name = "LocalCurrency", required = true)
    protected String localCurrency;
    @XmlElement(name = "HasPOURMailerID")
    protected boolean hasPOURMailerID;
    @XmlElementRef(name = "MaxParcelGuardInsuredValue", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> maxParcelGuardInsuredValue;
    @XmlElement(name = "FacilityAssigned", defaultValue = "false")
    protected Boolean facilityAssigned;
    @XmlElement(name = "ConfiguredCarriers")
    protected ArrayOfConfiguredCarriers configuredCarriers;
    @XmlElement(name = "GPPickupCarrier", required = true)
    @XmlSchemaType(name = "string")
    protected PickupCarrier gpPickupCarrier;
    @XmlElement(name = "MailingZipCode", required = true)
    protected String mailingZipCode;
    @XmlElement(name = "BalanceID")
    protected String balanceID;
    @XmlElement(name = "BrandedExternalPrints")
    protected boolean brandedExternalPrints;
    @XmlElement(name = "CustomerGroup")
    protected String customerGroup;

    /**
     * Gets the value of the customerID property.
     * 
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     */
    public void setCustomerID(int value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the meterNumber property.
     * 
     */
    public int getMeterNumber() {
        return meterNumber;
    }

    /**
     * Sets the value of the meterNumber property.
     * 
     */
    public void setMeterNumber(int value) {
        this.meterNumber = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     */
    public void setUserID(int value) {
        this.userID = value;
    }

    /**
     * Gets the value of the postageBalance property.
     * 
     * @return
     *     possible object is
     *     {@link PostageBalance }
     *     
     */
    public PostageBalance getPostageBalance() {
        return postageBalance;
    }

    /**
     * Sets the value of the postageBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostageBalance }
     *     
     */
    public void setPostageBalance(PostageBalance value) {
        this.postageBalance = value;
    }

    /**
     * Gets the value of the maxPostageBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxPostageBalance() {
        return maxPostageBalance;
    }

    /**
     * Sets the value of the maxPostageBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxPostageBalance(BigDecimal value) {
        this.maxPostageBalance = value;
    }

    /**
     * Gets the value of the lpoCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPOCity() {
        return lpoCity;
    }

    /**
     * Sets the value of the lpoCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPOCity(String value) {
        this.lpoCity = value;
    }

    /**
     * Gets the value of the lpoState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPOState() {
        return lpoState;
    }

    /**
     * Sets the value of the lpoState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPOState(String value) {
        this.lpoState = value;
    }

    /**
     * Gets the value of the lpoZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPOZip() {
        return lpoZip;
    }

    /**
     * Sets the value of the lpoZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPOZip(String value) {
        this.lpoZip = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the corpID property.
     * 
     */
    public int getCorpID() {
        return corpID;
    }

    /**
     * Sets the value of the corpID property.
     * 
     */
    public void setCorpID(int value) {
        this.corpID = value;
    }

    /**
     * Gets the value of the storeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreID() {
        return storeID;
    }

    /**
     * Sets the value of the storeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreID(String value) {
        this.storeID = value;
    }

    /**
     * Gets the value of the costCodeLimit property.
     * 
     */
    public int getCostCodeLimit() {
        return costCodeLimit;
    }

    /**
     * Sets the value of the costCodeLimit property.
     * 
     */
    public void setCostCodeLimit(int value) {
        this.costCodeLimit = value;
    }

    /**
     * Gets the value of the monthlyPostagePurchaseLimit property.
     * 
     */
    public int getMonthlyPostagePurchaseLimit() {
        return monthlyPostagePurchaseLimit;
    }

    /**
     * Sets the value of the monthlyPostagePurchaseLimit property.
     * 
     */
    public void setMonthlyPostagePurchaseLimit(int value) {
        this.monthlyPostagePurchaseLimit = value;
    }

    /**
     * Gets the value of the maxUsers property.
     * 
     */
    public int getMaxUsers() {
        return maxUsers;
    }

    /**
     * Sets the value of the maxUsers property.
     * 
     */
    public void setMaxUsers(int value) {
        this.maxUsers = value;
    }

    /**
     * Gets the value of the capabilities property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesV50 }
     *     
     */
    public CapabilitiesV50 getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesV50 }
     *     
     */
    public void setCapabilities(CapabilitiesV50 value) {
        this.capabilities = value;
    }

    /**
     * Gets the value of the meterPhysicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getMeterPhysicalAddress() {
        return meterPhysicalAddress;
    }

    /**
     * Sets the value of the meterPhysicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setMeterPhysicalAddress(Address value) {
        this.meterPhysicalAddress = value;
    }

    /**
     * Gets the value of the resubmitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResubmissionStatus }
     *     
     */
    public ResubmissionStatus getResubmitStatus() {
        return resubmitStatus;
    }

    /**
     * Sets the value of the resubmitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResubmissionStatus }
     *     
     */
    public void setResubmitStatus(ResubmissionStatus value) {
        this.resubmitStatus = value;
    }

    /**
     * Gets the value of the resubmitCookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResubmitCookie() {
        return resubmitCookie;
    }

    /**
     * Sets the value of the resubmitCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResubmitCookie(String value) {
        this.resubmitCookie = value;
    }

    /**
     * Gets the value of the planID property.
     * 
     */
    public int getPlanID() {
        return planID;
    }

    /**
     * Sets the value of the planID property.
     * 
     */
    public void setPlanID(int value) {
        this.planID = value;
    }

    /**
     * Gets the value of the pendingPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPendingPlanId() {
        return pendingPlanId;
    }

    /**
     * Sets the value of the pendingPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPendingPlanId(JAXBElement<Integer> value) {
        this.pendingPlanId = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the ratesetType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RatesetType }{@code >}
     *     
     */
    public JAXBElement<RatesetType> getRatesetType() {
        return ratesetType;
    }

    /**
     * Sets the value of the ratesetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RatesetType }{@code >}
     *     
     */
    public void setRatesetType(JAXBElement<RatesetType> value) {
        this.ratesetType = value;
    }

    /**
     * Gets the value of the uspsRep property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUSPSRep() {
        return uspsRep;
    }

    /**
     * Sets the value of the uspsRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUSPSRep(JAXBElement<Boolean> value) {
        this.uspsRep = value;
    }

    /**
     * Gets the value of the autoBuySettings property.
     * 
     * @return
     *     possible object is
     *     {@link AutoBuySettings }
     *     
     */
    public AutoBuySettings getAutoBuySettings() {
        return autoBuySettings;
    }

    /**
     * Sets the value of the autoBuySettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoBuySettings }
     *     
     */
    public void setAutoBuySettings(AutoBuySettings value) {
        this.autoBuySettings = value;
    }

    /**
     * Gets the value of the rateToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateToken() {
        return rateToken;
    }

    /**
     * Sets the value of the rateToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateToken(String value) {
        this.rateToken = value;
    }

    /**
     * Gets the value of the customerData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerData() {
        return customerData;
    }

    /**
     * Sets the value of the customerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerData(String value) {
        this.customerData = value;
    }

    /**
     * Gets the value of the terms property.
     * 
     * @return
     *     possible object is
     *     {@link Terms }
     *     
     */
    public Terms getTerms() {
        return terms;
    }

    /**
     * Sets the value of the terms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terms }
     *     
     */
    public void setTerms(Terms value) {
        this.terms = value;
    }

    /**
     * Gets the value of the outstandingLabelBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOutstandingLabelBalance() {
        return outstandingLabelBalance;
    }

    /**
     * Sets the value of the outstandingLabelBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOutstandingLabelBalance(JAXBElement<BigDecimal> value) {
        this.outstandingLabelBalance = value;
    }

    /**
     * Gets the value of the maxOutstandingLabelBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMaxOutstandingLabelBalance() {
        return maxOutstandingLabelBalance;
    }

    /**
     * Sets the value of the maxOutstandingLabelBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMaxOutstandingLabelBalance(JAXBElement<BigDecimal> value) {
        this.maxOutstandingLabelBalance = value;
    }

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchant(String value) {
        this.merchant = value;
    }

    /**
     * Gets the value of the meterProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterProvider() {
        return meterProvider;
    }

    /**
     * Sets the value of the meterProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterProvider(String value) {
        this.meterProvider = value;
    }

    /**
     * Gets the value of the maxImageCount property.
     * 
     */
    public int getMaxImageCount() {
        return maxImageCount;
    }

    /**
     * Sets the value of the maxImageCount property.
     * 
     */
    public void setMaxImageCount(int value) {
        this.maxImageCount = value;
    }

    /**
     * Gets the value of the seApiToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEApiToken() {
        return seApiToken;
    }

    /**
     * Sets the value of the seApiToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEApiToken(String value) {
        this.seApiToken = value;
    }

    /**
     * Gets the value of the gaPickupCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link PickupCarrier }
     *     
     */
    public PickupCarrier getGAPickupCarrier() {
        return gaPickupCarrier;
    }

    /**
     * Sets the value of the gaPickupCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupCarrier }
     *     
     */
    public void setGAPickupCarrier(PickupCarrier value) {
        this.gaPickupCarrier = value;
    }

    /**
     * Gets the value of the localCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCurrency() {
        return localCurrency;
    }

    /**
     * Sets the value of the localCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCurrency(String value) {
        this.localCurrency = value;
    }

    /**
     * Gets the value of the hasPOURMailerID property.
     * 
     */
    public boolean isHasPOURMailerID() {
        return hasPOURMailerID;
    }

    /**
     * Sets the value of the hasPOURMailerID property.
     * 
     */
    public void setHasPOURMailerID(boolean value) {
        this.hasPOURMailerID = value;
    }

    /**
     * Gets the value of the maxParcelGuardInsuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMaxParcelGuardInsuredValue() {
        return maxParcelGuardInsuredValue;
    }

    /**
     * Sets the value of the maxParcelGuardInsuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMaxParcelGuardInsuredValue(JAXBElement<BigDecimal> value) {
        this.maxParcelGuardInsuredValue = value;
    }

    /**
     * Gets the value of the facilityAssigned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFacilityAssigned() {
        return facilityAssigned;
    }

    /**
     * Sets the value of the facilityAssigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFacilityAssigned(Boolean value) {
        this.facilityAssigned = value;
    }

    /**
     * Gets the value of the configuredCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConfiguredCarriers }
     *     
     */
    public ArrayOfConfiguredCarriers getConfiguredCarriers() {
        return configuredCarriers;
    }

    /**
     * Sets the value of the configuredCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConfiguredCarriers }
     *     
     */
    public void setConfiguredCarriers(ArrayOfConfiguredCarriers value) {
        this.configuredCarriers = value;
    }

    /**
     * Gets the value of the gpPickupCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link PickupCarrier }
     *     
     */
    public PickupCarrier getGPPickupCarrier() {
        return gpPickupCarrier;
    }

    /**
     * Sets the value of the gpPickupCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupCarrier }
     *     
     */
    public void setGPPickupCarrier(PickupCarrier value) {
        this.gpPickupCarrier = value;
    }

    /**
     * Gets the value of the mailingZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingZipCode() {
        return mailingZipCode;
    }

    /**
     * Sets the value of the mailingZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingZipCode(String value) {
        this.mailingZipCode = value;
    }

    /**
     * Gets the value of the balanceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceID() {
        return balanceID;
    }

    /**
     * Sets the value of the balanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceID(String value) {
        this.balanceID = value;
    }

    /**
     * Gets the value of the brandedExternalPrints property.
     * 
     */
    public boolean isBrandedExternalPrints() {
        return brandedExternalPrints;
    }

    /**
     * Sets the value of the brandedExternalPrints property.
     * 
     */
    public void setBrandedExternalPrints(boolean value) {
        this.brandedExternalPrints = value;
    }

    /**
     * Gets the value of the customerGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerGroup() {
        return customerGroup;
    }

    /**
     * Sets the value of the customerGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerGroup(String value) {
        this.customerGroup = value;
    }

}
