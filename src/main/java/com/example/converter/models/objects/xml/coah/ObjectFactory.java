
package com.example.converter.models.objects.xml.coah;

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

    private final static QName _Content_QNAME = new QName("", "content");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: schemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContentType }
     * 
     */
    public ContentType createContentType() {
        return new ContentType();
    }

    /**
     * Create an instance of {@link UrlsType }
     * 
     */
    public UrlsType createUrlsType() {
        return new UrlsType();
    }

    /**
     * Create an instance of {@link UspsType }
     * 
     */
    public UspsType createUspsType() {
        return new UspsType();
    }

    /**
     * Create an instance of {@link FoodRatingType }
     * 
     */
    public FoodRatingType createFoodRatingType() {
        return new FoodRatingType();
    }

    /**
     * Create an instance of {@link AverageRatingType }
     * 
     */
    public AverageRatingType createAverageRatingType() {
        return new AverageRatingType();
    }

    /**
     * Create an instance of {@link ParagraphType }
     * 
     */
    public ParagraphType createParagraphType() {
        return new ParagraphType();
    }

    /**
     * Create an instance of {@link UrlType }
     * 
     */
    public UrlType createUrlType() {
        return new UrlType();
    }

    /**
     * Create an instance of {@link AttributesType }
     * 
     */
    public AttributesType createAttributesType() {
        return new AttributesType();
    }

    /**
     * Create an instance of {@link SportRatingType }
     * 
     */
    public SportRatingType createSportRatingType() {
        return new SportRatingType();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link RecommendationType }
     * 
     */
    public RecommendationType createRecommendationType() {
        return new RecommendationType();
    }

    /**
     * Create an instance of {@link ImageType }
     * 
     */
    public ImageType createImageType() {
        return new ImageType();
    }

    /**
     * Create an instance of {@link DetailedRatingType }
     * 
     */
    public DetailedRatingType createDetailedRatingType() {
        return new DetailedRatingType();
    }

    /**
     * Create an instance of {@link ImagesType }
     * 
     */
    public ImagesType createImagesType() {
        return new ImagesType();
    }

    /**
     * Create an instance of {@link RoomRatingType }
     * 
     */
    public RoomRatingType createRoomRatingType() {
        return new RoomRatingType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link VideoType }
     * 
     */
    public VideoType createVideoType() {
        return new VideoType();
    }

    /**
     * Create an instance of {@link ServiceRatingType }
     * 
     */
    public ServiceRatingType createServiceRatingType() {
        return new ServiceRatingType();
    }

    /**
     * Create an instance of {@link RatingsType }
     * 
     */
    public RatingsType createRatingsType() {
        return new RatingsType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link VideosType }
     * 
     */
    public VideosType createVideosType() {
        return new VideosType();
    }

    /**
     * Create an instance of {@link CategoryType }
     * 
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link TextsType }
     * 
     */
    public TextsType createTextsType() {
        return new TextsType();
    }

    /**
     * Create an instance of {@link FormattedType }
     * 
     */
    public FormattedType createFormattedType() {
        return new FormattedType();
    }

    /**
     * Create an instance of {@link LocationRatingType }
     * 
     */
    public LocationRatingType createLocationRatingType() {
        return new LocationRatingType();
    }

    /**
     * Create an instance of {@link HotelRatingType }
     * 
     */
    public HotelRatingType createHotelRatingType() {
        return new HotelRatingType();
    }

    /**
     * Create an instance of {@link HotelType }
     * 
     */
    public HotelType createHotelType() {
        return new HotelType();
    }

    /**
     * Create an instance of {@link HotelAttributesType }
     * 
     */
    public HotelAttributesType createHotelAttributesType() {
        return new HotelAttributesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "content")
    public JAXBElement<ContentType> createContent(ContentType value) {
        return new JAXBElement<ContentType>(_Content_QNAME, ContentType.class, null, value);
    }

}
