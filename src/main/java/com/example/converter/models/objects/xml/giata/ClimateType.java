
package com.example.converter.models.objects.xml.giata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for climateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="climateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="day_temperature" type="{}day_temperatureType"/>
 *         &lt;element name="night_temperature" type="{}night_temperatureType"/>
 *         &lt;element name="sunshine" type="{}sunshineType"/>
 *         &lt;element name="rainday" type="{}raindayType"/>
 *         &lt;element name="water_temperature" type="{}water_temperatureType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="kind" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "climateType", propOrder = {
    "dayTemperature",
    "nightTemperature",
    "sunshine",
    "rainday",
    "waterTemperature"
})
public class ClimateType {

    @XmlElement(name = "day_temperature", required = true)
    protected DayTemperatureType dayTemperature;
    @XmlElement(name = "night_temperature", required = true)
    protected NightTemperatureType nightTemperature;
    @XmlElement(required = true)
    protected SunshineType sunshine;
    @XmlElement(required = true)
    protected RaindayType rainday;
    @XmlElement(name = "water_temperature", required = true)
    protected WaterTemperatureType waterTemperature;
    @XmlAttribute(name = "kind")
    protected String kind;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the dayTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link DayTemperatureType }
     *     
     */
    public DayTemperatureType getDayTemperature() {
        return dayTemperature;
    }

    /**
     * Sets the value of the dayTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayTemperatureType }
     *     
     */
    public void setDayTemperature(DayTemperatureType value) {
        this.dayTemperature = value;
    }

    /**
     * Gets the value of the nightTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link NightTemperatureType }
     *     
     */
    public NightTemperatureType getNightTemperature() {
        return nightTemperature;
    }

    /**
     * Sets the value of the nightTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link NightTemperatureType }
     *     
     */
    public void setNightTemperature(NightTemperatureType value) {
        this.nightTemperature = value;
    }

    /**
     * Gets the value of the sunshine property.
     * 
     * @return
     *     possible object is
     *     {@link SunshineType }
     *     
     */
    public SunshineType getSunshine() {
        return sunshine;
    }

    /**
     * Sets the value of the sunshine property.
     * 
     * @param value
     *     allowed object is
     *     {@link SunshineType }
     *     
     */
    public void setSunshine(SunshineType value) {
        this.sunshine = value;
    }

    /**
     * Gets the value of the rainday property.
     * 
     * @return
     *     possible object is
     *     {@link RaindayType }
     *     
     */
    public RaindayType getRainday() {
        return rainday;
    }

    /**
     * Sets the value of the rainday property.
     * 
     * @param value
     *     allowed object is
     *     {@link RaindayType }
     *     
     */
    public void setRainday(RaindayType value) {
        this.rainday = value;
    }

    /**
     * Gets the value of the waterTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link WaterTemperatureType }
     *     
     */
    public WaterTemperatureType getWaterTemperature() {
        return waterTemperature;
    }

    /**
     * Sets the value of the waterTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterTemperatureType }
     *     
     */
    public void setWaterTemperature(WaterTemperatureType value) {
        this.waterTemperature = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
