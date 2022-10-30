
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarrierPickupPackageInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierPickupPackageInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOfExpressMailPieces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfPriorityMailPieces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfInternationalPieces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfFirstClassPieces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfParcelSelectPieces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfOtherPieces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalWeightOfPackagesLbs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PackageLocation" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CarrierPickupLocationV1"/&gt;
 *         &lt;element name="SpecialInstruction" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-75" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierPickupPackageInformation", propOrder = {
    "numberOfExpressMailPieces",
    "numberOfPriorityMailPieces",
    "numberOfInternationalPieces",
    "numberOfFirstClassPieces",
    "numberOfParcelSelectPieces",
    "numberOfOtherPieces",
    "totalWeightOfPackagesLbs",
    "packageLocation",
    "specialInstruction"
})
public class CarrierPickupPackageInformation {

    @XmlElement(name = "NumberOfExpressMailPieces", defaultValue = "0")
    protected Integer numberOfExpressMailPieces;
    @XmlElement(name = "NumberOfPriorityMailPieces", defaultValue = "0")
    protected Integer numberOfPriorityMailPieces;
    @XmlElement(name = "NumberOfInternationalPieces", defaultValue = "0")
    protected Integer numberOfInternationalPieces;
    @XmlElement(name = "NumberOfFirstClassPieces", defaultValue = "0")
    protected Integer numberOfFirstClassPieces;
    @XmlElement(name = "NumberOfParcelSelectPieces", defaultValue = "0")
    protected Integer numberOfParcelSelectPieces;
    @XmlElement(name = "NumberOfOtherPieces", defaultValue = "0")
    protected Integer numberOfOtherPieces;
    @XmlElement(name = "TotalWeightOfPackagesLbs", defaultValue = "0")
    protected Integer totalWeightOfPackagesLbs;
    @XmlElement(name = "PackageLocation", required = true)
    @XmlSchemaType(name = "string")
    protected CarrierPickupLocationV1 packageLocation;
    @XmlElement(name = "SpecialInstruction")
    protected String specialInstruction;

    /**
     * Gets the value of the numberOfExpressMailPieces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfExpressMailPieces() {
        return numberOfExpressMailPieces;
    }

    /**
     * Sets the value of the numberOfExpressMailPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfExpressMailPieces(Integer value) {
        this.numberOfExpressMailPieces = value;
    }

    /**
     * Gets the value of the numberOfPriorityMailPieces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfPriorityMailPieces() {
        return numberOfPriorityMailPieces;
    }

    /**
     * Sets the value of the numberOfPriorityMailPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfPriorityMailPieces(Integer value) {
        this.numberOfPriorityMailPieces = value;
    }

    /**
     * Gets the value of the numberOfInternationalPieces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfInternationalPieces() {
        return numberOfInternationalPieces;
    }

    /**
     * Sets the value of the numberOfInternationalPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfInternationalPieces(Integer value) {
        this.numberOfInternationalPieces = value;
    }

    /**
     * Gets the value of the numberOfFirstClassPieces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfFirstClassPieces() {
        return numberOfFirstClassPieces;
    }

    /**
     * Sets the value of the numberOfFirstClassPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfFirstClassPieces(Integer value) {
        this.numberOfFirstClassPieces = value;
    }

    /**
     * Gets the value of the numberOfParcelSelectPieces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfParcelSelectPieces() {
        return numberOfParcelSelectPieces;
    }

    /**
     * Sets the value of the numberOfParcelSelectPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfParcelSelectPieces(Integer value) {
        this.numberOfParcelSelectPieces = value;
    }

    /**
     * Gets the value of the numberOfOtherPieces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfOtherPieces() {
        return numberOfOtherPieces;
    }

    /**
     * Sets the value of the numberOfOtherPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfOtherPieces(Integer value) {
        this.numberOfOtherPieces = value;
    }

    /**
     * Gets the value of the totalWeightOfPackagesLbs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalWeightOfPackagesLbs() {
        return totalWeightOfPackagesLbs;
    }

    /**
     * Sets the value of the totalWeightOfPackagesLbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalWeightOfPackagesLbs(Integer value) {
        this.totalWeightOfPackagesLbs = value;
    }

    /**
     * Gets the value of the packageLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierPickupLocationV1 }
     *     
     */
    public CarrierPickupLocationV1 getPackageLocation() {
        return packageLocation;
    }

    /**
     * Sets the value of the packageLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierPickupLocationV1 }
     *     
     */
    public void setPackageLocation(CarrierPickupLocationV1 value) {
        this.packageLocation = value;
    }

    /**
     * Gets the value of the specialInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInstruction() {
        return specialInstruction;
    }

    /**
     * Sets the value of the specialInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInstruction(String value) {
        this.specialInstruction = value;
    }

}
