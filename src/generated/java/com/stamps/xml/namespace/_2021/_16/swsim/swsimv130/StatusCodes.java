
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusCodes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Footnotes" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfFootnote" minOccurs="0"/&gt;
 *         &lt;element name="DpvFootnotes" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfDpvFootnote" minOccurs="0"/&gt;
 *         &lt;element name="SdcFootnotes" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusCodes", propOrder = {
    "returnCode",
    "footnotes",
    "dpvFootnotes",
    "sdcFootnotes"
})
public class StatusCodes {

    @XmlElement(name = "ReturnCode")
    protected int returnCode;
    @XmlElement(name = "Footnotes")
    protected ArrayOfFootnote footnotes;
    @XmlElement(name = "DpvFootnotes")
    protected ArrayOfDpvFootnote dpvFootnotes;
    @XmlElement(name = "SdcFootnotes")
    protected ArrayOfInt sdcFootnotes;

    /**
     * Gets the value of the returnCode property.
     * 
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     */
    public void setReturnCode(int value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the footnotes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFootnote }
     *     
     */
    public ArrayOfFootnote getFootnotes() {
        return footnotes;
    }

    /**
     * Sets the value of the footnotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFootnote }
     *     
     */
    public void setFootnotes(ArrayOfFootnote value) {
        this.footnotes = value;
    }

    /**
     * Gets the value of the dpvFootnotes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDpvFootnote }
     *     
     */
    public ArrayOfDpvFootnote getDpvFootnotes() {
        return dpvFootnotes;
    }

    /**
     * Sets the value of the dpvFootnotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDpvFootnote }
     *     
     */
    public void setDpvFootnotes(ArrayOfDpvFootnote value) {
        this.dpvFootnotes = value;
    }

    /**
     * Gets the value of the sdcFootnotes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getSdcFootnotes() {
        return sdcFootnotes;
    }

    /**
     * Sets the value of the sdcFootnotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setSdcFootnotes(ArrayOfInt value) {
        this.sdcFootnotes = value;
    }

}
