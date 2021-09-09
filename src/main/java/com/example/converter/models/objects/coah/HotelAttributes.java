
package com.example.converter.models.objects.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelAttributes implements Serializable {
    private static final long serialVersionUID = 1L;

    private String source;
    private List<Attribute> attribute = new LinkedList<>();

    public HotelAttributes() {
        // empty
    }

    private HotelAttributes(final Builder builder) {
        this.source = builder.source;
        this.attribute = builder.attribute;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final HotelAttributes copy) {
        Builder builder = new Builder();
        builder.source = copy.getSource();
        builder.attribute = copy.getAttribute();
        return builder;
    }

    public List<Attribute> getAttribute() {
        return this.attribute;
    }

    public String getSource() {
        return this.source;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof HotelAttributes)) return false;
        final HotelAttributes that = (HotelAttributes) o;
        return Objects.equals(this.attribute, that.attribute) && Objects.equals(this.source, that.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.attribute, this.source);
    }

    @Override
    public String toString() {
        return "HotelAttributes{" +
            "attribute=" + this.attribute +
            ", source='" + this.source + '\'' +
            '}';
    }

    public static final class Builder {
        private String source;
        private List<Attribute> attribute;

        private Builder() {
        }

        public Builder source(final String val) {
            this.source = val;
            return this;
        }

        public Builder attribute(final List<Attribute> val) {
            this.attribute = val;
            return this;
        }

        public HotelAttributes build() {
            return new HotelAttributes(this);
        }
    }
}
