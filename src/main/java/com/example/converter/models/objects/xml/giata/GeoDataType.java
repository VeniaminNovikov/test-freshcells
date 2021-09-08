
package com.example.converter.models.objects.xml.giata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GiataID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Accuracy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoDataType", propOrder = {
    "giataID",
    "latitude",
    "longitude",
    "accuracy"
})
public class GeoDataType {

    @XmlElement(name = "GiataID", required = true)
    protected String giataID;
    @XmlElement(name = "Latitude", required = true)
    protected String latitude;
    @XmlElement(name = "Longitude", required = true)
    protected String longitude;
    @XmlElement(name = "Accuracy", required = true)
    protected String accuracy;

    /**
     * Gets the value of the giataID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiataID() {
        return giataID;
    }

    /**
     * Sets the value of the giataID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiataID(String value) {
        this.giataID = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the accuracy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the value of the accuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccuracy(String value) {
        this.accuracy = value;
    }

}
