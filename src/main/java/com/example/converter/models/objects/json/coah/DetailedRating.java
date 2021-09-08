package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DetailedRating implements Serializable {
    private static final long serialVersionUID = 1L;

    private Double overall;
    private Double single;
    private Double couple;
    private Double family;
    private Double friends;
    private Double beach;
    private Double wintersport;
    private Double other;

    public DetailedRating() {
        // empty
    }

    public Double getOverall() {
        return this.overall;
    }

    public Double getSingle() {
        return this.single;
    }

    public Double getCouple() {
        return this.couple;
    }

    public Double getFamily() {
        return this.family;
    }

    public Double getFriends() {
        return this.friends;
    }

    public Double getBeach() {
        return this.beach;
    }

    public Double getWintersport() {
        return this.wintersport;
    }

    public Double getOther() {
        return this.other;
    }
}
