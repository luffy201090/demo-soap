
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DisputeInfoV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeInfoV1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisputeStatus" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}DisputeStatus"/&gt;
 *         &lt;element name="DisputeCreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DisputeLastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeInfoV1", propOrder = {
    "disputeStatus",
    "disputeCreateDate",
    "disputeLastUpdateDate"
})
public class DisputeInfoV1 {

    @XmlElement(name = "DisputeStatus", required = true)
    @XmlSchemaType(name = "string")
    protected DisputeStatus disputeStatus;
    @XmlElement(name = "DisputeCreateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar disputeCreateDate;
    @XmlElement(name = "DisputeLastUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar disputeLastUpdateDate;

    /**
     * Gets the value of the disputeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeStatus }
     *     
     */
    public DisputeStatus getDisputeStatus() {
        return disputeStatus;
    }

    /**
     * Sets the value of the disputeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeStatus }
     *     
     */
    public void setDisputeStatus(DisputeStatus value) {
        this.disputeStatus = value;
    }

    /**
     * Gets the value of the disputeCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisputeCreateDate() {
        return disputeCreateDate;
    }

    /**
     * Sets the value of the disputeCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisputeCreateDate(XMLGregorianCalendar value) {
        this.disputeCreateDate = value;
    }

    /**
     * Gets the value of the disputeLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisputeLastUpdateDate() {
        return disputeLastUpdateDate;
    }

    /**
     * Sets the value of the disputeLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisputeLastUpdateDate(XMLGregorianCalendar value) {
        this.disputeLastUpdateDate = value;
    }

}
