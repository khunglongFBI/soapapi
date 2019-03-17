
package com.vsii.soap2.demo.model;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Icc" type="{http://localhost:8080/hien}Icc"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "icc"
})
@XmlRootElement(name = "GetIccResponse", namespace = "http://localhost:8080/hien")
public class GetIccResponse {

    @XmlElement(name = "Icc", namespace = "http://localhost:8080/hien", required = true)
    protected Icc icc;

    /**
     * Gets the value of the icc property.
     * 
     * @return
     *     possible object is
     *     {@link Icc }
     *     
     */
    public Icc getIcc() {
        return icc;
    }

    /**
     * Sets the value of the icc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Icc }
     *     
     */
    public void setIcc(Icc value) {
        this.icc = value;
    }

}
