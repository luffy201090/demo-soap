
package com.stamps.xml.namespace._2014._3.addressservicev2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AMSAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMSAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2014/3/addressservicev2}Address"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HasPrefixRange" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PrefixRangeType" type="{http://stamps.com/xml/namespace/2014/3/addressservicev2}RangeType" minOccurs="0"/&gt;
 *         &lt;element name="PrefixRangeStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrefixRangeEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HasSuffixRange" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SuffixRangeType" type="{http://stamps.com/xml/namespace/2014/3/addressservicev2}RangeType" minOccurs="0"/&gt;
 *         &lt;element name="SuffixRangeStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SuffixRangeEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rank" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WasDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Displayable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMSAddress", propOrder = {
    "hasPrefixRange",
    "prefixRangeType",
    "prefixRangeStart",
    "prefixRangeEnd",
    "hasSuffixRange",
    "suffixRangeType",
    "suffixRangeStart",
    "suffixRangeEnd",
    "rank",
    "wasDefault",
    "displayable",
    "expirationDate"
})
public class AMSAddress
    extends Address
{

    @XmlElement(name = "HasPrefixRange")
    protected boolean hasPrefixRange;
    @XmlElement(name = "PrefixRangeType", defaultValue = "All")
    @XmlSchemaType(name = "string")
    protected RangeType prefixRangeType;
    @XmlElement(name = "PrefixRangeStart")
    protected String prefixRangeStart;
    @XmlElement(name = "PrefixRangeEnd")
    protected String prefixRangeEnd;
    @XmlElement(name = "HasSuffixRange")
    protected boolean hasSuffixRange;
    @XmlElement(name = "SuffixRangeType", defaultValue = "All")
    @XmlSchemaType(name = "string")
    protected RangeType suffixRangeType;
    @XmlElement(name = "SuffixRangeStart")
    protected String suffixRangeStart;
    @XmlElement(name = "SuffixRangeEnd")
    protected String suffixRangeEnd;
    @XmlElement(name = "Rank")
    protected int rank;
    @XmlElement(name = "WasDefault")
    protected boolean wasDefault;
    @XmlElement(name = "Displayable")
    protected boolean displayable;
    @XmlElement(name = "ExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;

    /**
     * Gets the value of the hasPrefixRange property.
     * 
     */
    public boolean isHasPrefixRange() {
        return hasPrefixRange;
    }

    /**
     * Sets the value of the hasPrefixRange property.
     * 
     */
    public void setHasPrefixRange(boolean value) {
        this.hasPrefixRange = value;
    }

    /**
     * Gets the value of the prefixRangeType property.
     * 
     * @return
     *     possible object is
     *     {@link RangeType }
     *     
     */
    public RangeType getPrefixRangeType() {
        return prefixRangeType;
    }

    /**
     * Sets the value of the prefixRangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeType }
     *     
     */
    public void setPrefixRangeType(RangeType value) {
        this.prefixRangeType = value;
    }

    /**
     * Gets the value of the prefixRangeStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixRangeStart() {
        return prefixRangeStart;
    }

    /**
     * Sets the value of the prefixRangeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixRangeStart(String value) {
        this.prefixRangeStart = value;
    }

    /**
     * Gets the value of the prefixRangeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixRangeEnd() {
        return prefixRangeEnd;
    }

    /**
     * Sets the value of the prefixRangeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixRangeEnd(String value) {
        this.prefixRangeEnd = value;
    }

    /**
     * Gets the value of the hasSuffixRange property.
     * 
     */
    public boolean isHasSuffixRange() {
        return hasSuffixRange;
    }

    /**
     * Sets the value of the hasSuffixRange property.
     * 
     */
    public void setHasSuffixRange(boolean value) {
        this.hasSuffixRange = value;
    }

    /**
     * Gets the value of the suffixRangeType property.
     * 
     * @return
     *     possible object is
     *     {@link RangeType }
     *     
     */
    public RangeType getSuffixRangeType() {
        return suffixRangeType;
    }

    /**
     * Sets the value of the suffixRangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeType }
     *     
     */
    public void setSuffixRangeType(RangeType value) {
        this.suffixRangeType = value;
    }

    /**
     * Gets the value of the suffixRangeStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffixRangeStart() {
        return suffixRangeStart;
    }

    /**
     * Sets the value of the suffixRangeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffixRangeStart(String value) {
        this.suffixRangeStart = value;
    }

    /**
     * Gets the value of the suffixRangeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffixRangeEnd() {
        return suffixRangeEnd;
    }

    /**
     * Sets the value of the suffixRangeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffixRangeEnd(String value) {
        this.suffixRangeEnd = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     */
    public int getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     */
    public void setRank(int value) {
        this.rank = value;
    }

    /**
     * Gets the value of the wasDefault property.
     * 
     */
    public boolean isWasDefault() {
        return wasDefault;
    }

    /**
     * Sets the value of the wasDefault property.
     * 
     */
    public void setWasDefault(boolean value) {
        this.wasDefault = value;
    }

    /**
     * Gets the value of the displayable property.
     * 
     */
    public boolean isDisplayable() {
        return displayable;
    }

    /**
     * Sets the value of the displayable property.
     * 
     */
    public void setDisplayable(boolean value) {
        this.displayable = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

}
