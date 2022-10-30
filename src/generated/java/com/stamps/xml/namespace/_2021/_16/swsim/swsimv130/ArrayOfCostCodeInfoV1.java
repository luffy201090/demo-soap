
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCost_code_info_v1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCost_code_info_v1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CostCodes" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}cost_code_info_v1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCost_code_info_v1", propOrder = {
    "costCodes"
})
public class ArrayOfCostCodeInfoV1 {

    @XmlElement(name = "CostCodes", nillable = true)
    protected List<CostCodeInfoV1> costCodes;

    /**
     * Gets the value of the costCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CostCodeInfoV1 }
     * 
     * 
     */
    public List<CostCodeInfoV1> getCostCodes() {
        if (costCodes == null) {
            costCodes = new ArrayList<CostCodeInfoV1>();
        }
        return this.costCodes;
    }

}
