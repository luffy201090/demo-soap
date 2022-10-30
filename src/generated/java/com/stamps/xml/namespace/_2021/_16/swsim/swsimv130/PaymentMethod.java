
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefaultPayment" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfDefaultPaymentMethodTypeOptions" minOccurs="0"/&gt;
 *         &lt;element name="BillingMethod" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}BillingMethod" minOccurs="0"/&gt;
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CreditCardType" minOccurs="0"/&gt;
 *         &lt;element name="Last4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethodId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMethod", propOrder = {
    "defaultPayment",
    "billingMethod",
    "bankName",
    "creditCardType",
    "last4",
    "paymentMethodId"
})
public class PaymentMethod {

    @XmlElement(name = "DefaultPayment")
    protected ArrayOfDefaultPaymentMethodTypeOptions defaultPayment;
    @XmlElement(name = "BillingMethod")
    @XmlSchemaType(name = "string")
    protected BillingMethod billingMethod;
    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElementRef(name = "CreditCardType", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditCardType> creditCardType;
    @XmlElement(name = "Last4")
    protected String last4;
    @XmlElement(name = "PaymentMethodId")
    protected String paymentMethodId;

    /**
     * Gets the value of the defaultPayment property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDefaultPaymentMethodTypeOptions }
     *     
     */
    public ArrayOfDefaultPaymentMethodTypeOptions getDefaultPayment() {
        return defaultPayment;
    }

    /**
     * Sets the value of the defaultPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDefaultPaymentMethodTypeOptions }
     *     
     */
    public void setDefaultPayment(ArrayOfDefaultPaymentMethodTypeOptions value) {
        this.defaultPayment = value;
    }

    /**
     * Gets the value of the billingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link BillingMethod }
     *     
     */
    public BillingMethod getBillingMethod() {
        return billingMethod;
    }

    /**
     * Sets the value of the billingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingMethod }
     *     
     */
    public void setBillingMethod(BillingMethod value) {
        this.billingMethod = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditCardType }{@code >}
     *     
     */
    public JAXBElement<CreditCardType> getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditCardType }{@code >}
     *     
     */
    public void setCreditCardType(JAXBElement<CreditCardType> value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the last4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLast4() {
        return last4;
    }

    /**
     * Sets the value of the last4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLast4(String value) {
        this.last4 = value;
    }

    /**
     * Gets the value of the paymentMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    /**
     * Sets the value of the paymentMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodId(String value) {
        this.paymentMethodId = value;
    }

}
