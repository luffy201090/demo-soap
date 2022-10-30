
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="OrderNumber" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-50"/&gt;
 *         &lt;element name="ShippingAndHandlingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OrderItems" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfOrderItem" minOccurs="0"/&gt;
 *         &lt;element name="OrderCurrency" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDetails", propOrder = {
    "orderDate",
    "orderNumber",
    "shippingAndHandlingPrice",
    "totalDiscountAmount",
    "totalTaxAmount",
    "orderItems",
    "orderCurrency"
})
public class OrderDetails {

    @XmlElement(name = "OrderDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "OrderNumber", required = true)
    protected String orderNumber;
    @XmlElementRef(name = "ShippingAndHandlingPrice", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> shippingAndHandlingPrice;
    @XmlElementRef(name = "TotalDiscountAmount", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalDiscountAmount;
    @XmlElementRef(name = "TotalTaxAmount", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalTaxAmount;
    @XmlElement(name = "OrderItems")
    protected ArrayOfOrderItem orderItems;
    @XmlElement(name = "OrderCurrency")
    protected String orderCurrency;

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the shippingAndHandlingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getShippingAndHandlingPrice() {
        return shippingAndHandlingPrice;
    }

    /**
     * Sets the value of the shippingAndHandlingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setShippingAndHandlingPrice(JAXBElement<BigDecimal> value) {
        this.shippingAndHandlingPrice = value;
    }

    /**
     * Gets the value of the totalDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalDiscountAmount() {
        return totalDiscountAmount;
    }

    /**
     * Sets the value of the totalDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalDiscountAmount(JAXBElement<BigDecimal> value) {
        this.totalDiscountAmount = value;
    }

    /**
     * Gets the value of the totalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Sets the value of the totalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalTaxAmount(JAXBElement<BigDecimal> value) {
        this.totalTaxAmount = value;
    }

    /**
     * Gets the value of the orderItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderItem }
     *     
     */
    public ArrayOfOrderItem getOrderItems() {
        return orderItems;
    }

    /**
     * Sets the value of the orderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderItem }
     *     
     */
    public void setOrderItems(ArrayOfOrderItem value) {
        this.orderItems = value;
    }

    /**
     * Gets the value of the orderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCurrency() {
        return orderCurrency;
    }

    /**
     * Sets the value of the orderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCurrency(String value) {
        this.orderCurrency = value;
    }

}
