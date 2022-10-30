
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV18 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV18"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV17"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintFCPresort" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintPSPresort" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintIntlPresortSinglePiece" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanConvertToFCIPresort" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanConvertToPMIPresort" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanConvertToPMEIPresort" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanConvertToFCPresort" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanConvertToPSPresort" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanConvertToIntlPresortSinglePiece" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV18", propOrder = {
    "canPrintFCPresort",
    "canPrintPSPresort",
    "canPrintIntlPresortSinglePiece",
    "canConvertToFCIPresort",
    "canConvertToPMIPresort",
    "canConvertToPMEIPresort",
    "canConvertToFCPresort",
    "canConvertToPSPresort",
    "canConvertToIntlPresortSinglePiece"
})
@XmlSeeAlso({
    CapabilitiesV19 .class
})
public class CapabilitiesV18
    extends CapabilitiesV17
{

    @XmlElement(name = "CanPrintFCPresort")
    protected boolean canPrintFCPresort;
    @XmlElement(name = "CanPrintPSPresort")
    protected boolean canPrintPSPresort;
    @XmlElement(name = "CanPrintIntlPresortSinglePiece")
    protected boolean canPrintIntlPresortSinglePiece;
    @XmlElement(name = "CanConvertToFCIPresort")
    protected boolean canConvertToFCIPresort;
    @XmlElement(name = "CanConvertToPMIPresort")
    protected boolean canConvertToPMIPresort;
    @XmlElement(name = "CanConvertToPMEIPresort")
    protected boolean canConvertToPMEIPresort;
    @XmlElement(name = "CanConvertToFCPresort")
    protected boolean canConvertToFCPresort;
    @XmlElement(name = "CanConvertToPSPresort")
    protected boolean canConvertToPSPresort;
    @XmlElement(name = "CanConvertToIntlPresortSinglePiece")
    protected boolean canConvertToIntlPresortSinglePiece;

    /**
     * Gets the value of the canPrintFCPresort property.
     * 
     */
    public boolean isCanPrintFCPresort() {
        return canPrintFCPresort;
    }

    /**
     * Sets the value of the canPrintFCPresort property.
     * 
     */
    public void setCanPrintFCPresort(boolean value) {
        this.canPrintFCPresort = value;
    }

    /**
     * Gets the value of the canPrintPSPresort property.
     * 
     */
    public boolean isCanPrintPSPresort() {
        return canPrintPSPresort;
    }

    /**
     * Sets the value of the canPrintPSPresort property.
     * 
     */
    public void setCanPrintPSPresort(boolean value) {
        this.canPrintPSPresort = value;
    }

    /**
     * Gets the value of the canPrintIntlPresortSinglePiece property.
     * 
     */
    public boolean isCanPrintIntlPresortSinglePiece() {
        return canPrintIntlPresortSinglePiece;
    }

    /**
     * Sets the value of the canPrintIntlPresortSinglePiece property.
     * 
     */
    public void setCanPrintIntlPresortSinglePiece(boolean value) {
        this.canPrintIntlPresortSinglePiece = value;
    }

    /**
     * Gets the value of the canConvertToFCIPresort property.
     * 
     */
    public boolean isCanConvertToFCIPresort() {
        return canConvertToFCIPresort;
    }

    /**
     * Sets the value of the canConvertToFCIPresort property.
     * 
     */
    public void setCanConvertToFCIPresort(boolean value) {
        this.canConvertToFCIPresort = value;
    }

    /**
     * Gets the value of the canConvertToPMIPresort property.
     * 
     */
    public boolean isCanConvertToPMIPresort() {
        return canConvertToPMIPresort;
    }

    /**
     * Sets the value of the canConvertToPMIPresort property.
     * 
     */
    public void setCanConvertToPMIPresort(boolean value) {
        this.canConvertToPMIPresort = value;
    }

    /**
     * Gets the value of the canConvertToPMEIPresort property.
     * 
     */
    public boolean isCanConvertToPMEIPresort() {
        return canConvertToPMEIPresort;
    }

    /**
     * Sets the value of the canConvertToPMEIPresort property.
     * 
     */
    public void setCanConvertToPMEIPresort(boolean value) {
        this.canConvertToPMEIPresort = value;
    }

    /**
     * Gets the value of the canConvertToFCPresort property.
     * 
     */
    public boolean isCanConvertToFCPresort() {
        return canConvertToFCPresort;
    }

    /**
     * Sets the value of the canConvertToFCPresort property.
     * 
     */
    public void setCanConvertToFCPresort(boolean value) {
        this.canConvertToFCPresort = value;
    }

    /**
     * Gets the value of the canConvertToPSPresort property.
     * 
     */
    public boolean isCanConvertToPSPresort() {
        return canConvertToPSPresort;
    }

    /**
     * Sets the value of the canConvertToPSPresort property.
     * 
     */
    public void setCanConvertToPSPresort(boolean value) {
        this.canConvertToPSPresort = value;
    }

    /**
     * Gets the value of the canConvertToIntlPresortSinglePiece property.
     * 
     */
    public boolean isCanConvertToIntlPresortSinglePiece() {
        return canConvertToIntlPresortSinglePiece;
    }

    /**
     * Sets the value of the canConvertToIntlPresortSinglePiece property.
     * 
     */
    public void setCanConvertToIntlPresortSinglePiece(boolean value) {
        this.canConvertToIntlPresortSinglePiece = value;
    }

}
