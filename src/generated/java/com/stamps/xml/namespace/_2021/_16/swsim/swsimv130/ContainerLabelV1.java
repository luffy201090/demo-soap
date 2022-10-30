
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContainerLabelV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContainerLabelV1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContainerTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContainerUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StampsTxId" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerLabelV1", propOrder = {
    "containerTrackingNumber",
    "containerUrl",
    "stampsTxId"
})
public class ContainerLabelV1 {

    @XmlElement(name = "ContainerTrackingNumber", required = true)
    protected String containerTrackingNumber;
    @XmlElement(name = "ContainerUrl", required = true)
    protected String containerUrl;
    @XmlElement(name = "StampsTxId", required = true)
    protected String stampsTxId;

    /**
     * Gets the value of the containerTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerTrackingNumber() {
        return containerTrackingNumber;
    }

    /**
     * Sets the value of the containerTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerTrackingNumber(String value) {
        this.containerTrackingNumber = value;
    }

    /**
     * Gets the value of the containerUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerUrl() {
        return containerUrl;
    }

    /**
     * Sets the value of the containerUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerUrl(String value) {
        this.containerUrl = value;
    }

    /**
     * Gets the value of the stampsTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStampsTxId() {
        return stampsTxId;
    }

    /**
     * Sets the value of the stampsTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStampsTxId(String value) {
        this.stampsTxId = value;
    }

}
