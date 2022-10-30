
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
 * <p>Java class for PGClaimDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PGClaimDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaimType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PGClaimType"/&gt;
 *         &lt;element name="AmountRequested" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AmountApproved" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="EventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Status" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PGClaimStatus"/&gt;
 *         &lt;element name="StatusDetail" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PGClaimSubStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PGClaimDetails", propOrder = {
    "claimType",
    "amountRequested",
    "amountApproved",
    "eventDate",
    "status",
    "statusDetail"
})
public class PGClaimDetails {

    @XmlElement(name = "ClaimType", required = true)
    @XmlSchemaType(name = "string")
    protected PGClaimType claimType;
    @XmlElement(name = "AmountRequested", required = true)
    protected BigDecimal amountRequested;
    @XmlElement(name = "AmountApproved", required = true)
    protected BigDecimal amountApproved;
    @XmlElement(name = "EventDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected PGClaimStatus status;
    @XmlElementRef(name = "StatusDetail", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<PGClaimSubStatus> statusDetail;

    /**
     * Gets the value of the claimType property.
     * 
     * @return
     *     possible object is
     *     {@link PGClaimType }
     *     
     */
    public PGClaimType getClaimType() {
        return claimType;
    }

    /**
     * Sets the value of the claimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PGClaimType }
     *     
     */
    public void setClaimType(PGClaimType value) {
        this.claimType = value;
    }

    /**
     * Gets the value of the amountRequested property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountRequested() {
        return amountRequested;
    }

    /**
     * Sets the value of the amountRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountRequested(BigDecimal value) {
        this.amountRequested = value;
    }

    /**
     * Gets the value of the amountApproved property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountApproved() {
        return amountApproved;
    }

    /**
     * Sets the value of the amountApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountApproved(BigDecimal value) {
        this.amountApproved = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PGClaimStatus }
     *     
     */
    public PGClaimStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PGClaimStatus }
     *     
     */
    public void setStatus(PGClaimStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PGClaimSubStatus }{@code >}
     *     
     */
    public JAXBElement<PGClaimSubStatus> getStatusDetail() {
        return statusDetail;
    }

    /**
     * Sets the value of the statusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PGClaimSubStatus }{@code >}
     *     
     */
    public void setStatusDetail(JAXBElement<PGClaimSubStatus> value) {
        this.statusDetail = value;
    }

}
