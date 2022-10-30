
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageInfoV6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageInfoV6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackageType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PackageTypeV11"/&gt;
 *         &lt;element name="NumberOfLabels" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WeightLb" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="WeightOz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="EntryFacility" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}EntryFacilityV1" minOccurs="0"/&gt;
 *         &lt;element name="SortType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}SortTypeV1" minOccurs="0"/&gt;
 *         &lt;element name="EnclosedServiceType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}EnclosedServiceType" minOccurs="0"/&gt;
 *         &lt;element name="EnclosedPackageType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}EnclosedPackageType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageInfoV6", propOrder = {
    "packageType",
    "numberOfLabels",
    "weightLb",
    "weightOz",
    "entryFacility",
    "sortType",
    "enclosedServiceType",
    "enclosedPackageType"
})
public class PackageInfoV6 {

    @XmlElement(name = "PackageType", required = true)
    protected String packageType;
    @XmlElement(name = "NumberOfLabels")
    protected int numberOfLabels;
    @XmlElement(name = "WeightLb", defaultValue = "0")
    protected Double weightLb;
    @XmlElement(name = "WeightOz", defaultValue = "0")
    protected Double weightOz;
    @XmlElementRef(name = "EntryFacility", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<EntryFacilityV1> entryFacility;
    @XmlElementRef(name = "SortType", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<SortTypeV1> sortType;
    @XmlElementRef(name = "EnclosedServiceType", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<EnclosedServiceType> enclosedServiceType;
    @XmlElementRef(name = "EnclosedPackageType", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<EnclosedPackageType> enclosedPackageType;

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
     * Gets the value of the numberOfLabels property.
     * 
     */
    public int getNumberOfLabels() {
        return numberOfLabels;
    }

    /**
     * Sets the value of the numberOfLabels property.
     * 
     */
    public void setNumberOfLabels(int value) {
        this.numberOfLabels = value;
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
     * Gets the value of the entryFacility property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntryFacilityV1 }{@code >}
     *     
     */
    public JAXBElement<EntryFacilityV1> getEntryFacility() {
        return entryFacility;
    }

    /**
     * Sets the value of the entryFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntryFacilityV1 }{@code >}
     *     
     */
    public void setEntryFacility(JAXBElement<EntryFacilityV1> value) {
        this.entryFacility = value;
    }

    /**
     * Gets the value of the sortType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SortTypeV1 }{@code >}
     *     
     */
    public JAXBElement<SortTypeV1> getSortType() {
        return sortType;
    }

    /**
     * Sets the value of the sortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SortTypeV1 }{@code >}
     *     
     */
    public void setSortType(JAXBElement<SortTypeV1> value) {
        this.sortType = value;
    }

    /**
     * Gets the value of the enclosedServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnclosedServiceType }{@code >}
     *     
     */
    public JAXBElement<EnclosedServiceType> getEnclosedServiceType() {
        return enclosedServiceType;
    }

    /**
     * Sets the value of the enclosedServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnclosedServiceType }{@code >}
     *     
     */
    public void setEnclosedServiceType(JAXBElement<EnclosedServiceType> value) {
        this.enclosedServiceType = value;
    }

    /**
     * Gets the value of the enclosedPackageType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnclosedPackageType }{@code >}
     *     
     */
    public JAXBElement<EnclosedPackageType> getEnclosedPackageType() {
        return enclosedPackageType;
    }

    /**
     * Sets the value of the enclosedPackageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnclosedPackageType }{@code >}
     *     
     */
    public void setEnclosedPackageType(JAXBElement<EnclosedPackageType> value) {
        this.enclosedPackageType = value;
    }

}
