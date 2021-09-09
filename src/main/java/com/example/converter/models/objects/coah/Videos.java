package com.example.converter.models.objects.coah;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Videos implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Video> video = new LinkedList<>();

    public Videos() {
        // empty
    }

    private Videos(final Builder builder) {
        this.video = builder.video;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Videos copy) {
        Builder builder = new Builder();
        builder.video = copy.getVideo();
        return builder;
    }

    @JsonGetter(value = "urls")
    public List<Video> getVideo() {
        return this.video;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Videos)) return false;
        final Videos videos = (Videos) o;
        return Objects.equals(this.video, videos.video);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.video);
    }

    @Override
    public String toString() {
        return "Videos{" +
            "video=" + this.video +
            '}';
    }

    public static final class Builder {
        private List<Video> video;

        private Builder() {
        }

        public Builder video(final List<Video> val) {
            this.video = val;
            return this;
        }

        public Videos build() {
            return new Videos(this);
        }
    }
}
