
package com.example.converter.models.objects.xml.giata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the schemas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Result_QNAME = new QName("", "result");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: schemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link GeoDataType }
     * 
     */
    public GeoDataType createGeoDataType() {
        return new GeoDataType();
    }

    /**
     * Create an instance of {@link DayTemperatureType }
     * 
     */
    public DayTemperatureType createDayTemperatureType() {
        return new DayTemperatureType();
    }

    /**
     * Create an instance of {@link RaindayType }
     * 
     */
    public RaindayType createRaindayType() {
        return new RaindayType();
    }

    /**
     * Create an instance of {@link WaterTemperatureType }
     * 
     */
    public WaterTemperatureType createWaterTemperatureType() {
        return new WaterTemperatureType();
    }

    /**
     * Create an instance of {@link DataType }
     * 
     */
    public DataType createDataType() {
        return new DataType();
    }

    /**
     * Create an instance of {@link OcType }
     * 
     */
    public OcType createOcType() {
        return new OcType();
    }

    /**
     * Create an instance of {@link ObjectcodesType }
     * 
     */
    public ObjectcodesType createObjectcodesType() {
        return new ObjectcodesType();
    }

    /**
     * Create an instance of {@link BildfileType }
     * 
     */
    public BildfileType createBildfileType() {
        return new BildfileType();
    }

    /**
     * Create an instance of {@link SunshineType }
     * 
     */
    public SunshineType createSunshineType() {
        return new SunshineType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link NightTemperatureType }
     * 
     */
    public NightTemperatureType createNightTemperatureType() {
        return new NightTemperatureType();
    }

    /**
     * Create an instance of {@link ClimateType }
     * 
     */
    public ClimateType createClimateType() {
        return new ClimateType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "result")
    public JAXBElement<ResultType> createResult(ResultType value) {
        return new JAXBElement<ResultType>(_Result_QNAME, ResultType.class, null, value);
    }

}
