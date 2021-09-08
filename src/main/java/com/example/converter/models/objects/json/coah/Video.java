
package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Video implements Serializable {
    private static final long serialVersionUID = 1L;

    private final Map<String, String> urls = new LinkedHashMap<>();
    private String source;
    private String priority;
    private String hasPlayer;

    public Video() {
        // empty
    }

    private Video(final Builder builder) {
        urls.putAll(builder.urls);
        source = builder.source;
        priority = builder.priority;
        hasPlayer = builder.hasPlayer;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Video copy) {
        Builder builder = new Builder();
        builder.urls = copy.getUrls();
        builder.source = copy.getSource();
        builder.priority = copy.getPriority();
        builder.hasPlayer = copy.getHasPlayer();
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
        private Map<String, String> urls;
        private String source;
        private String priority;
        private String hasPlayer;

        private Builder() {
        }

        public Builder urls(final Map<String, String> val) {
            urls = val;
            return this;
        }

        public Builder source(final String val) {
            source = val;
            return this;
        }

        public Builder priority(final String val) {
            priority = val;
            return this;
        }

        public Builder hasPlayer(final String val) {
            hasPlayer = val;
            return this;
        }

        public Video build() {
            return new Video(this);
        }
    }
}
