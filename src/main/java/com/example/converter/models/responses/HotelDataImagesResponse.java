package com.example.converter.models.responses;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class HotelDataImagesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Set<String> urls;

    public HotelDataImagesResponse() {
        // empty
    }

    private HotelDataImagesResponse(final Builder builder) {
        name = builder.name;
        urls = builder.urls;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final HotelDataImagesResponse copy) {
        Builder builder = new Builder();
        builder.name = copy.getName();
        builder.urls = copy.getUrls();
        return builder;
    }

    public String getName() {
        return this.name;
    }

    public Set<String> getUrls() {
        return this.urls;
    }

    public static final class Builder {
        private String name;
        private Set<String> urls;

        private Builder() {
        }

        public Builder name(final String val) {
            name = val;
            return this;
        }

        public Builder urls(final Set<String> val) {
            urls = val != null ? val : new LinkedHashSet<>();
            return this;
        }

        public HotelDataImagesResponse build() {
            return new HotelDataImagesResponse(this);
        }
    }
}
