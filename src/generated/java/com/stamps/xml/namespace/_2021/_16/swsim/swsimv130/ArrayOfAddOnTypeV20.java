
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAddOnTypeV20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAddOnTypeV20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddOnTypeV20" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}AddOnTypeV20" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAddOnTypeV20", propOrder = {
    "addOnTypeV20"
})
public class ArrayOfAddOnTypeV20 {

    @XmlElement(name = "AddOnTypeV20")
    @XmlSchemaType(name = "string")
    protected List<AddOnTypeV20> addOnTypeV20;

    /**
     * Gets the value of the addOnTypeV20 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addOnTypeV20 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddOnTypeV20().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddOnTypeV20 }
     * 
     * 
     */
    public List<AddOnTypeV20> getAddOnTypeV20() {
        if (addOnTypeV20 == null) {
            addOnTypeV20 = new ArrayList<AddOnTypeV20>();
        }
        return this.addOnTypeV20;
    }

}
