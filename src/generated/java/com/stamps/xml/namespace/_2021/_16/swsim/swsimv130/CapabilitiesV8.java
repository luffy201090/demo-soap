
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV8"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV7"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowUspsMPosLabel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DisableConversationToken" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintCubic" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV8", propOrder = {
    "allowUspsMPosLabel",
    "disableConversationToken",
    "canPrintCubic"
})
@XmlSeeAlso({
    CapabilitiesV9 .class
})
public class CapabilitiesV8
    extends CapabilitiesV7
{

    @XmlElement(name = "AllowUspsMPosLabel")
    protected boolean allowUspsMPosLabel;
    @XmlElement(name = "DisableConversationToken")
    protected boolean disableConversationToken;
    @XmlElement(name = "CanPrintCubic")
    protected boolean canPrintCubic;

    /**
     * Gets the value of the allowUspsMPosLabel property.
     * 
     */
    public boolean isAllowUspsMPosLabel() {
        return allowUspsMPosLabel;
    }

    /**
     * Sets the value of the allowUspsMPosLabel property.
     * 
     */
    public void setAllowUspsMPosLabel(boolean value) {
        this.allowUspsMPosLabel = value;
    }

    /**
     * Gets the value of the disableConversationToken property.
     * 
     */
    public boolean isDisableConversationToken() {
        return disableConversationToken;
    }

    /**
     * Sets the value of the disableConversationToken property.
     * 
     */
    public void setDisableConversationToken(boolean value) {
        this.disableConversationToken = value;
    }

    /**
     * Gets the value of the canPrintCubic property.
     * 
     */
    public boolean isCanPrintCubic() {
        return canPrintCubic;
    }

    /**
     * Sets the value of the canPrintCubic property.
     * 
     */
    public void setCanPrintCubic(boolean value) {
        this.canPrintCubic = value;
    }

}
