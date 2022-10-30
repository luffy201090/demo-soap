
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNetStampsImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNetStampsImage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetStampsImage" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}NetStampsImage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNetStampsImage", propOrder = {
    "netStampsImage"
})
public class ArrayOfNetStampsImage {

    @XmlElement(name = "NetStampsImage", nillable = true)
    protected List<NetStampsImage> netStampsImage;

    /**
     * Gets the value of the netStampsImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netStampsImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetStampsImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetStampsImage }
     * 
     * 
     */
    public List<NetStampsImage> getNetStampsImage() {
        if (netStampsImage == null) {
            netStampsImage = new ArrayList<NetStampsImage>();
        }
        return this.netStampsImage;
    }

}
