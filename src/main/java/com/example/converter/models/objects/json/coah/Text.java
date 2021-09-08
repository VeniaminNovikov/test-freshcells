
package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Text implements Serializable {
    private static final long serialVersionUID = 1L;

    private final List<Paragraph> paragraph = new LinkedList<>();
    private String copyrightText;
    private String tourOperator;
    private String source;
    private String tourOperatorLong;
    private String id;
    private String name;

    public Text() {
        // empty
    }

    private Text(final Builder builder) {
        copyrightText = builder.copyrightText;
        tourOperator = builder.tourOperator;
        source = builder.source;
        tourOperatorLong = builder.tourOperatorLong;
        id = builder.id;
        name = builder.name;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Text copy) {
        Builder builder = new Builder();
        builder.copyrightText = copy.getCopyrightText();
        builder.tourOperator = copy.getTourOperator();
        builder.source = copy.getSource();
        builder.tourOperatorLong = copy.getTourOperatorLong();
        builder.id = copy.getId();
        builder.name = copy.getName();
        return builder;
    }

    public List<Paragraph> getParagraph() {
        return this.paragraph;
    }

    public String getCopyrightText() {
        return this.copyrightText;
    }

    public String getTourOperator() {
        return this.tourOperator;
    }

    public String getSource() {
        return this.source;
    }

    public String getTourOperatorLong() {
        return this.tourOperatorLong;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Text)) return false;
        final Text text = (Text) o;
        return Objects.equals(paragraph, text.paragraph)
            && Objects.equals(copyrightText, text.copyrightText)
            && Objects.equals(tourOperator, text.tourOperator)
            && Objects.equals(source, text.source)
            && Objects.equals(tourOperatorLong, text.tourOperatorLong)
            && Objects.equals(id, text.id)
            && Objects.equals(name, text.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paragraph, copyrightText, tourOperator, source, tourOperatorLong, id, name);
    }

    @Override
    public String toString() {
        return "Text{" +
            "paragraph=" + paragraph +
            ", copyrightText='" + copyrightText + '\'' +
            ", tourOperator='" + tourOperator + '\'' +
            ", source='" + source + '\'' +
            ", tourOperatorLong='" + tourOperatorLong + '\'' +
            ", id='" + id + '\'' +
            ", name='" + name + '\'' +
            '}';
    }

    public static final class Builder {
        private String copyrightText;
        private String tourOperator;
        private String source;
        private String tourOperatorLong;
        private String id;
        private String name;

        private Builder() {
        }

        public Builder copyrightText(final String val) {
            copyrightText = val;
            return this;
        }

        public Builder tourOperator(final String val) {
            tourOperator = val;
            return this;
        }

        public Builder source(final String val) {
            source = val;
            return this;
        }

        public Builder tourOperatorLong(final String val) {
            tourOperatorLong = val;
            return this;
        }

        public Builder id(final String val) {
            id = val;
            return this;
        }

        public Builder name(final String val) {
            name = val;
            return this;
        }

        public Text build() {
            return new Text(this);
        }
    }
}
