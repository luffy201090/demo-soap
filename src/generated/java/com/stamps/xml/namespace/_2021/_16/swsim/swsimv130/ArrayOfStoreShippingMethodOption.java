
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStoreShippingMethodOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStoreShippingMethodOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StoreShippingMethodOption" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}StoreShippingMethodOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStoreShippingMethodOption", propOrder = {
    "storeShippingMethodOption"
})
public class ArrayOfStoreShippingMethodOption {

    @XmlElement(name = "StoreShippingMethodOption", nillable = true)
    protected List<StoreShippingMethodOption> storeShippingMethodOption;

    /**
     * Gets the value of the storeShippingMethodOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storeShippingMethodOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreShippingMethodOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoreShippingMethodOption }
     * 
     * 
     */
    public List<StoreShippingMethodOption> getStoreShippingMethodOption() {
        if (storeShippingMethodOption == null) {
            storeShippingMethodOption = new ArrayList<StoreShippingMethodOption>();
        }
        return this.storeShippingMethodOption;
    }

}
