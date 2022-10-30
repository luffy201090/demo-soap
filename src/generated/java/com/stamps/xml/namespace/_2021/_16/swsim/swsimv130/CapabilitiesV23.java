
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV23 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV23"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV22"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BlockSLAFromServiceBanner" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintMailingLabel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsManualManifesting" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AllowNineDigitBarCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV23", propOrder = {
    "blockSLAFromServiceBanner",
    "canPrintMailingLabel",
    "isManualManifesting",
    "allowNineDigitBarCode"
})
@XmlSeeAlso({
    CapabilitiesV24 .class
})
public class CapabilitiesV23
    extends CapabilitiesV22
{

    @XmlElement(name = "BlockSLAFromServiceBanner")
    protected boolean blockSLAFromServiceBanner;
    @XmlElement(name = "CanPrintMailingLabel")
    protected boolean canPrintMailingLabel;
    @XmlElement(name = "IsManualManifesting")
    protected boolean isManualManifesting;
    @XmlElement(name = "AllowNineDigitBarCode")
    protected boolean allowNineDigitBarCode;

    /**
     * Gets the value of the blockSLAFromServiceBanner property.
     * 
     */
    public boolean isBlockSLAFromServiceBanner() {
        return blockSLAFromServiceBanner;
    }

    /**
     * Sets the value of the blockSLAFromServiceBanner property.
     * 
     */
    public void setBlockSLAFromServiceBanner(boolean value) {
        this.blockSLAFromServiceBanner = value;
    }

    /**
     * Gets the value of the canPrintMailingLabel property.
     * 
     */
    public boolean isCanPrintMailingLabel() {
        return canPrintMailingLabel;
    }

    /**
     * Sets the value of the canPrintMailingLabel property.
     * 
     */
    public void setCanPrintMailingLabel(boolean value) {
        this.canPrintMailingLabel = value;
    }

    /**
     * Gets the value of the isManualManifesting property.
     * 
     */
    public boolean isIsManualManifesting() {
        return isManualManifesting;
    }

    /**
     * Sets the value of the isManualManifesting property.
     * 
     */
    public void setIsManualManifesting(boolean value) {
        this.isManualManifesting = value;
    }

    /**
     * Gets the value of the allowNineDigitBarCode property.
     * 
     */
    public boolean isAllowNineDigitBarCode() {
        return allowNineDigitBarCode;
    }

    /**
     * Sets the value of the allowNineDigitBarCode property.
     * 
     */
    public void setAllowNineDigitBarCode(boolean value) {
        this.allowNineDigitBarCode = value;
    }

}
