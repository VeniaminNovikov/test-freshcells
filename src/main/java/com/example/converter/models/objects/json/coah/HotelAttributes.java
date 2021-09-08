
package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelAttributes implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Attribute> attribute;

    private String source;

    public HotelAttributes() {
        // empty
    }

    private HotelAttributes(final Builder builder) {
        attribute = builder.attribute;
        source = builder.source;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final HotelAttributes copy) {
        Builder builder = new Builder();
        builder.attribute = copy.getAttribute();
        builder.source = copy.getSource();
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
        return Objects.equals(attribute, that.attribute) && Objects.equals(source, that.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attribute, source);
    }

    @Override
    public String toString() {
        return "HotelAttributes{" +
            "attribute=" + attribute +
            ", source='" + source + '\'' +
            '}';
    }

    public static final class Builder {
        private List<Attribute> attribute;
        private String source;

        private Builder() {
        }

        public Builder attribute(final List<Attribute> val) {
            attribute = val;
            return this;
        }

        public Builder source(final String val) {
            source = val;
            return this;
        }

        public HotelAttributes build() {
            return new HotelAttributes(this);
        }
    }
}
