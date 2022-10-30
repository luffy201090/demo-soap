
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCarrierPickupInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCarrierPickupInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarrierPickupInformation" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CarrierPickupInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCarrierPickupInformation", propOrder = {
    "carrierPickupInformation"
})
public class ArrayOfCarrierPickupInformation {

    @XmlElement(name = "CarrierPickupInformation", nillable = true)
    protected List<CarrierPickupInformation> carrierPickupInformation;

    /**
     * Gets the value of the carrierPickupInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierPickupInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierPickupInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierPickupInformation }
     * 
     * 
     */
    public List<CarrierPickupInformation> getCarrierPickupInformation() {
        if (carrierPickupInformation == null) {
            carrierPickupInformation = new ArrayList<CarrierPickupInformation>();
        }
        return this.carrierPickupInformation;
    }

}
