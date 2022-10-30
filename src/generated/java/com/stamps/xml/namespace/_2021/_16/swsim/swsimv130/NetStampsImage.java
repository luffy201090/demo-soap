
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetStampsImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetStampsImage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImageName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ImageID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ImageCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ImageDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ImageUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ImageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ImageType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}NetStampsImageType"/&gt;
 *         &lt;element name="PreviewOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PlansUpgradeToPrintImage" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfPlan" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetStampsImage", propOrder = {
    "imageName",
    "imageID",
    "imageCategory",
    "imageDescription",
    "imageUrl",
    "imageIndex",
    "imageType",
    "previewOnly",
    "plansUpgradeToPrintImage"
})
public class NetStampsImage {

    @XmlElement(name = "ImageName", required = true)
    protected String imageName;
    @XmlElement(name = "ImageID")
    protected int imageID;
    @XmlElement(name = "ImageCategory", required = true)
    protected String imageCategory;
    @XmlElement(name = "ImageDescription", required = true)
    protected String imageDescription;
    @XmlElement(name = "ImageUrl", required = true)
    protected String imageUrl;
    @XmlElement(name = "ImageIndex")
    protected int imageIndex;
    @XmlElement(name = "ImageType", required = true)
    @XmlSchemaType(name = "string")
    protected NetStampsImageType imageType;
    @XmlElement(name = "PreviewOnly")
    protected boolean previewOnly;
    @XmlElement(name = "PlansUpgradeToPrintImage")
    protected ArrayOfPlan plansUpgradeToPrintImage;

    /**
     * Gets the value of the imageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * Sets the value of the imageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageName(String value) {
        this.imageName = value;
    }

    /**
     * Gets the value of the imageID property.
     * 
     */
    public int getImageID() {
        return imageID;
    }

    /**
     * Sets the value of the imageID property.
     * 
     */
    public void setImageID(int value) {
        this.imageID = value;
    }

    /**
     * Gets the value of the imageCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageCategory() {
        return imageCategory;
    }

    /**
     * Sets the value of the imageCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageCategory(String value) {
        this.imageCategory = value;
    }

    /**
     * Gets the value of the imageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageDescription() {
        return imageDescription;
    }

    /**
     * Sets the value of the imageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageDescription(String value) {
        this.imageDescription = value;
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    /**
     * Gets the value of the imageIndex property.
     * 
     */
    public int getImageIndex() {
        return imageIndex;
    }

    /**
     * Sets the value of the imageIndex property.
     * 
     */
    public void setImageIndex(int value) {
        this.imageIndex = value;
    }

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link NetStampsImageType }
     *     
     */
    public NetStampsImageType getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetStampsImageType }
     *     
     */
    public void setImageType(NetStampsImageType value) {
        this.imageType = value;
    }

    /**
     * Gets the value of the previewOnly property.
     * 
     */
    public boolean isPreviewOnly() {
        return previewOnly;
    }

    /**
     * Sets the value of the previewOnly property.
     * 
     */
    public void setPreviewOnly(boolean value) {
        this.previewOnly = value;
    }

    /**
     * Gets the value of the plansUpgradeToPrintImage property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPlan }
     *     
     */
    public ArrayOfPlan getPlansUpgradeToPrintImage() {
        return plansUpgradeToPrintImage;
    }

    /**
     * Sets the value of the plansUpgradeToPrintImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPlan }
     *     
     */
    public void setPlansUpgradeToPrintImage(ArrayOfPlan value) {
        this.plansUpgradeToPrintImage = value;
    }

}
