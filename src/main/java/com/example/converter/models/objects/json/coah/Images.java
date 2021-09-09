package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Images implements Serializable {
    private static final long serialVersionUID = 1L;

    private Set<Image> image = new LinkedHashSet<>();

    public Images() {
        // empty
    }

    private Images(final Builder builder) {
        this.image = builder.image;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Images copy) {
        Builder builder = new Builder();
        builder.image = copy.getImage();
        return builder;
    }

    public Set<Image> getImage() {
        return this.image;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Images)) return false;
        final Images images = (Images) o;
        return Objects.equals(this.image, images.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.image);
    }

    @Override
    public String toString() {
        return "Images{" +
            "image=" + this.image +
            '}';
    }

    public static final class Builder {
        private Set<Image> image;

        private Builder() {
        }

        public Builder image(final Set<Image> val) {
            this.image = val;
            return this;
        }

        public Images build() {
            return new Images(this);
        }
    }
}
