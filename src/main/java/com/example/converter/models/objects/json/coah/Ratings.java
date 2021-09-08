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

//    @XmlAttribute(name = "source")
//    @JacksonXmlProperty(isAttribute=true)
    private String source;
    private Integer hcId;
    private Double recommendationRate;
    private Double rating;
    private Integer reviews;
    private String url;
    private final Map<String, DetailedRating> detailedRating = new LinkedHashMap<>();

    public Ratings() {
        // empty
    }

    private Ratings(final Builder builder) {
        source = builder.source;
        hcId = builder.hcId;
        recommendationRate = builder.recommendationRate;
        rating = builder.rating;
        reviews = builder.reviews;
        url = builder.url;
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
        return Objects.equals(source, ratings.source)
            && Objects.equals(hcId, ratings.hcId)
            && Objects.equals(recommendationRate, ratings.recommendationRate)
            && Objects.equals(rating, ratings.rating)
            && Objects.equals(reviews, ratings.reviews)
            && Objects.equals(url, ratings.url)
            && Objects.equals(detailedRating, ratings.detailedRating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, hcId, recommendationRate, rating, reviews, url, detailedRating);
    }

    @Override
    public String toString() {
        return "Ratings{" +
            "source='" + source + '\'' +
            ", hcId=" + hcId +
            ", recommendationRate=" + recommendationRate +
            ", rating=" + rating +
            ", reviews=" + reviews +
            ", url='" + url + '\'' +
            ", detailedRating=" + detailedRating +
            '}';
    }

    public static final class Builder {
        private String source;
        private Integer hcId;
        private Double recommendationRate;
        private Double rating;
        private Integer reviews;
        private String url;

        private Builder() {
        }

        public Builder source(final String val) {
            source = val;
            return this;
        }

        public Builder hcId(final Integer val) {
            hcId = val;
            return this;
        }

        public Builder recommendationRate(final Double val) {
            recommendationRate = val;
            return this;
        }

        public Builder rating(final Double val) {
            rating = val;
            return this;
        }

        public Builder reviews(final Integer val) {
            reviews = val;
            return this;
        }

        public Builder url(final String val) {
            url = val;
            return this;
        }

        public Ratings build() {
            return new Ratings(this);
        }
    }
}
