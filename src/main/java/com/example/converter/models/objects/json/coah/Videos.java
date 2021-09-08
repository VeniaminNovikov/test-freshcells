package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Videos implements Serializable {
    private static final long serialVersionUID = 1L;

//    @JacksonXmlElementWrapper(useWrapping = false)
    private final List<Video> video = new LinkedList<>();

    public Videos() {
        // empty
    }

    @JsonGetter(value = "urls")
    public List<Video> getVideo() {
        return this.video;
    }

    public Videos setVideo(final List<Video> video) {
        this.video.addAll(video);
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Videos)) return false;
        final Videos videos = (Videos) o;
        return Objects.equals(video, videos.video);
    }

    @Override
    public int hashCode() {
        return Objects.hash(video);
    }

    @Override
    public String toString() {
        return "Videos{" +
            "video=" + video +
            '}';
    }
}
