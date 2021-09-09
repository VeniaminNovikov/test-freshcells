package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ratings implements Serializable {
    private static final long serialVersionUID = 1L;

    private String source;
    private Integer hcId;
    private Double recommendationRate;
    private Double rating;
    private Integer reviews;
    private String url;
    private Map<String, DetailedRating> detailedRating = new LinkedHashMap<>();

    public Ratings() {
        // empty
    }

    private Ratings(final Builder builder) {
        this.source = builder.source;
        this.hcId = builder.hcId;
        this.recommendationRate = builder.recommendationRate;
        this.rating = builder.rating;
        this.reviews = builder.reviews;
        this.url = builder.url;
        this.detailedRating = builder.detailedRating;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Ratings copy) {
        Builder builder = new Builder();
        builder.source = copy.getSource();
        builder.hcId = copy.getHcId();
        builder.recommendationRate = copy.getRecommendationRate();
        builder.rating = copy.getRating();
        builder.reviews = copy.getReviews();
        builder.url = copy.getUrl();
        builder.detailedRating = copy.getDetailedRating();
        return builder;
    }

    public String getSource() {
        return this.source;
    }

    @JsonGetter(value = "hc_id")
    public Integer getHcId() {
        return this.hcId;
    }

    @JsonGetter(value = "recommendation_rate")
    public Double getRecommendationRate() {
        return this.recommendationRate;
    }

    public Double getRating() {
        return this.rating;
    }

    public Integer getReviews() {
        return this.reviews;
    }

    public String getUrl() {
        return this.url;
    }

    public Map<String, DetailedRating> getDetailedRating() {
        return this.detailedRating;
    }

    @JsonAnySetter
    public void addDetailedRating(String key, DetailedRating value) {
        this.detailedRating.put(key, value);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Ratings)) return false;
        final Ratings ratings = (Ratings) o;
        return Objects.equals(this.source, ratings.source)
            && Objects.equals(this.hcId, ratings.hcId)
            && Objects.equals(this.recommendationRate, ratings.recommendationRate)
            && Objects.equals(this.rating, ratings.rating)
            && Objects.equals(this.reviews, ratings.reviews)
            && Objects.equals(this.url, ratings.url)
            && Objects.equals(this.detailedRating, ratings.detailedRating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.source, this.hcId, this.recommendationRate, this.rating, this.reviews, this.url, this.detailedRating);
    }

    @Override
    public String toString() {
        return "Ratings{" +
            "source='" + this.source + '\'' +
            ", hcId=" + this.hcId +
            ", recommendationRate=" + this.recommendationRate +
            ", rating=" + this.rating +
            ", reviews=" + this.reviews +
            ", url='" + this.url + '\'' +
            ", detailedRating=" + this.detailedRating +
            '}';
    }

    public static final class Builder {
        private String source;
        private Integer hcId;
        private Double recommendationRate;
        private Double rating;
        private Integer reviews;
        private String url;
        private Map<String, DetailedRating> detailedRating;

        private Builder() {
        }

        public Builder source(final String val) {
            this.source = val;
            return this;
        }

        public Builder hcId(final Integer val) {
            this.hcId = val;
            return this;
        }

        public Builder recommendationRate(final Double val) {
            this.recommendationRate = val;
            return this;
        }

        public Builder rating(final Double val) {
            this.rating = val;
            return this;
        }

        public Builder reviews(final Integer val) {
            this.reviews = val;
            return this;
        }

        public Builder url(final String val) {
            this.url = val;
            return this;
        }

        public Builder detailedRating(final Map<String, DetailedRating> val) {
            this.detailedRating = val;
            return this;
        }

        public Ratings build() {
            return new Ratings(this);
        }
    }
}
