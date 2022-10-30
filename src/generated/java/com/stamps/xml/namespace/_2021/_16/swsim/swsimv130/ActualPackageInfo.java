
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActualPackageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActualPackageInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualPackageType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PackageTypeV11"/&gt;
 *         &lt;element name="ActualWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ActualLength" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ActualWidth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ActualHeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualPackageInfo", propOrder = {
    "actualPackageType",
    "actualWeight",
    "actualLength",
    "actualWidth",
    "actualHeight"
})
public class ActualPackageInfo {

    @XmlElement(name = "ActualPackageType", required = true)
    protected String actualPackageType;
    @XmlElement(name = "ActualWeight", defaultValue = "0.0")
    protected BigDecimal actualWeight;
    @XmlElement(name = "ActualLength", defaultValue = "0.0")
    protected BigDecimal actualLength;
    @XmlElement(name = "ActualWidth", defaultValue = "0.0")
    protected BigDecimal actualWidth;
    @XmlElement(name = "ActualHeight", defaultValue = "0.0")
    protected BigDecimal actualHeight;

    /**
     * Gets the value of the actualPackageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualPackageType() {
        return actualPackageType;
    }

    /**
     * Sets the value of the actualPackageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualPackageType(String value) {
        this.actualPackageType = value;
    }

    /**
     * Gets the value of the actualWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualWeight() {
        return actualWeight;
    }

    /**
     * Sets the value of the actualWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualWeight(BigDecimal value) {
        this.actualWeight = value;
    }

    /**
     * Gets the value of the actualLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualLength() {
        return actualLength;
    }

    /**
     * Sets the value of the actualLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualLength(BigDecimal value) {
        this.actualLength = value;
    }

    /**
     * Gets the value of the actualWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualWidth() {
        return actualWidth;
    }

    /**
     * Sets the value of the actualWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualWidth(BigDecimal value) {
        this.actualWidth = value;
    }

    /**
     * Gets the value of the actualHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualHeight() {
        return actualHeight;
    }

    /**
     * Sets the value of the actualHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualHeight(BigDecimal value) {
        this.actualHeight = value;
    }

}
