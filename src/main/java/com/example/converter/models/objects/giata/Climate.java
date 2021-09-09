package com.example.converter.models.objects.giata;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Climate implements Serializable {
    private static final long serialVersionUID = 1L;

    private String kind;
    private Integer id;
    private Map<String, Integer> dayTemperature = new LinkedHashMap<>();
    private Map<String, Integer> nightTemperature = new LinkedHashMap<>();
    private Map<String, Integer> sunshine = new LinkedHashMap<>();
    private Map<String, Integer> rainDay = new LinkedHashMap<>();
    private Map<String, Integer> waterTemperature = new LinkedHashMap<>();

    private Climate(final Builder builder) {
        this.kind = builder.kind;
        this.id = builder.id;
        this.dayTemperature = builder.dayTemperature;
        this.nightTemperature = builder.nightTemperature;
        this.sunshine = builder.sunshine;
        this.rainDay = builder.rainDay;
        this.waterTemperature = builder.waterTemperature;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Climate copy) {
        Builder builder = new Builder();
        builder.kind = copy.getKind();
        builder.id = copy.getId();
        builder.dayTemperature = copy.getDayTemperature();
        builder.nightTemperature = copy.getNightTemperature();
        builder.sunshine = copy.getSunshine();
        builder.rainDay = copy.getRainDay();
        builder.waterTemperature = copy.getWaterTemperature();
        return builder;
    }

    public String getKind() {
        return this.kind;
    }

    public Integer getId() {
        return this.id;
    }

    public Climate() {
        // empty
    }

    @JsonGetter(value = "day_temperature")
    public Map<String, Integer> getDayTemperature() {
        return this.dayTemperature;
    }

    @JsonGetter(value = "night_temperature")
    public Map<String, Integer> getNightTemperature() {
        return this.nightTemperature;
    }

    @JsonGetter(value = "sunshine")
    public Map<String, Integer> getSunshine() {
        return this.sunshine;
    }

    @JsonGetter(value = "rainday")
    public Map<String, Integer> getRainDay() {
        return this.rainDay;
    }

    @JsonGetter(value = "water_temperature")
    public Map<String, Integer> getWaterTemperature() {
        return this.waterTemperature;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Climate)) return false;
        final Climate climate = (Climate) o;
        return Objects.equals(this.kind, climate.kind)
            && Objects.equals(this.id, climate.id)
            && Objects.equals(this.dayTemperature, climate.dayTemperature)
            && Objects.equals(this.nightTemperature, climate.nightTemperature)
            && Objects.equals(this.sunshine, climate.sunshine)
            && Objects.equals(this.rainDay, climate.rainDay)
            && Objects.equals(this.waterTemperature, climate.waterTemperature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.kind, this.id, this.dayTemperature, this.nightTemperature, this.sunshine, this.rainDay, this.waterTemperature);
    }

    @Override
    public String toString() {
        return "Climate{" +
            "kind='" + this.kind + '\'' +
            ", id=" + this.id +
            ", dayTemperature=" + this.dayTemperature +
            ", nightTemperature=" + this.nightTemperature +
            ", sunshine=" + this.sunshine +
            ", rainDay=" + this.rainDay +
            ", waterTemperature=" + this.waterTemperature +
            '}';
    }

    public static final class Builder {
        private String kind;
        private Integer id;
        private Map<String, Integer> dayTemperature;
        private Map<String, Integer> nightTemperature;
        private Map<String, Integer> sunshine;
        private Map<String, Integer> rainDay;
        private Map<String, Integer> waterTemperature;

        private Builder() {
        }

        public Builder kind(final String val) {
            this.kind = val;
            return this;
        }

        public Builder id(final Integer val) {
            this.id = val;
            return this;
        }

        public Builder dayTemperature(final Map<String, Integer> val) {
            this.dayTemperature = val;
            return this;
        }

        public Builder nightTemperature(final Map<String, Integer> val) {
            this.nightTemperature = val;
            return this;
        }

        public Builder sunshine(final Map<String, Integer> val) {
            this.sunshine = val;
            return this;
        }

        public Builder rainDay(final Map<String, Integer> val) {
            this.rainDay = val;
            return this;
        }

        public Builder waterTemperature(final Map<String, Integer> val) {
            this.waterTemperature = val;
            return this;
        }

        public Climate build() {
            return new Climate(this);
        }
    }
}
