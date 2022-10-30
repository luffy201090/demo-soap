
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetStampsLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetStampsLayout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SerialNumberPattern" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumRows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumColumns" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BackgroundImageURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BackgroundImageWidthPx" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BackgroundImageHeightPx" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EmptyNetStampImageURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UsedNetStampImageURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrintedNetStampImageURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NetStampImageWidthPx" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NetStampImageHeightPx" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Row1StartsAtPx" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Column1StartsAtPx" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HorizontalSpaceBetweenNetStampsPx" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="VerticalSpaceBetweenNetStampsPx" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetStampsLayout", propOrder = {
    "name",
    "description",
    "serialNumberPattern",
    "numRows",
    "numColumns",
    "backgroundImageURL",
    "backgroundImageWidthPx",
    "backgroundImageHeightPx",
    "emptyNetStampImageURL",
    "usedNetStampImageURL",
    "printedNetStampImageURL",
    "netStampImageWidthPx",
    "netStampImageHeightPx",
    "row1StartsAtPx",
    "column1StartsAtPx",
    "horizontalSpaceBetweenNetStampsPx",
    "verticalSpaceBetweenNetStampsPx"
})
public class NetStampsLayout {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "SerialNumberPattern", required = true)
    protected String serialNumberPattern;
    @XmlElement(name = "NumRows")
    protected int numRows;
    @XmlElement(name = "NumColumns")
    protected int numColumns;
    @XmlElement(name = "BackgroundImageURL", required = true)
    protected String backgroundImageURL;
    @XmlElement(name = "BackgroundImageWidthPx")
    protected int backgroundImageWidthPx;
    @XmlElement(name = "BackgroundImageHeightPx")
    protected int backgroundImageHeightPx;
    @XmlElement(name = "EmptyNetStampImageURL", required = true)
    protected String emptyNetStampImageURL;
    @XmlElement(name = "UsedNetStampImageURL", required = true)
    protected String usedNetStampImageURL;
    @XmlElement(name = "PrintedNetStampImageURL", required = true)
    protected String printedNetStampImageURL;
    @XmlElement(name = "NetStampImageWidthPx")
    protected int netStampImageWidthPx;
    @XmlElement(name = "NetStampImageHeightPx")
    protected int netStampImageHeightPx;
    @XmlElement(name = "Row1StartsAtPx")
    protected int row1StartsAtPx;
    @XmlElement(name = "Column1StartsAtPx")
    protected int column1StartsAtPx;
    @XmlElement(name = "HorizontalSpaceBetweenNetStampsPx")
    protected int horizontalSpaceBetweenNetStampsPx;
    @XmlElement(name = "VerticalSpaceBetweenNetStampsPx")
    protected int verticalSpaceBetweenNetStampsPx;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the serialNumberPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumberPattern() {
        return serialNumberPattern;
    }

    /**
     * Sets the value of the serialNumberPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumberPattern(String value) {
        this.serialNumberPattern = value;
    }

    /**
     * Gets the value of the numRows property.
     * 
     */
    public int getNumRows() {
        return numRows;
    }

    /**
     * Sets the value of the numRows property.
     * 
     */
    public void setNumRows(int value) {
        this.numRows = value;
    }

    /**
     * Gets the value of the numColumns property.
     * 
     */
    public int getNumColumns() {
        return numColumns;
    }

    /**
     * Sets the value of the numColumns property.
     * 
     */
    public void setNumColumns(int value) {
        this.numColumns = value;
    }

    /**
     * Gets the value of the backgroundImageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundImageURL() {
        return backgroundImageURL;
    }

    /**
     * Sets the value of the backgroundImageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundImageURL(String value) {
        this.backgroundImageURL = value;
    }

    /**
     * Gets the value of the backgroundImageWidthPx property.
     * 
     */
    public int getBackgroundImageWidthPx() {
        return backgroundImageWidthPx;
    }

    /**
     * Sets the value of the backgroundImageWidthPx property.
     * 
     */
    public void setBackgroundImageWidthPx(int value) {
        this.backgroundImageWidthPx = value;
    }

    /**
     * Gets the value of the backgroundImageHeightPx property.
     * 
     */
    public int getBackgroundImageHeightPx() {
        return backgroundImageHeightPx;
    }

    /**
     * Sets the value of the backgroundImageHeightPx property.
     * 
     */
    public void setBackgroundImageHeightPx(int value) {
        this.backgroundImageHeightPx = value;
    }

    /**
     * Gets the value of the emptyNetStampImageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmptyNetStampImageURL() {
        return emptyNetStampImageURL;
    }

    /**
     * Sets the value of the emptyNetStampImageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmptyNetStampImageURL(String value) {
        this.emptyNetStampImageURL = value;
    }

    /**
     * Gets the value of the usedNetStampImageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedNetStampImageURL() {
        return usedNetStampImageURL;
    }

    /**
     * Sets the value of the usedNetStampImageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedNetStampImageURL(String value) {
        this.usedNetStampImageURL = value;
    }

    /**
     * Gets the value of the printedNetStampImageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintedNetStampImageURL() {
        return printedNetStampImageURL;
    }

    /**
     * Sets the value of the printedNetStampImageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintedNetStampImageURL(String value) {
        this.printedNetStampImageURL = value;
    }

    /**
     * Gets the value of the netStampImageWidthPx property.
     * 
     */
    public int getNetStampImageWidthPx() {
        return netStampImageWidthPx;
    }

    /**
     * Sets the value of the netStampImageWidthPx property.
     * 
     */
    public void setNetStampImageWidthPx(int value) {
        this.netStampImageWidthPx = value;
    }

    /**
     * Gets the value of the netStampImageHeightPx property.
     * 
     */
    public int getNetStampImageHeightPx() {
        return netStampImageHeightPx;
    }

    /**
     * Sets the value of the netStampImageHeightPx property.
     * 
     */
    public void setNetStampImageHeightPx(int value) {
        this.netStampImageHeightPx = value;
    }

    /**
     * Gets the value of the row1StartsAtPx property.
     * 
     */
    public int getRow1StartsAtPx() {
        return row1StartsAtPx;
    }

    /**
     * Sets the value of the row1StartsAtPx property.
     * 
     */
    public void setRow1StartsAtPx(int value) {
        this.row1StartsAtPx = value;
    }

    /**
     * Gets the value of the column1StartsAtPx property.
     * 
     */
    public int getColumn1StartsAtPx() {
        return column1StartsAtPx;
    }

    /**
     * Sets the value of the column1StartsAtPx property.
     * 
     */
    public void setColumn1StartsAtPx(int value) {
        this.column1StartsAtPx = value;
    }

    /**
     * Gets the value of the horizontalSpaceBetweenNetStampsPx property.
     * 
     */
    public int getHorizontalSpaceBetweenNetStampsPx() {
        return horizontalSpaceBetweenNetStampsPx;
    }

    /**
     * Sets the value of the horizontalSpaceBetweenNetStampsPx property.
     * 
     */
    public void setHorizontalSpaceBetweenNetStampsPx(int value) {
        this.horizontalSpaceBetweenNetStampsPx = value;
    }

    /**
     * Gets the value of the verticalSpaceBetweenNetStampsPx property.
     * 
     */
    public int getVerticalSpaceBetweenNetStampsPx() {
        return verticalSpaceBetweenNetStampsPx;
    }

    /**
     * Sets the value of the verticalSpaceBetweenNetStampsPx property.
     * 
     */
    public void setVerticalSpaceBetweenNetStampsPx(int value) {
        this.verticalSpaceBetweenNetStampsPx = value;
    }

}
