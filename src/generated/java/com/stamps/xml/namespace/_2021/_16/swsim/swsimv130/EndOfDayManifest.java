
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndOfDayManifest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndOfDayManifest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PickupCarrier" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PickupCarrier"/&gt;
 *         &lt;element name="ManifestType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ManifestType"/&gt;
 *         &lt;element name="ManifestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManifestUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContainerLabels" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfContainerLabelV1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndOfDayManifest", propOrder = {
    "pickupCarrier",
    "manifestType",
    "manifestId",
    "manifestUrl",
    "containerLabels"
})
public class EndOfDayManifest {

    @XmlElement(name = "PickupCarrier", required = true)
    @XmlSchemaType(name = "string")
    protected PickupCarrier pickupCarrier;
    @XmlElement(name = "ManifestType", required = true)
    @XmlSchemaType(name = "string")
    protected ManifestType manifestType;
    @XmlElement(name = "ManifestId")
    protected String manifestId;
    @XmlElement(name = "ManifestUrl")
    protected String manifestUrl;
    @XmlElement(name = "ContainerLabels")
    protected ArrayOfContainerLabelV1 containerLabels;

    /**
     * Gets the value of the pickupCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link PickupCarrier }
     *     
     */
    public PickupCarrier getPickupCarrier() {
        return pickupCarrier;
    }

    /**
     * Sets the value of the pickupCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupCarrier }
     *     
     */
    public void setPickupCarrier(PickupCarrier value) {
        this.pickupCarrier = value;
    }

    /**
     * Gets the value of the manifestType property.
     * 
     * @return
     *     possible object is
     *     {@link ManifestType }
     *     
     */
    public ManifestType getManifestType() {
        return manifestType;
    }

    /**
     * Sets the value of the manifestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManifestType }
     *     
     */
    public void setManifestType(ManifestType value) {
        this.manifestType = value;
    }

    /**
     * Gets the value of the manifestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifestId() {
        return manifestId;
    }

    /**
     * Sets the value of the manifestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifestId(String value) {
        this.manifestId = value;
    }

    /**
     * Gets the value of the manifestUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifestUrl() {
        return manifestUrl;
    }

    /**
     * Sets the value of the manifestUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifestUrl(String value) {
        this.manifestUrl = value;
    }

    /**
     * Gets the value of the containerLabels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContainerLabelV1 }
     *     
     */
    public ArrayOfContainerLabelV1 getContainerLabels() {
        return containerLabels;
    }

    /**
     * Sets the value of the containerLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContainerLabelV1 }
     *     
     */
    public void setContainerLabels(ArrayOfContainerLabelV1 value) {
        this.containerLabels = value;
    }

}
