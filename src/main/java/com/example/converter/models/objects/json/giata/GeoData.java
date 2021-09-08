package com.example.converter.models.objects.json.giata;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoData implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer giataId;
    private Double latitude;
    private Double longitude;
    private Integer accuracy;

    public GeoData() {
        // empty
    }

    @JsonGetter(value = "GiataID")
    public Integer getGiataId() {
        return this.giataId;
    }

    @JsonGetter(value = "Latitude")
    public Double getLatitude() {
        return this.latitude;
    }

    @JsonGetter(value = "Longitude")
    public Double getLongitude() {
        return this.longitude;
    }

    @JsonGetter(value = "Accuracy")
    public Integer getAccuracy() {
        return this.accuracy;
    }
}
