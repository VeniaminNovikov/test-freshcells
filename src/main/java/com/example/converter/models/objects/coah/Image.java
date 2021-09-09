package com.example.converter.models.objects.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Image implements Serializable {
    private static final long serialVersionUID = 1L;

    private String url;

    public Image() {
        // empty
    }

    private Image(final Builder builder) {
        this.url = builder.url;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Image copy) {
        Builder builder = new Builder();
        builder.url = copy.getUrl();
        return builder;
    }

    public String getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Image)) return false;
        final Image image = (Image) o;
        return Objects.equals(this.url, image.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.url);
    }

    @Override
    public String toString() {
        return "Image{" +
            "url='" + this.url + '\'' +
            '}';
    }

    public static final class Builder {
        private String url;

        private Builder() {
        }

        public Builder url(final String val) {
            this.url = val;
            return this;
        }

        public Image build() {
            return new Image(this);
        }
    }
}
