
package com.example.converter.models.objects.xml.giata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PDFfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Hotelname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Hotelkategorie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Stadtname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Zielgebietsname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Stadtnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Zielgebietsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Landname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Landcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Veranstaltercode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datestart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateend" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GeoData" type="{}GeoDataType"/>
 *         &lt;element name="Objectcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Objectcodes" type="{}ObjectcodesType"/>
 *         &lt;element name="Text" type="{}TextType"/>
 *         &lt;element name="Landkarte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="climate" type="{}climateType"/>
 *         &lt;element name="KatalogID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Katalogseite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Preisseite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Katalogname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Veranstaltername" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VeranstalterID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KataloghotelID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KatalogSaisonTyp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Bildfile" type="{}BildfileType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Textfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Klimagrafik" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AGB" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TDS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataType", propOrder = {
    "pdFfile",
    "hotelname",
    "hotelkategorie",
    "stadtname",
    "zielgebietsname",
    "stadtnummer",
    "zielgebietsnummer",
    "landname",
    "landcode",
    "veranstaltercode",
    "datestart",
    "dateend",
    "geoData",
    "objectcode",
    "objectcodes",
    "text",
    "landkarte",
    "climate",
    "katalogID",
    "katalogseite",
    "preisseite",
    "katalogname",
    "veranstaltername",
    "veranstalterID",
    "kataloghotelID",
    "katalogSaisonTyp",
    "bildfile",
    "textfile",
    "klimagrafik",
    "agb",
    "tds"
})
public class DataType {

    @XmlElement(name = "PDFfile", required = true)
    protected String pdFfile;
    @XmlElement(name = "Hotelname", required = true)
    protected String hotelname;
    @XmlElement(name = "Hotelkategorie", required = true)
    protected String hotelkategorie;
    @XmlElement(name = "Stadtname", required = true)
    protected String stadtname;
    @XmlElement(name = "Zielgebietsname", required = true)
    protected String zielgebietsname;
    @XmlElement(name = "Stadtnummer", required = true)
    protected String stadtnummer;
    @XmlElement(name = "Zielgebietsnummer", required = true)
    protected String zielgebietsnummer;
    @XmlElement(name = "Landname", required = true)
    protected String landname;
    @XmlElement(name = "Landcode", required = true)
    protected String landcode;
    @XmlElement(name = "Veranstaltercode", required = true)
    protected String veranstaltercode;
    @XmlElement(required = true)
    protected String datestart;
    @XmlElement(required = true)
    protected String dateend;
    @XmlElement(name = "GeoData", required = true)
    protected GeoDataType geoData;
    @XmlElement(name = "Objectcode", required = true)
    protected String objectcode;
    @XmlElement(name = "Objectcodes", required = true)
    protected ObjectcodesType objectcodes;
    @XmlElement(name = "Text", required = true)
    protected TextType text;
    @XmlElement(name = "Landkarte", required = true)
    protected String landkarte;
    @XmlElement(required = true)
    protected ClimateType climate;
    @XmlElement(name = "KatalogID", required = true)
    protected String katalogID;
    @XmlElement(name = "Katalogseite", required = true)
    protected String katalogseite;
    @XmlElement(name = "Preisseite", required = true)
    protected String preisseite;
    @XmlElement(name = "Katalogname", required = true)
    protected String katalogname;
    @XmlElement(name = "Veranstaltername", required = true)
    protected String veranstaltername;
    @XmlElement(name = "VeranstalterID", required = true)
    protected String veranstalterID;
    @XmlElement(name = "KataloghotelID", required = true)
    protected String kataloghotelID;
    @XmlElement(name = "KatalogSaisonTyp", required = true)
    protected String katalogSaisonTyp;
    @XmlElement(name = "Bildfile")
    protected List<BildfileType> bildfile;
    @XmlElement(name = "Textfile", required = true)
    protected String textfile;
    @XmlElement(name = "Klimagrafik", required = true)
    protected String klimagrafik;
    @XmlElement(name = "AGB", required = true)
    protected String agb;
    @XmlElement(name = "TDS", required = true)
    protected String tds;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the pdFfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDFfile() {
        return pdFfile;
    }

    /**
     * Sets the value of the pdFfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFfile(String value) {
        this.pdFfile = value;
    }

    /**
     * Gets the value of the hotelname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelname() {
        return hotelname;
    }

    /**
     * Sets the value of the hotelname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelname(String value) {
        this.hotelname = value;
    }

    /**
     * Gets the value of the hotelkategorie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelkategorie() {
        return hotelkategorie;
    }

    /**
     * Sets the value of the hotelkategorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelkategorie(String value) {
        this.hotelkategorie = value;
    }

    /**
     * Gets the value of the stadtname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStadtname() {
        return stadtname;
    }

    /**
     * Sets the value of the stadtname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStadtname(String value) {
        this.stadtname = value;
    }

    /**
     * Gets the value of the zielgebietsname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZielgebietsname() {
        return zielgebietsname;
    }

    /**
     * Sets the value of the zielgebietsname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZielgebietsname(String value) {
        this.zielgebietsname = value;
    }

    /**
     * Gets the value of the stadtnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStadtnummer() {
        return stadtnummer;
    }

    /**
     * Sets the value of the stadtnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStadtnummer(String value) {
        this.stadtnummer = value;
    }

    /**
     * Gets the value of the zielgebietsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZielgebietsnummer() {
        return zielgebietsnummer;
    }

    /**
     * Sets the value of the zielgebietsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZielgebietsnummer(String value) {
        this.zielgebietsnummer = value;
    }

    /**
     * Gets the value of the landname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandname() {
        return landname;
    }

    /**
     * Sets the value of the landname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandname(String value) {
        this.landname = value;
    }

    /**
     * Gets the value of the landcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandcode() {
        return landcode;
    }

    /**
     * Sets the value of the landcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandcode(String value) {
        this.landcode = value;
    }

    /**
     * Gets the value of the veranstaltercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeranstaltercode() {
        return veranstaltercode;
    }

    /**
     * Sets the value of the veranstaltercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeranstaltercode(String value) {
        this.veranstaltercode = value;
    }

    /**
     * Gets the value of the datestart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatestart() {
        return datestart;
    }

    /**
     * Sets the value of the datestart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatestart(String value) {
        this.datestart = value;
    }

    /**
     * Gets the value of the dateend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateend() {
        return dateend;
    }

    /**
     * Sets the value of the dateend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateend(String value) {
        this.dateend = value;
    }

    /**
     * Gets the value of the geoData property.
     * 
     * @return
     *     possible object is
     *     {@link GeoDataType }
     *     
     */
    public GeoDataType getGeoData() {
        return geoData;
    }

    /**
     * Sets the value of the geoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoDataType }
     *     
     */
    public void setGeoData(GeoDataType value) {
        this.geoData = value;
    }

    /**
     * Gets the value of the objectcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectcode() {
        return objectcode;
    }

    /**
     * Sets the value of the objectcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectcode(String value) {
        this.objectcode = value;
    }

    /**
     * Gets the value of the objectcodes property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectcodesType }
     *     
     */
    public ObjectcodesType getObjectcodes() {
        return objectcodes;
    }

    /**
     * Sets the value of the objectcodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectcodesType }
     *     
     */
    public void setObjectcodes(ObjectcodesType value) {
        this.objectcodes = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setText(TextType value) {
        this.text = value;
    }

    /**
     * Gets the value of the landkarte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandkarte() {
        return landkarte;
    }

    /**
     * Sets the value of the landkarte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandkarte(String value) {
        this.landkarte = value;
    }

    /**
     * Gets the value of the climate property.
     * 
     * @return
     *     possible object is
     *     {@link ClimateType }
     *     
     */
    public ClimateType getClimate() {
        return climate;
    }

    /**
     * Sets the value of the climate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClimateType }
     *     
     */
    public void setClimate(ClimateType value) {
        this.climate = value;
    }

    /**
     * Gets the value of the katalogID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKatalogID() {
        return katalogID;
    }

    /**
     * Sets the value of the katalogID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKatalogID(String value) {
        this.katalogID = value;
    }

    /**
     * Gets the value of the katalogseite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKatalogseite() {
        return katalogseite;
    }

    /**
     * Sets the value of the katalogseite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKatalogseite(String value) {
        this.katalogseite = value;
    }

    /**
     * Gets the value of the preisseite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreisseite() {
        return preisseite;
    }

    /**
     * Sets the value of the preisseite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreisseite(String value) {
        this.preisseite = value;
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

    /**
     * Gets the value of the veranstaltername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeranstaltername() {
        return veranstaltername;
    }

    /**
     * Sets the value of the veranstaltername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeranstaltername(String value) {
        this.veranstaltername = value;
    }

    /**
     * Gets the value of the veranstalterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeranstalterID() {
        return veranstalterID;
    }

    /**
     * Sets the value of the veranstalterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeranstalterID(String value) {
        this.veranstalterID = value;
    }

    /**
     * Gets the value of the kataloghotelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKataloghotelID() {
        return kataloghotelID;
    }

    /**
     * Sets the value of the kataloghotelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKataloghotelID(String value) {
        this.kataloghotelID = value;
    }

    /**
     * Gets the value of the katalogSaisonTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKatalogSaisonTyp() {
        return katalogSaisonTyp;
    }

    /**
     * Sets the value of the katalogSaisonTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKatalogSaisonTyp(String value) {
        this.katalogSaisonTyp = value;
    }

    /**
     * Gets the value of the bildfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bildfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBildfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BildfileType }
     * 
     * 
     */
    public List<BildfileType> getBildfile() {
        if (bildfile == null) {
            bildfile = new ArrayList<BildfileType>();
        }
        return this.bildfile;
    }

    /**
     * Gets the value of the textfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextfile() {
        return textfile;
    }

    /**
     * Sets the value of the textfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextfile(String value) {
        this.textfile = value;
    }

    /**
     * Gets the value of the klimagrafik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlimagrafik() {
        return klimagrafik;
    }

    /**
     * Sets the value of the klimagrafik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKlimagrafik(String value) {
        this.klimagrafik = value;
    }

    /**
     * Gets the value of the agb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGB() {
        return agb;
    }

    /**
     * Sets the value of the agb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGB(String value) {
        this.agb = value;
    }

    /**
     * Gets the value of the tds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDS() {
        return tds;
    }

    /**
     * Sets the value of the tds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDS(String value) {
        this.tds = value;
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
