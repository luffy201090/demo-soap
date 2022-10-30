
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV32 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV32"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV31"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayFXByDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CanPrintFXDirect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CanPrintFXIntl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayDXByDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV32", propOrder = {
    "displayFXByDefault",
    "canPrintFXDirect",
    "canPrintFXIntl",
    "displayDXByDefault"
})
@XmlSeeAlso({
    CapabilitiesV33 .class
})
public class CapabilitiesV32
    extends CapabilitiesV31
{

    @XmlElementRef(name = "DisplayFXByDefault", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> displayFXByDefault;
    @XmlElementRef(name = "CanPrintFXDirect", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> canPrintFXDirect;
    @XmlElementRef(name = "CanPrintFXIntl", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> canPrintFXIntl;
    @XmlElementRef(name = "DisplayDXByDefault", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> displayDXByDefault;

    /**
     * Gets the value of the displayFXByDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDisplayFXByDefault() {
        return displayFXByDefault;
    }

    /**
     * Sets the value of the displayFXByDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDisplayFXByDefault(JAXBElement<Boolean> value) {
        this.displayFXByDefault = value;
    }

    /**
     * Gets the value of the canPrintFXDirect property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCanPrintFXDirect() {
        return canPrintFXDirect;
    }

    /**
     * Sets the value of the canPrintFXDirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCanPrintFXDirect(JAXBElement<Boolean> value) {
        this.canPrintFXDirect = value;
    }

    /**
     * Gets the value of the canPrintFXIntl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCanPrintFXIntl() {
        return canPrintFXIntl;
    }

    /**
     * Sets the value of the canPrintFXIntl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCanPrintFXIntl(JAXBElement<Boolean> value) {
        this.canPrintFXIntl = value;
    }

    /**
     * Gets the value of the displayDXByDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDisplayDXByDefault() {
        return displayDXByDefault;
    }

    /**
     * Sets the value of the displayDXByDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDisplayDXByDefault(JAXBElement<Boolean> value) {
        this.displayDXByDefault = value;
    }

}
