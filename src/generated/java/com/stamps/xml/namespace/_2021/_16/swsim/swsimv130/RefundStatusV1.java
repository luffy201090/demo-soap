
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
 * <p>Java class for RefundStatusV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundStatusV1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PostageRefundId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ClaimNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PostageRefundStatus" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PostageRefundStatusV1"/&gt;
 *         &lt;element name="EstimatedPostageRefundCompletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PostageAmountRequested" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PostageAmountApproved" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PostageRefundResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceRefundStatus" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PostageRefundStatusV1" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedInsuranceRefundCompletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceAmountRequested" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceAmountApproved" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundStatusV1", propOrder = {
    "postageRefundId",
    "claimNumber",
    "requestDate",
    "postageRefundStatus",
    "estimatedPostageRefundCompletionDate",
    "postageAmountRequested",
    "postageAmountApproved",
    "postageRefundResult",
    "insuranceRefundStatus",
    "estimatedInsuranceRefundCompletionDate",
    "insuranceAmountRequested",
    "insuranceAmountApproved"
})
public class RefundStatusV1 {

    @XmlElement(name = "PostageRefundId", required = true)
    protected String postageRefundId;
    @XmlElement(name = "ClaimNumber", required = true, type = Integer.class, nillable = true)
    protected Integer claimNumber;
    @XmlElement(name = "RequestDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;
    @XmlElement(name = "PostageRefundStatus", required = true)
    @XmlSchemaType(name = "string")
    protected PostageRefundStatusV1 postageRefundStatus;
    @XmlElementRef(name = "EstimatedPostageRefundCompletionDate", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> estimatedPostageRefundCompletionDate;
    @XmlElement(name = "PostageAmountRequested", required = true)
    protected BigDecimal postageAmountRequested;
    @XmlElement(name = "PostageAmountApproved", required = true)
    protected BigDecimal postageAmountApproved;
    @XmlElement(name = "PostageRefundResult")
    protected String postageRefundResult;
    @XmlElementRef(name = "InsuranceRefundStatus", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<PostageRefundStatusV1> insuranceRefundStatus;
    @XmlElementRef(name = "EstimatedInsuranceRefundCompletionDate", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> estimatedInsuranceRefundCompletionDate;
    @XmlElementRef(name = "InsuranceAmountRequested", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> insuranceAmountRequested;
    @XmlElementRef(name = "InsuranceAmountApproved", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> insuranceAmountApproved;

    /**
     * Gets the value of the postageRefundId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostageRefundId() {
        return postageRefundId;
    }

    /**
     * Sets the value of the postageRefundId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostageRefundId(String value) {
        this.postageRefundId = value;
    }

    /**
     * Gets the value of the claimNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClaimNumber() {
        return claimNumber;
    }

    /**
     * Sets the value of the claimNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClaimNumber(Integer value) {
        this.claimNumber = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the postageRefundStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PostageRefundStatusV1 }
     *     
     */
    public PostageRefundStatusV1 getPostageRefundStatus() {
        return postageRefundStatus;
    }

    /**
     * Sets the value of the postageRefundStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostageRefundStatusV1 }
     *     
     */
    public void setPostageRefundStatus(PostageRefundStatusV1 value) {
        this.postageRefundStatus = value;
    }

    /**
     * Gets the value of the estimatedPostageRefundCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEstimatedPostageRefundCompletionDate() {
        return estimatedPostageRefundCompletionDate;
    }

    /**
     * Sets the value of the estimatedPostageRefundCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEstimatedPostageRefundCompletionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.estimatedPostageRefundCompletionDate = value;
    }

    /**
     * Gets the value of the postageAmountRequested property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPostageAmountRequested() {
        return postageAmountRequested;
    }

    /**
     * Sets the value of the postageAmountRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPostageAmountRequested(BigDecimal value) {
        this.postageAmountRequested = value;
    }

    /**
     * Gets the value of the postageAmountApproved property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPostageAmountApproved() {
        return postageAmountApproved;
    }

    /**
     * Sets the value of the postageAmountApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPostageAmountApproved(BigDecimal value) {
        this.postageAmountApproved = value;
    }

    /**
     * Gets the value of the postageRefundResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostageRefundResult() {
        return postageRefundResult;
    }

    /**
     * Sets the value of the postageRefundResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostageRefundResult(String value) {
        this.postageRefundResult = value;
    }

    /**
     * Gets the value of the insuranceRefundStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostageRefundStatusV1 }{@code >}
     *     
     */
    public JAXBElement<PostageRefundStatusV1> getInsuranceRefundStatus() {
        return insuranceRefundStatus;
    }

    /**
     * Sets the value of the insuranceRefundStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostageRefundStatusV1 }{@code >}
     *     
     */
    public void setInsuranceRefundStatus(JAXBElement<PostageRefundStatusV1> value) {
        this.insuranceRefundStatus = value;
    }

    /**
     * Gets the value of the estimatedInsuranceRefundCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEstimatedInsuranceRefundCompletionDate() {
        return estimatedInsuranceRefundCompletionDate;
    }

    /**
     * Sets the value of the estimatedInsuranceRefundCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEstimatedInsuranceRefundCompletionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.estimatedInsuranceRefundCompletionDate = value;
    }

    /**
     * Gets the value of the insuranceAmountRequested property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInsuranceAmountRequested() {
        return insuranceAmountRequested;
    }

    /**
     * Sets the value of the insuranceAmountRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInsuranceAmountRequested(JAXBElement<BigDecimal> value) {
        this.insuranceAmountRequested = value;
    }

    /**
     * Gets the value of the insuranceAmountApproved property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInsuranceAmountApproved() {
        return insuranceAmountApproved;
    }

    /**
     * Sets the value of the insuranceAmountApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInsuranceAmountApproved(JAXBElement<BigDecimal> value) {
        this.insuranceAmountApproved = value;
    }

}
