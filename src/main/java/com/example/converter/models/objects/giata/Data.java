package com.example.converter.models.objects.giata;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data implements Serializable {
    private static final long serialVersionUID = 1L;

    private String hotelName;
    private Integer hotelCategory;
    private String districtName;
    private Integer districtNumber;
    private String destinationName;
    private Integer destinationNumber;
    private String countryName;
    private String countryCode;
    private String organizerCode;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private Integer katalogID;
    private Integer katalogseite;
    private Integer preisseite;
    private String katalogname;
    private String veranstaltername;
    private Integer veranstalterID;
    private Integer kataloghotelID;
    private String katalogSaisonTyp;
    private String objectCode;

    private GeoData geoData;
    private Text text;
    private Climate climate;

    @JacksonXmlElementWrapper(useWrapping = false)
    private Set<String> imageFiles = new LinkedHashSet<>();

    public Data() {
        // empty
    }

    private Data(final Builder builder) {
        this.hotelName = builder.hotelName;
        this.hotelCategory = builder.hotelCategory;
        this.districtName = builder.districtName;
        this.districtNumber = builder.districtNumber;
        this.destinationName = builder.destinationName;
        this.destinationNumber = builder.destinationNumber;
        this.countryName = builder.countryName;
        this.countryCode = builder.countryCode;
        this.organizerCode = builder.organizerCode;
        this.dateStart = builder.dateStart;
        this.dateEnd = builder.dateEnd;
        this.geoData = builder.geoData;
        this.objectCode = builder.objectCode;
        this.text = builder.text;
        this.climate = builder.climate;
        this.katalogID = builder.katalogID;
        this.katalogseite = builder.katalogseite;
        this.preisseite = builder.preisseite;
        this.katalogname = builder.katalogname;
        this.veranstaltername = builder.veranstaltername;
        this.veranstalterID = builder.veranstalterID;
        this.kataloghotelID = builder.kataloghotelID;
        this.katalogSaisonTyp = builder.katalogSaisonTyp;
        this.imageFiles = builder.imageFiles;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Data copy) {
        Builder builder = new Builder();
        builder.hotelName = copy.getHotelName();
        builder.hotelCategory = copy.getHotelCategory();
        builder.districtName = copy.getDistrictName();
        builder.districtNumber = copy.getDistrictNumber();
        builder.destinationName = copy.getDestinationName();
        builder.destinationNumber = copy.getDestinationNumber();
        builder.countryName = copy.getCountryName();
        builder.countryCode = copy.getCountryCode();
        builder.organizerCode = copy.getOrganizerCode();
        builder.dateStart = copy.getDateStart();
        builder.dateEnd = copy.getDateEnd();
        builder.geoData = copy.getGeoData();
        builder.objectCode = copy.getObjectCode();
        builder.text = copy.getText();
        builder.climate = copy.getClimate();
        builder.katalogID = copy.getKatalogID();
        builder.katalogseite = copy.getKatalogseite();
        builder.preisseite = copy.getPreisseite();
        builder.katalogname = copy.getKatalogname();
        builder.veranstaltername = copy.getVeranstaltername();
        builder.veranstalterID = copy.getVeranstalterID();
        builder.kataloghotelID = copy.getKataloghotelID();
        builder.katalogSaisonTyp = copy.getKatalogSaisonTyp();
        builder.imageFiles = copy.getImageFiles();
        return builder;
    }

    @JsonGetter(value = "Hotelname")
    public String getHotelName() {
        return this.hotelName;
    }

    @JsonGetter(value = "Hotelkategorie")
    public Integer getHotelCategory() {
        return this.hotelCategory;
    }

    @JsonGetter(value = "Stadtname")
    public String getDistrictName() {
        return this.districtName;
    }

    @JsonGetter(value = "Stadtnummer")
    public Integer getDistrictNumber() {
        return this.districtNumber;
    }

    @JsonGetter(value = "Zielgebietsname")
    public String getDestinationName() {
        return this.destinationName;
    }

    @JsonGetter(value = "Zielgebietsnummer")
    public Integer getDestinationNumber() {
        return this.destinationNumber;
    }

    @JsonGetter(value = "Landname")
    public String getCountryName() {
        return this.countryName;
    }

    @JsonGetter(value = "Landcode")
    public String getCountryCode() {
        return this.countryCode;
    }

    @JsonGetter(value = "Veranstaltercode")
    public String getOrganizerCode() {
        return this.organizerCode;
    }

    @JsonGetter(value = "datestart")
    public LocalDate getDateStart() {
        return this.dateStart;
    }

    @JsonGetter(value = "dateend")
    public LocalDate getDateEnd() {
        return this.dateEnd;
    }

    @JsonGetter(value = "GeoData")
    public GeoData getGeoData() {
        return this.geoData;
    }

    @JsonGetter(value = "Objectcode")
    public String getObjectCode() {
        return this.objectCode;
    }

    public Text getText() {
        return this.text;
    }

    @JsonGetter(value = "climate")
    public Climate getClimate() {
        return this.climate;
    }

    @JsonGetter(value = "KatalogID")
    public Integer getKatalogID() {
        return this.katalogID;
    }

    @JsonGetter(value = "Katalogseite")
    public Integer getKatalogseite() {
        return this.katalogseite;
    }

    @JsonGetter(value = "Preisseite")
    public Integer getPreisseite() {
        return this.preisseite;
    }

    @JsonGetter(value = "Katalogname")
    public String getKatalogname() {
        return this.katalogname;
    }

    @JsonGetter(value = "Veranstaltername")
    public String getVeranstaltername() {
        return this.veranstaltername;
    }

    @JsonGetter(value = "VeranstalterID")
    public Integer getVeranstalterID() {
        return this.veranstalterID;
    }

    @JsonGetter(value = "KataloghotelID")
    public Integer getKataloghotelID() {
        return this.kataloghotelID;
    }

    @JsonGetter(value = "KatalogSaisonTyp")
    public String getKatalogSaisonTyp() {
        return this.katalogSaisonTyp;
    }

    @JsonGetter(value = "Bildfile")
    public Set<String> getImageFiles() {
        return this.imageFiles;
    }

    public static final class Builder {
        private String hotelName;
        private Integer hotelCategory;
        private String districtName;
        private Integer districtNumber;
        private String destinationName;
        private Integer destinationNumber;
        private String countryName;
        private String countryCode;
        private String organizerCode;
        private LocalDate dateStart;
        private LocalDate dateEnd;
        private GeoData geoData;
        private String objectCode;
        private Text text;
        private Climate climate;
        private Integer katalogID;
        private Integer katalogseite;
        private Integer preisseite;
        private String katalogname;
        private String veranstaltername;
        private Integer veranstalterID;
        private Integer kataloghotelID;
        private String katalogSaisonTyp;
        private Set<String> imageFiles = new LinkedHashSet<>();

        private Builder() {
        }

        public Builder hotelName(final String val) {
            this.hotelName = val;
            return this;
        }

        public Builder hotelCategory(final Integer val) {
            this.hotelCategory = val;
            return this;
        }

        public Builder districtName(final String val) {
            this.districtName = val;
            return this;
        }

        public Builder districtNumber(final Integer val) {
            this.districtNumber = val;
            return this;
        }

        public Builder destinationName(final String val) {
            this.destinationName = val;
            return this;
        }

        public Builder destinationNumber(final Integer val) {
            this.destinationNumber = val;
            return this;
        }

        public Builder countryName(final String val) {
            this.countryName = val;
            return this;
        }

        public Builder countryCode(final String val) {
            this.countryCode = val;
            return this;
        }

        public Builder organizerCode(final String val) {
            this.organizerCode = val;
            return this;
        }

        public Builder dateStart(final LocalDate val) {
            this.dateStart = val;
            return this;
        }

        public Builder dateEnd(final LocalDate val) {
            this.dateEnd = val;
            return this;
        }

        public Builder geoData(final GeoData val) {
            this.geoData = val;
            return this;
        }

        public Builder objectCode(final String val) {
            this.objectCode = val;
            return this;
        }

        public Builder text(final Text val) {
            this.text = val;
            return this;
        }

        public Builder climate(final Climate val) {
            this.climate = val;
            return this;
        }

        public Builder katalogID(final Integer val) {
            this.katalogID = val;
            return this;
        }

        public Builder katalogseite(final Integer val) {
            this.katalogseite = val;
            return this;
        }

        public Builder preisseite(final Integer val) {
            this.preisseite = val;
            return this;
        }

        public Builder katalogname(final String val) {
            this.katalogname = val;
            return this;
        }

        public Builder veranstaltername(final String val) {
            this.veranstaltername = val;
            return this;
        }

        public Builder veranstalterID(final Integer val) {
            this.veranstalterID = val;
            return this;
        }

        public Builder kataloghotelID(final Integer val) {
            this.kataloghotelID = val;
            return this;
        }

        public Builder katalogSaisonTyp(final String val) {
            this.katalogSaisonTyp = val;
            return this;
        }

        public Builder imageFiles(final Set<String> val) {
            this.imageFiles = val;
            return this;
        }

        public Data build() {
            return new Data(this);
        }
    }
}
