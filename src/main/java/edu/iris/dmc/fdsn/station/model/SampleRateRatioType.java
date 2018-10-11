//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 01:15:36 PM PST 
//


package edu.iris.dmc.fdsn.station.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Sample rate expressed as number of samples in a number of
 * 				seconds.
 * 
 * <p>Java class for SampleRateRatioType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SampleRateRatioType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberSamples" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="NumberSeconds" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleRateRatioType", propOrder = {
    "numberSamples",
    "numberSeconds"
})
public class SampleRateRatioType {

    @XmlElement(name = "NumberSamples", required = true)
    protected BigInteger numberSamples;
    @XmlElement(name = "NumberSeconds", required = true)
    protected BigInteger numberSeconds;

    /**
     * Gets the value of the numberSamples property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberSamples() {
        return numberSamples;
    }

    /**
     * Sets the value of the numberSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberSamples(BigInteger value) {
        this.numberSamples = value;
    }

    /**
     * Gets the value of the numberSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberSeconds() {
        return numberSeconds;
    }

    /**
     * Sets the value of the numberSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberSeconds(BigInteger value) {
        this.numberSeconds = value;
    }

}
