
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSurchargeV5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSurchargeV5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SurchargeV5" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}SurchargeV5" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSurchargeV5", propOrder = {
    "surchargeV5"
})
public class ArrayOfSurchargeV5 {

    @XmlElement(name = "SurchargeV5", nillable = true)
    protected List<SurchargeV5> surchargeV5;

    /**
     * Gets the value of the surchargeV5 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surchargeV5 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurchargeV5().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurchargeV5 }
     * 
     * 
     */
    public List<SurchargeV5> getSurchargeV5() {
        if (surchargeV5 == null) {
            surchargeV5 = new ArrayList<SurchargeV5>();
        }
        return this.surchargeV5;
    }

}
