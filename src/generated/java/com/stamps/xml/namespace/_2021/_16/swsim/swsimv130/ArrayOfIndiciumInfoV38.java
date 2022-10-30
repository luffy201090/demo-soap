
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIndiciumInfoV38 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIndiciumInfoV38"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IndiciumInfoV38" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}IndiciumInfoV38" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIndiciumInfoV38", propOrder = {
    "indiciumInfoV38"
})
public class ArrayOfIndiciumInfoV38 {

    @XmlElement(name = "IndiciumInfoV38", nillable = true)
    protected List<IndiciumInfoV38> indiciumInfoV38;

    /**
     * Gets the value of the indiciumInfoV38 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indiciumInfoV38 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndiciumInfoV38().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndiciumInfoV38 }
     * 
     * 
     */
    public List<IndiciumInfoV38> getIndiciumInfoV38() {
        if (indiciumInfoV38 == null) {
            indiciumInfoV38 = new ArrayList<IndiciumInfoV38>();
        }
        return this.indiciumInfoV38;
    }

}
