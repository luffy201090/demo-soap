
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV31 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV31"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV30"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanRateShop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayUPSByDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CanPrintUPSDirect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CanPrintUPSIntl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV31", propOrder = {
    "canRateShop",
    "displayUPSByDefault",
    "canPrintUPSDirect",
    "canPrintUPSIntl"
})
@XmlSeeAlso({
    CapabilitiesV32 .class
})
public class CapabilitiesV31
    extends CapabilitiesV30
{

    @XmlElementRef(name = "CanRateShop", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> canRateShop;
    @XmlElementRef(name = "DisplayUPSByDefault", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> displayUPSByDefault;
    @XmlElementRef(name = "CanPrintUPSDirect", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> canPrintUPSDirect;
    @XmlElementRef(name = "CanPrintUPSIntl", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> canPrintUPSIntl;

    /**
     * Gets the value of the canRateShop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCanRateShop() {
        return canRateShop;
    }

    /**
     * Sets the value of the canRateShop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCanRateShop(JAXBElement<Boolean> value) {
        this.canRateShop = value;
    }

    /**
     * Gets the value of the displayUPSByDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDisplayUPSByDefault() {
        return displayUPSByDefault;
    }

    /**
     * Sets the value of the displayUPSByDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDisplayUPSByDefault(JAXBElement<Boolean> value) {
        this.displayUPSByDefault = value;
    }

    /**
     * Gets the value of the canPrintUPSDirect property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCanPrintUPSDirect() {
        return canPrintUPSDirect;
    }

    /**
     * Sets the value of the canPrintUPSDirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCanPrintUPSDirect(JAXBElement<Boolean> value) {
        this.canPrintUPSDirect = value;
    }

    /**
     * Gets the value of the canPrintUPSIntl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCanPrintUPSIntl() {
        return canPrintUPSIntl;
    }

    /**
     * Sets the value of the canPrintUPSIntl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCanPrintUPSIntl(JAXBElement<Boolean> value) {
        this.canPrintUPSIntl = value;
    }

}
