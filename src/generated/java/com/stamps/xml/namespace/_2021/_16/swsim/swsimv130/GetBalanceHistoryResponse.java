
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Authenticator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BalanceHistoryToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TotalTransactions" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Transactions" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfTransaction" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authenticator",
    "balanceHistoryToken",
    "totalTransactions",
    "totalPages",
    "transactions"
})
@XmlRootElement(name = "GetBalanceHistoryResponse")
public class GetBalanceHistoryResponse {

    @XmlElement(name = "Authenticator", required = true)
    protected String authenticator;
    @XmlElement(name = "BalanceHistoryToken", required = true)
    protected String balanceHistoryToken;
    @XmlElement(name = "TotalTransactions")
    protected int totalTransactions;
    @XmlElement(name = "TotalPages")
    protected int totalPages;
    @XmlElement(name = "Transactions")
    protected ArrayOfTransaction transactions;

    /**
     * Gets the value of the authenticator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticator() {
        return authenticator;
    }

    /**
     * Sets the value of the authenticator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticator(String value) {
        this.authenticator = value;
    }

    /**
     * Gets the value of the balanceHistoryToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceHistoryToken() {
        return balanceHistoryToken;
    }

    /**
     * Sets the value of the balanceHistoryToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceHistoryToken(String value) {
        this.balanceHistoryToken = value;
    }

    /**
     * Gets the value of the totalTransactions property.
     * 
     */
    public int getTotalTransactions() {
        return totalTransactions;
    }

    /**
     * Sets the value of the totalTransactions property.
     * 
     */
    public void setTotalTransactions(int value) {
        this.totalTransactions = value;
    }

    /**
     * Gets the value of the totalPages property.
     * 
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     * 
     */
    public void setTotalPages(int value) {
        this.totalPages = value;
    }

    /**
     * Gets the value of the transactions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransaction }
     *     
     */
    public ArrayOfTransaction getTransactions() {
        return transactions;
    }

    /**
     * Sets the value of the transactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransaction }
     *     
     */
    public void setTransactions(ArrayOfTransaction value) {
        this.transactions = value;
    }

}
