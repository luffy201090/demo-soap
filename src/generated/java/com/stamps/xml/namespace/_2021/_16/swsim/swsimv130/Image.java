
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Image complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Image"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImageId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ImageName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ImageUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ImageCategory" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ImageCategory"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", propOrder = {
    "imageId",
    "imageName",
    "imageUrl",
    "imageCategory"
})
public class Image {

    @XmlElement(name = "ImageId")
    protected int imageId;
    @XmlElement(name = "ImageName", required = true)
    protected String imageName;
    @XmlElement(name = "ImageUrl", required = true)
    protected String imageUrl;
    @XmlElement(name = "ImageCategory", required = true)
    @XmlSchemaType(name = "string")
    protected ImageCategory imageCategory;

    /**
     * Gets the value of the imageId property.
     * 
     */
    public int getImageId() {
        return imageId;
    }

    /**
     * Sets the value of the imageId property.
     * 
     */
    public void setImageId(int value) {
        this.imageId = value;
    }

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
     * Gets the value of the imageCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ImageCategory }
     *     
     */
    public ImageCategory getImageCategory() {
        return imageCategory;
    }

    /**
     * Sets the value of the imageCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageCategory }
     *     
     */
    public void setImageCategory(ImageCategory value) {
        this.imageCategory = value;
    }

}
