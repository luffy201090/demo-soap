
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArrayOfAddOnTypeV20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArrayOfAddOnTypeV20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequiresOneOf" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfAddOnTypeV20" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfAddOnTypeV20", propOrder = {
    "requiresOneOf"
})
public class ArrayOfArrayOfAddOnTypeV20 {

    @XmlElement(name = "RequiresOneOf", nillable = true)
    protected List<ArrayOfAddOnTypeV20> requiresOneOf;

    /**
     * Gets the value of the requiresOneOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiresOneOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiresOneOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAddOnTypeV20 }
     * 
     * 
     */
    public List<ArrayOfAddOnTypeV20> getRequiresOneOf() {
        if (requiresOneOf == null) {
            requiresOneOf = new ArrayList<ArrayOfAddOnTypeV20>();
        }
        return this.requiresOneOf;
    }

}
