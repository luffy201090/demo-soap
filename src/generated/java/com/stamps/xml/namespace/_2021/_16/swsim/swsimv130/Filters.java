
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Filters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Filters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrintDateMin" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="PrintDateMax" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SearchCriteria" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfSearchFor" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Filters", propOrder = {
    "printDateMin",
    "printDateMax",
    "searchCriteria"
})
public class Filters {

    @XmlElement(name = "PrintDateMin", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar printDateMin;
    @XmlElementRef(name = "PrintDateMax", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> printDateMax;
    @XmlElement(name = "SearchCriteria")
    protected ArrayOfSearchFor searchCriteria;

    /**
     * Gets the value of the printDateMin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrintDateMin() {
        return printDateMin;
    }

    /**
     * Sets the value of the printDateMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrintDateMin(XMLGregorianCalendar value) {
        this.printDateMin = value;
    }

    /**
     * Gets the value of the printDateMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPrintDateMax() {
        return printDateMax;
    }

    /**
     * Sets the value of the printDateMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPrintDateMax(JAXBElement<XMLGregorianCalendar> value) {
        this.printDateMax = value;
    }

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchFor }
     *     
     */
    public ArrayOfSearchFor getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchFor }
     *     
     */
    public void setSearchCriteria(ArrayOfSearchFor value) {
        this.searchCriteria = value;
    }

}
