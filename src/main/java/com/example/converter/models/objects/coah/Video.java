
package com.example.converter.models.objects.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Video implements Serializable {
    private static final long serialVersionUID = 1L;

    private String source;
    private String priority;
    private String hasPlayer;
    private Map<String, String> urls = new LinkedHashMap<>();

    public Video() {
        // empty
    }

    private Video(final Builder builder) {
        this.source = builder.source;
        this.priority = builder.priority;
        this.hasPlayer = builder.hasPlayer;
        this.urls = builder.urls;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Video copy) {
        Builder builder = new Builder();
        builder.source = copy.getSource();
        builder.priority = copy.getPriority();
        builder.hasPlayer = copy.getHasPlayer();
        builder.urls = copy.getUrls();
        return builder;
    }

    public Map<String, String> getUrls() {
        return this.urls;
    }

    public String getSource() {
        return this.source;
    }

    public String getPriority() {
        return this.priority;
    }

    public String getHasPlayer() {
        return this.hasPlayer;
    }

    public static final class Builder {
        private String source;
        private String priority;
        private String hasPlayer;
        private Map<String, String> urls;

        private Builder() {
        }

        public Builder source(final String val) {
            this.source = val;
            return this;
        }

        public Builder priority(final String val) {
            this.priority = val;
            return this;
        }

        public Builder hasPlayer(final String val) {
            this.hasPlayer = val;
            return this;
        }

        public Builder urls(final Map<String, String> val) {
            this.urls = val;
            return this;
        }

        public Video build() {
            return new Video(this);
        }
    }
}
