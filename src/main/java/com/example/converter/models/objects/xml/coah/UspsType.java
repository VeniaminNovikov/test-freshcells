
package com.example.converter.models.objects.xml.coah;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uspsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uspsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hotelAttributes" type="{}hotelAttributesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uspsType", propOrder = {
    "hotelAttributes"
})
public class UspsType {

    @XmlElement(required = true)
    protected HotelAttributesType hotelAttributes;

    /**
     * Gets the value of the hotelAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link HotelAttributesType }
     *     
     */
    public HotelAttributesType getHotelAttributes() {
        return hotelAttributes;
    }

    /**
     * Sets the value of the hotelAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelAttributesType }
     *     
     */
    public void setHotelAttributes(HotelAttributesType value) {
        this.hotelAttributes = value;
    }

}
