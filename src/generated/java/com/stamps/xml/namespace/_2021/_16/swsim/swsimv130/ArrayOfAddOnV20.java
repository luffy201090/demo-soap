
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAddOnV20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAddOnV20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddOnV20" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}AddOnV20" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAddOnV20", propOrder = {
    "addOnV20"
})
public class ArrayOfAddOnV20 {

    @XmlElement(name = "AddOnV20", nillable = true)
    protected List<AddOnV20> addOnV20;

    /**
     * Gets the value of the addOnV20 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addOnV20 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddOnV20().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddOnV20 }
     * 
     * 
     */
    public List<AddOnV20> getAddOnV20() {
        if (addOnV20 == null) {
            addOnV20 = new ArrayList<AddOnV20>();
        }
        return this.addOnV20;
    }

}
