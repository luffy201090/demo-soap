
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfContainerLabelV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContainerLabelV1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContainerLabelV1" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ContainerLabelV1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContainerLabelV1", propOrder = {
    "containerLabelV1"
})
public class ArrayOfContainerLabelV1 {

    @XmlElement(name = "ContainerLabelV1", nillable = true)
    protected List<ContainerLabelV1> containerLabelV1;

    /**
     * Gets the value of the containerLabelV1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerLabelV1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerLabelV1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerLabelV1 }
     * 
     * 
     */
    public List<ContainerLabelV1> getContainerLabelV1() {
        if (containerLabelV1 == null) {
            containerLabelV1 = new ArrayList<ContainerLabelV1>();
        }
        return this.containerLabelV1;
    }

}
