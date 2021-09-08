package com.example.converter.models.objects.json.coah;

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

    public String getUrl() {
        return this.url;
    }

    public Image setUrl(final String url) {
        this.url = url;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Image)) return false;
        final Image image = (Image) o;
        return Objects.equals(url, image.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }

    @Override
    public String toString() {
        return "Image{" +
            "url='" + url + '\'' +
            '}';
    }
}
