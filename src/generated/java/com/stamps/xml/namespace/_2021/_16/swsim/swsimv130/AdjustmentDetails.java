
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AdjustmentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdjustmentStatus" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}AdjustmentStatus"/&gt;
 *         &lt;element name="DateAdjustmentProcessed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DateRecorded" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActualTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ActualFromZIPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualToZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualService" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ActualService"/&gt;
 *         &lt;element name="ActualAddOns" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfAddOnV20" minOccurs="0"/&gt;
 *         &lt;element name="ActualPackageInfo" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ActualPackageInfo"/&gt;
 *         &lt;element name="Dispute" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}DisputeInfoV1" minOccurs="0"/&gt;
 *         &lt;element name="ActualFromCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualFromCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualSurcharges" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfSurchargeV5" minOccurs="0"/&gt;
 *         &lt;element name="OtherSurchargeAmounts" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustmentDetails", propOrder = {
    "adjustmentStatus",
    "dateAdjustmentProcessed",
    "dateRecorded",
    "actualTrackingNumber",
    "actualFromZIPCode",
    "actualToCountry",
    "actualToZip",
    "actualService",
    "actualAddOns",
    "actualPackageInfo",
    "dispute",
    "actualFromCountry",
    "actualFromCity",
    "actualToCity",
    "actualSurcharges",
    "otherSurchargeAmounts"
})
public class AdjustmentDetails {

    @XmlElement(name = "AdjustmentStatus", required = true)
    @XmlSchemaType(name = "string")
    protected AdjustmentStatus adjustmentStatus;
    @XmlElementRef(name = "DateAdjustmentProcessed", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateAdjustmentProcessed;
    @XmlElementRef(name = "DateRecorded", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateRecorded;
    @XmlElement(name = "ActualTrackingNumber", required = true)
    protected String actualTrackingNumber;
    @XmlElement(name = "ActualFromZIPCode")
    protected String actualFromZIPCode;
    @XmlElement(name = "ActualToCountry")
    protected String actualToCountry;
    @XmlElement(name = "ActualToZip")
    protected String actualToZip;
    @XmlElement(name = "ActualService", required = true)
    protected ActualService actualService;
    @XmlElement(name = "ActualAddOns")
    protected ArrayOfAddOnV20 actualAddOns;
    @XmlElement(name = "ActualPackageInfo", required = true)
    protected ActualPackageInfo actualPackageInfo;
    @XmlElement(name = "Dispute")
    protected DisputeInfoV1 dispute;
    @XmlElement(name = "ActualFromCountry")
    protected String actualFromCountry;
    @XmlElement(name = "ActualFromCity")
    protected String actualFromCity;
    @XmlElement(name = "ActualToCity")
    protected String actualToCity;
    @XmlElement(name = "ActualSurcharges")
    protected ArrayOfSurchargeV5 actualSurcharges;
    @XmlElementRef(name = "OtherSurchargeAmounts", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> otherSurchargeAmounts;

    /**
     * Gets the value of the adjustmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentStatus }
     *     
     */
    public AdjustmentStatus getAdjustmentStatus() {
        return adjustmentStatus;
    }

    /**
     * Sets the value of the adjustmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentStatus }
     *     
     */
    public void setAdjustmentStatus(AdjustmentStatus value) {
        this.adjustmentStatus = value;
    }

    /**
     * Gets the value of the dateAdjustmentProcessed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateAdjustmentProcessed() {
        return dateAdjustmentProcessed;
    }

    /**
     * Sets the value of the dateAdjustmentProcessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateAdjustmentProcessed(JAXBElement<XMLGregorianCalendar> value) {
        this.dateAdjustmentProcessed = value;
    }

    /**
     * Gets the value of the dateRecorded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateRecorded() {
        return dateRecorded;
    }

    /**
     * Sets the value of the dateRecorded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateRecorded(JAXBElement<XMLGregorianCalendar> value) {
        this.dateRecorded = value;
    }

    /**
     * Gets the value of the actualTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualTrackingNumber() {
        return actualTrackingNumber;
    }

    /**
     * Sets the value of the actualTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualTrackingNumber(String value) {
        this.actualTrackingNumber = value;
    }

    /**
     * Gets the value of the actualFromZIPCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualFromZIPCode() {
        return actualFromZIPCode;
    }

    /**
     * Sets the value of the actualFromZIPCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualFromZIPCode(String value) {
        this.actualFromZIPCode = value;
    }

    /**
     * Gets the value of the actualToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualToCountry() {
        return actualToCountry;
    }

    /**
     * Sets the value of the actualToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualToCountry(String value) {
        this.actualToCountry = value;
    }

    /**
     * Gets the value of the actualToZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualToZip() {
        return actualToZip;
    }

    /**
     * Sets the value of the actualToZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualToZip(String value) {
        this.actualToZip = value;
    }

    /**
     * Gets the value of the actualService property.
     * 
     * @return
     *     possible object is
     *     {@link ActualService }
     *     
     */
    public ActualService getActualService() {
        return actualService;
    }

    /**
     * Sets the value of the actualService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualService }
     *     
     */
    public void setActualService(ActualService value) {
        this.actualService = value;
    }

    /**
     * Gets the value of the actualAddOns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddOnV20 }
     *     
     */
    public ArrayOfAddOnV20 getActualAddOns() {
        return actualAddOns;
    }

    /**
     * Sets the value of the actualAddOns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddOnV20 }
     *     
     */
    public void setActualAddOns(ArrayOfAddOnV20 value) {
        this.actualAddOns = value;
    }

    /**
     * Gets the value of the actualPackageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ActualPackageInfo }
     *     
     */
    public ActualPackageInfo getActualPackageInfo() {
        return actualPackageInfo;
    }

    /**
     * Sets the value of the actualPackageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualPackageInfo }
     *     
     */
    public void setActualPackageInfo(ActualPackageInfo value) {
        this.actualPackageInfo = value;
    }

    /**
     * Gets the value of the dispute property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeInfoV1 }
     *     
     */
    public DisputeInfoV1 getDispute() {
        return dispute;
    }

    /**
     * Sets the value of the dispute property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeInfoV1 }
     *     
     */
    public void setDispute(DisputeInfoV1 value) {
        this.dispute = value;
    }

    /**
     * Gets the value of the actualFromCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualFromCountry() {
        return actualFromCountry;
    }

    /**
     * Sets the value of the actualFromCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualFromCountry(String value) {
        this.actualFromCountry = value;
    }

    /**
     * Gets the value of the actualFromCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualFromCity() {
        return actualFromCity;
    }

    /**
     * Sets the value of the actualFromCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualFromCity(String value) {
        this.actualFromCity = value;
    }

    /**
     * Gets the value of the actualToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualToCity() {
        return actualToCity;
    }

    /**
     * Sets the value of the actualToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualToCity(String value) {
        this.actualToCity = value;
    }

    /**
     * Gets the value of the actualSurcharges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSurchargeV5 }
     *     
     */
    public ArrayOfSurchargeV5 getActualSurcharges() {
        return actualSurcharges;
    }

    /**
     * Sets the value of the actualSurcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSurchargeV5 }
     *     
     */
    public void setActualSurcharges(ArrayOfSurchargeV5 value) {
        this.actualSurcharges = value;
    }

    /**
     * Gets the value of the otherSurchargeAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOtherSurchargeAmounts() {
        return otherSurchargeAmounts;
    }

    /**
     * Sets the value of the otherSurchargeAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOtherSurchargeAmounts(JAXBElement<BigDecimal> value) {
        this.otherSurchargeAmounts = value;
    }

}
