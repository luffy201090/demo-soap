
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RateV45 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateV45"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="From" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Address"/&gt;
 *         &lt;element name="To" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Address"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ServiceType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ServiceType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrintLayout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliverDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeightLb" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="WeightOz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PackageType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PackageTypeV11" minOccurs="0"/&gt;
 *         &lt;element name="RequiresAllOf" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfArrayOfAddOnTypeV20" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}double-le-999" minOccurs="0"/&gt;
 *         &lt;element name="Width" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}double-le-999" minOccurs="0"/&gt;
 *         &lt;element name="Height" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}double-le-999" minOccurs="0"/&gt;
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="InsuredValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RegisteredValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CODValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DeclaredValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NonMachinable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RectangularShaped" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Prohibitions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Restrictions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Regulations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GEMNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxDimensions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DimWeighting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddOns" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfAddOnV20" minOccurs="0"/&gt;
 *         &lt;element name="Surcharges" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfSurchargeV5" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveWeightInOunces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Zone" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RateCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CubicPricing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ContentType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ContentTypeV2" minOccurs="0"/&gt;
 *         &lt;element name="EntryFacility" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}EntryFacilityV1" minOccurs="0"/&gt;
 *         &lt;element name="SortType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}SortTypeV1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateV45", propOrder = {
    "from",
    "to",
    "amount",
    "maxAmount",
    "serviceType",
    "serviceDescription",
    "printLayout",
    "deliverDays",
    "weightLb",
    "weightOz",
    "packageType",
    "requiresAllOf",
    "length",
    "width",
    "height",
    "shipDate",
    "deliveryDate",
    "insuredValue",
    "registeredValue",
    "codValue",
    "declaredValue",
    "nonMachinable",
    "rectangularShaped",
    "prohibitions",
    "restrictions",
    "observations",
    "regulations",
    "gemNotes",
    "maxDimensions",
    "dimWeighting",
    "addOns",
    "surcharges",
    "effectiveWeightInOunces",
    "zone",
    "rateCategory",
    "cubicPricing",
    "contentType",
    "entryFacility",
    "sortType"
})
public class RateV45 {

    @XmlElement(name = "From", required = true)
    protected Address from;
    @XmlElement(name = "To", required = true)
    protected Address to;
    @XmlElement(name = "Amount", defaultValue = "0.0")
    protected BigDecimal amount;
    @XmlElement(name = "MaxAmount", defaultValue = "0.0")
    protected BigDecimal maxAmount;
    @XmlElement(name = "ServiceType", defaultValue = "Unknown")
    @XmlSchemaType(name = "string")
    protected ServiceType serviceType;
    @XmlElement(name = "ServiceDescription")
    protected String serviceDescription;
    @XmlElement(name = "PrintLayout")
    protected String printLayout;
    @XmlElement(name = "DeliverDays")
    protected String deliverDays;
    @XmlElement(name = "WeightLb", defaultValue = "0")
    protected Double weightLb;
    @XmlElement(name = "WeightOz", defaultValue = "0")
    protected Double weightOz;
    @XmlElement(name = "PackageType", defaultValue = "Unknown")
    protected String packageType;
    @XmlElement(name = "RequiresAllOf")
    protected ArrayOfArrayOfAddOnTypeV20 requiresAllOf;
    @XmlElement(name = "Length", defaultValue = "0")
    protected Double length;
    @XmlElement(name = "Width", defaultValue = "0")
    protected Double width;
    @XmlElement(name = "Height", defaultValue = "0")
    protected Double height;
    @XmlElement(name = "ShipDate", defaultValue = "0001-01-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDate;
    @XmlElement(name = "DeliveryDate", defaultValue = "0001-01-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "InsuredValue", defaultValue = "0.0")
    protected BigDecimal insuredValue;
    @XmlElement(name = "RegisteredValue", defaultValue = "0.0")
    protected BigDecimal registeredValue;
    @XmlElement(name = "CODValue", defaultValue = "0.0")
    protected BigDecimal codValue;
    @XmlElement(name = "DeclaredValue", defaultValue = "0.0")
    protected BigDecimal declaredValue;
    @XmlElement(name = "NonMachinable", defaultValue = "false")
    protected Boolean nonMachinable;
    @XmlElement(name = "RectangularShaped", defaultValue = "true")
    protected Boolean rectangularShaped;
    @XmlElement(name = "Prohibitions")
    protected String prohibitions;
    @XmlElement(name = "Restrictions")
    protected String restrictions;
    @XmlElement(name = "Observations")
    protected String observations;
    @XmlElement(name = "Regulations")
    protected String regulations;
    @XmlElement(name = "GEMNotes")
    protected String gemNotes;
    @XmlElement(name = "MaxDimensions")
    protected String maxDimensions;
    @XmlElement(name = "DimWeighting")
    protected String dimWeighting;
    @XmlElement(name = "AddOns")
    protected ArrayOfAddOnV20 addOns;
    @XmlElement(name = "Surcharges")
    protected ArrayOfSurchargeV5 surcharges;
    @XmlElement(name = "EffectiveWeightInOunces", defaultValue = "0")
    protected Integer effectiveWeightInOunces;
    @XmlElement(name = "Zone", defaultValue = "0")
    protected Integer zone;
    @XmlElement(name = "RateCategory", defaultValue = "0")
    protected Integer rateCategory;
    @XmlElement(name = "CubicPricing", defaultValue = "false")
    protected Boolean cubicPricing;
    @XmlElement(name = "ContentType")
    @XmlSchemaType(name = "string")
    protected ContentTypeV2 contentType;
    @XmlElement(name = "EntryFacility", defaultValue = "Unknown")
    @XmlSchemaType(name = "string")
    protected EntryFacilityV1 entryFacility;
    @XmlElement(name = "SortType", defaultValue = "Unknown")
    @XmlSchemaType(name = "string")
    protected SortTypeV1 sortType;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setFrom(Address value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setTo(Address value) {
        this.to = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the maxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAmount(BigDecimal value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceType(ServiceType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the serviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Sets the value of the serviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDescription(String value) {
        this.serviceDescription = value;
    }

    /**
     * Gets the value of the printLayout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintLayout() {
        return printLayout;
    }

    /**
     * Sets the value of the printLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintLayout(String value) {
        this.printLayout = value;
    }

    /**
     * Gets the value of the deliverDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliverDays() {
        return deliverDays;
    }

    /**
     * Sets the value of the deliverDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliverDays(String value) {
        this.deliverDays = value;
    }

    /**
     * Gets the value of the weightLb property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeightLb() {
        return weightLb;
    }

    /**
     * Sets the value of the weightLb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeightLb(Double value) {
        this.weightLb = value;
    }

    /**
     * Gets the value of the weightOz property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeightOz() {
        return weightOz;
    }

    /**
     * Sets the value of the weightOz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeightOz(Double value) {
        this.weightOz = value;
    }

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageType(String value) {
        this.packageType = value;
    }

    /**
     * Gets the value of the requiresAllOf property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfAddOnTypeV20 }
     *     
     */
    public ArrayOfArrayOfAddOnTypeV20 getRequiresAllOf() {
        return requiresAllOf;
    }

    /**
     * Sets the value of the requiresAllOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfAddOnTypeV20 }
     *     
     */
    public void setRequiresAllOf(ArrayOfArrayOfAddOnTypeV20 value) {
        this.requiresAllOf = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLength(Double value) {
        this.length = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWidth(Double value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeight(Double value) {
        this.height = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDate(XMLGregorianCalendar value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the insuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsuredValue() {
        return insuredValue;
    }

    /**
     * Sets the value of the insuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsuredValue(BigDecimal value) {
        this.insuredValue = value;
    }

    /**
     * Gets the value of the registeredValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegisteredValue() {
        return registeredValue;
    }

    /**
     * Sets the value of the registeredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegisteredValue(BigDecimal value) {
        this.registeredValue = value;
    }

    /**
     * Gets the value of the codValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCODValue() {
        return codValue;
    }

    /**
     * Sets the value of the codValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCODValue(BigDecimal value) {
        this.codValue = value;
    }

    /**
     * Gets the value of the declaredValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeclaredValue() {
        return declaredValue;
    }

    /**
     * Sets the value of the declaredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeclaredValue(BigDecimal value) {
        this.declaredValue = value;
    }

    /**
     * Gets the value of the nonMachinable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonMachinable() {
        return nonMachinable;
    }

    /**
     * Sets the value of the nonMachinable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonMachinable(Boolean value) {
        this.nonMachinable = value;
    }

    /**
     * Gets the value of the rectangularShaped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRectangularShaped() {
        return rectangularShaped;
    }

    /**
     * Sets the value of the rectangularShaped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRectangularShaped(Boolean value) {
        this.rectangularShaped = value;
    }

    /**
     * Gets the value of the prohibitions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProhibitions() {
        return prohibitions;
    }

    /**
     * Sets the value of the prohibitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProhibitions(String value) {
        this.prohibitions = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictions(String value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the observations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservations() {
        return observations;
    }

    /**
     * Sets the value of the observations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservations(String value) {
        this.observations = value;
    }

    /**
     * Gets the value of the regulations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulations() {
        return regulations;
    }

    /**
     * Sets the value of the regulations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulations(String value) {
        this.regulations = value;
    }

    /**
     * Gets the value of the gemNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEMNotes() {
        return gemNotes;
    }

    /**
     * Sets the value of the gemNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEMNotes(String value) {
        this.gemNotes = value;
    }

    /**
     * Gets the value of the maxDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDimensions() {
        return maxDimensions;
    }

    /**
     * Sets the value of the maxDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDimensions(String value) {
        this.maxDimensions = value;
    }

    /**
     * Gets the value of the dimWeighting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimWeighting() {
        return dimWeighting;
    }

    /**
     * Sets the value of the dimWeighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimWeighting(String value) {
        this.dimWeighting = value;
    }

    /**
     * Gets the value of the addOns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddOnV20 }
     *     
     */
    public ArrayOfAddOnV20 getAddOns() {
        return addOns;
    }

    /**
     * Sets the value of the addOns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddOnV20 }
     *     
     */
    public void setAddOns(ArrayOfAddOnV20 value) {
        this.addOns = value;
    }

    /**
     * Gets the value of the surcharges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSurchargeV5 }
     *     
     */
    public ArrayOfSurchargeV5 getSurcharges() {
        return surcharges;
    }

    /**
     * Sets the value of the surcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSurchargeV5 }
     *     
     */
    public void setSurcharges(ArrayOfSurchargeV5 value) {
        this.surcharges = value;
    }

    /**
     * Gets the value of the effectiveWeightInOunces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEffectiveWeightInOunces() {
        return effectiveWeightInOunces;
    }

    /**
     * Sets the value of the effectiveWeightInOunces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEffectiveWeightInOunces(Integer value) {
        this.effectiveWeightInOunces = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZone(Integer value) {
        this.zone = value;
    }

    /**
     * Gets the value of the rateCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRateCategory() {
        return rateCategory;
    }

    /**
     * Sets the value of the rateCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRateCategory(Integer value) {
        this.rateCategory = value;
    }

    /**
     * Gets the value of the cubicPricing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCubicPricing() {
        return cubicPricing;
    }

    /**
     * Sets the value of the cubicPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCubicPricing(Boolean value) {
        this.cubicPricing = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link ContentTypeV2 }
     *     
     */
    public ContentTypeV2 getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentTypeV2 }
     *     
     */
    public void setContentType(ContentTypeV2 value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the entryFacility property.
     * 
     * @return
     *     possible object is
     *     {@link EntryFacilityV1 }
     *     
     */
    public EntryFacilityV1 getEntryFacility() {
        return entryFacility;
    }

    /**
     * Sets the value of the entryFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryFacilityV1 }
     *     
     */
    public void setEntryFacility(EntryFacilityV1 value) {
        this.entryFacility = value;
    }

    /**
     * Gets the value of the sortType property.
     * 
     * @return
     *     possible object is
     *     {@link SortTypeV1 }
     *     
     */
    public SortTypeV1 getSortType() {
        return sortType;
    }

    /**
     * Sets the value of the sortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortTypeV1 }
     *     
     */
    public void setSortType(SortTypeV1 value) {
        this.sortType = value;
    }

}
