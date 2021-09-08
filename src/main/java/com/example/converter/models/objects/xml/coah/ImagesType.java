
package com.example.converter.models.objects.xml.coah;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for imagesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imagesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="image" type="{}imageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourceLong" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="katalogid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="katalogname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imagesType", propOrder = {
    "image"
})
public class ImagesType {

    protected List<ImageType> image;
    @XmlAttribute(name = "source")
    protected String source;
    @XmlAttribute(name = "sourceLong")
    protected String sourceLong;
    @XmlAttribute(name = "katalogid")
    protected String katalogid;
    @XmlAttribute(name = "katalogname")
    protected String katalogname;

    /**
     * Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageType }
     * 
     * 
     */
    public List<ImageType> getImage() {
        if (image == null) {
            image = new ArrayList<ImageType>();
        }
        return this.image;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the sourceLong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLong() {
        return sourceLong;
    }

    /**
     * Sets the value of the sourceLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLong(String value) {
        this.sourceLong = value;
    }

    /**
     * Gets the value of the katalogid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKatalogid() {
        return katalogid;
    }

    /**
     * Sets the value of the katalogid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKatalogid(String value) {
        this.katalogid = value;
    }

    /**
     * Gets the value of the katalogname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKatalogname() {
        return katalogname;
    }

    /**
     * Sets the value of the katalogname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKatalogname(String value) {
        this.katalogname = value;
    }

}
