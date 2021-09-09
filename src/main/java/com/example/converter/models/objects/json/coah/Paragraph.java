
package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Paragraph implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String value;
    protected String headline;
    protected String description;
    protected String content;

    public Paragraph() {
        // empty
    }

    private Paragraph(final Builder builder) {
        this.value = builder.value;
        this.headline = builder.headline;
        this.description = builder.description;
        this.content = builder.content;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Paragraph copy) {
        Builder builder = new Builder();
        builder.value = copy.getValue();
        builder.headline = copy.getHeadline();
        builder.description = copy.getDescription();
        builder.content = copy.getContent();
        return builder;
    }

    public String getValue() {
        return this.value;
    }

    public String getHeadline() {
        return this.headline;
    }

    public String getDescription() {
        return this.description;
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Paragraph)) return false;
        final Paragraph paragraph = (Paragraph) o;
        return Objects.equals(this.value, paragraph.value)
            && Objects.equals(this.headline, paragraph.headline)
            && Objects.equals(this.description, paragraph.description)
            && Objects.equals(this.content, paragraph.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value, this.headline, this.description, this.content);
    }

    @Override
    public String toString() {
        return "Paragraph{" +
            "value='" + this.value + '\'' +
            ", headline='" + this.headline + '\'' +
            ", description='" + this.description + '\'' +
            ", content='" + this.content + '\'' +
            '}';
    }

    public static final class Builder {
        private String value;
        private String headline;
        private String description;
        private String content;

        private Builder() {
        }

        public Builder value(final String val) {
            this.value = val;
            return this;
        }

        public Builder headline(final String val) {
            this.headline = val;
            return this;
        }

        public Builder description(final String val) {
            this.description = val;
            return this;
        }

        public Builder content(final String val) {
            this.content = val;
            return this;
        }

        public Paragraph build() {
            return new Paragraph(this);
        }
    }
}
