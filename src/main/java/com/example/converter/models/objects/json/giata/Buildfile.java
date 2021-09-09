package com.example.converter.models.objects.json.giata;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Buildfile implements Serializable {
    private static final long serialVersionUID = 1L;

    private String typ;
    private Integer seq;
    private Integer size;
    private Integer width;
    private Integer height;
    private String id;
    private String url;

    public Buildfile() {
        // empty
    }

    private Buildfile(final Builder builder) {
        this.typ = builder.typ;
        this.seq = builder.seq;
        this.size = builder.size;
        this.width = builder.width;
        this.height = builder.height;
        this.id = builder.id;
        this.url = builder.url;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Buildfile copy) {
        Builder builder = new Builder();
        builder.typ = copy.getTyp();
        builder.seq = copy.getSeq();
        builder.size = copy.getSize();
        builder.width = copy.getWidth();
        builder.height = copy.getHeight();
        builder.id = copy.getId();
        builder.url = copy.getUrl();
        return builder;
    }

    public String getTyp() {
        return this.typ;
    }

    public Integer getSeq() {
        return this.seq;
    }

    public Integer getSize() {
        return this.size;
    }

    public Integer getWidth() {
        return this.width;
    }

    public Integer getHeight() {
        return this.height;
    }

    public String getId() {
        return this.id;
    }

    @JsonGetter(value = "Bildfile")
    public String getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Buildfile)) return false;
        final Buildfile buildfile = (Buildfile) o;
        return Objects.equals(this.typ, buildfile.typ)
            && Objects.equals(this.seq, buildfile.seq)
            && Objects.equals(this.size, buildfile.size)
            && Objects.equals(this.width, buildfile.width)
            && Objects.equals(this.height, buildfile.height)
            && Objects.equals(this.id, buildfile.id)
            && Objects.equals(this.url, buildfile.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.typ, this.seq, this.size, this.width, this.height, this.id, this.url);
    }

    @Override
    public String toString() {
        return "Buildfile{" +
            "typ='" + this.typ + '\'' +
            ", seq=" + this.seq +
            ", size=" + this.size +
            ", width=" + this.width +
            ", height=" + this.height +
            ", id='" + this.id + '\'' +
            ", url='" + this.url + '\'' +
            '}';
    }

    public static final class Builder {
        private String typ;
        private Integer seq;
        private Integer size;
        private Integer width;
        private Integer height;
        private String id;
        private String url;

        private Builder() {
        }

        public Builder typ(final String val) {
            this.typ = val;
            return this;
        }

        public Builder seq(final Integer val) {
            this.seq = val;
            return this;
        }

        public Builder size(final Integer val) {
            this.size = val;
            return this;
        }

        public Builder width(final Integer val) {
            this.width = val;
            return this;
        }

        public Builder height(final Integer val) {
            this.height = val;
            return this;
        }

        public Builder id(final String val) {
            this.id = val;
            return this;
        }

        public Builder url(final String val) {
            this.url = val;
            return this;
        }

        public Buildfile build() {
            return new Buildfile(this);
        }
    }
}
