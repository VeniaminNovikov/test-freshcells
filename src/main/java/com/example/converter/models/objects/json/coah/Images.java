package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Images implements Serializable {
    private static final long serialVersionUID = 1L;

//    @JacksonXmlElementWrapper(useWrapping = false)
    private final Set<Image> image = new HashSet<>();

    public Images() {
        // empty
    }

    public Set<Image> getImage() {
        return this.image;
    }

    public Images setImage(final Set<Image> val) {
        this.image.addAll(val);
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Images)) return false;
        final Images images = (Images) o;
        return Objects.equals(image, images.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image);
    }

    @Override
    public String toString() {
        return "Images{" +
            "image=" + image +
            '}';
    }


}
