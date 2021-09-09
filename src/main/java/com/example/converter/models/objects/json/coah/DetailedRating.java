package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

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

    private DetailedRating(final Builder builder) {
        this.overall = builder.overall;
        this.single = builder.single;
        this.couple = builder.couple;
        this.family = builder.family;
        this.friends = builder.friends;
        this.beach = builder.beach;
        this.wintersport = builder.wintersport;
        this.other = builder.other;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final DetailedRating copy) {
        Builder builder = new Builder();
        builder.overall = copy.getOverall();
        builder.single = copy.getSingle();
        builder.couple = copy.getCouple();
        builder.family = copy.getFamily();
        builder.friends = copy.getFriends();
        builder.beach = copy.getBeach();
        builder.wintersport = copy.getWintersport();
        builder.other = copy.getOther();
        return builder;
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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof DetailedRating)) return false;
        final DetailedRating that = (DetailedRating) o;
        return Objects.equals(this.overall, that.overall)
            && Objects.equals(this.single, that.single)
            && Objects.equals(this.couple, that.couple)
            && Objects.equals(this.family, that.family)
            && Objects.equals(this.friends, that.friends)
            && Objects.equals(this.beach, that.beach)
            && Objects.equals(this.wintersport, that.wintersport)
            && Objects.equals(this.other, that.other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.overall, this.single, this.couple, this.family, this.friends, this.beach, this.wintersport, this.other);
    }

    @Override
    public String toString() {
        return "DetailedRating{" +
            "overall=" + this.overall +
            ", single=" + this.single +
            ", couple=" + this.couple +
            ", family=" + this.family +
            ", friends=" + this.friends +
            ", beach=" + this.beach +
            ", wintersport=" + this.wintersport +
            ", other=" + this.other +
            '}';
    }

    public static final class Builder {
        private Double overall;
        private Double single;
        private Double couple;
        private Double family;
        private Double friends;
        private Double beach;
        private Double wintersport;
        private Double other;

        private Builder() {
        }

        public Builder overall(final Double val) {
            this.overall = val;
            return this;
        }

        public Builder single(final Double val) {
            this.single = val;
            return this;
        }

        public Builder couple(final Double val) {
            this.couple = val;
            return this;
        }

        public Builder family(final Double val) {
            this.family = val;
            return this;
        }

        public Builder friends(final Double val) {
            this.friends = val;
            return this;
        }

        public Builder beach(final Double val) {
            this.beach = val;
            return this;
        }

        public Builder wintersport(final Double val) {
            this.wintersport = val;
            return this;
        }

        public Builder other(final Double val) {
            this.other = val;
            return this;
        }

        public DetailedRating build() {
            return new DetailedRating(this);
        }
    }
}
