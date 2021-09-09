
package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Text implements Serializable {
    private static final long serialVersionUID = 1L;

    private String copyrightText;
    private String tourOperator;
    private String source;
    private String tourOperatorLong;
    private String id;
    private String name;
    private List<Paragraph> paragraph = new LinkedList<>();

    public Text() {
        // empty
    }

    private Text(final Builder builder) {
        this.copyrightText = builder.copyrightText;
        this.tourOperator = builder.tourOperator;
        this.source = builder.source;
        this.tourOperatorLong = builder.tourOperatorLong;
        this.id = builder.id;
        this.name = builder.name;
        this.paragraph = builder.paragraph;
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
        builder.paragraph = copy.getParagraph();
        return builder;
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

    public List<Paragraph> getParagraph() {
        return this.paragraph;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Text)) return false;
        final Text text = (Text) o;
        return Objects.equals(this.paragraph, text.paragraph)
            && Objects.equals(this.copyrightText, text.copyrightText)
            && Objects.equals(this.tourOperator, text.tourOperator)
            && Objects.equals(this.source, text.source)
            && Objects.equals(this.tourOperatorLong, text.tourOperatorLong)
            && Objects.equals(this.id, text.id)
            && Objects.equals(this.name, text.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.paragraph, this.copyrightText, this.tourOperator, this.source, this.tourOperatorLong, this.id, this.name);
    }

    @Override
    public String toString() {
        return "Text{" +
            "paragraph=" + this.paragraph +
            ", copyrightText='" + this.copyrightText + '\'' +
            ", tourOperator='" + this.tourOperator + '\'' +
            ", source='" + this.source + '\'' +
            ", tourOperatorLong='" + this.tourOperatorLong + '\'' +
            ", id='" + this.id + '\'' +
            ", name='" + this.name + '\'' +
            '}';
    }

    public static final class Builder {
        private String copyrightText;
        private String tourOperator;
        private String source;
        private String tourOperatorLong;
        private String id;
        private String name;
        private List<Paragraph> paragraph;

        private Builder() {
        }

        public Builder copyrightText(final String val) {
            this.copyrightText = val;
            return this;
        }

        public Builder tourOperator(final String val) {
            this.tourOperator = val;
            return this;
        }

        public Builder source(final String val) {
            this.source = val;
            return this;
        }

        public Builder tourOperatorLong(final String val) {
            this.tourOperatorLong = val;
            return this;
        }

        public Builder id(final String val) {
            this.id = val;
            return this;
        }

        public Builder name(final String val) {
            this.name = val;
            return this;
        }

        public Builder paragraph(final List<Paragraph> val) {
            this.paragraph = val;
            return this;
        }

        public Text build() {
            return new Text(this);
        }
    }
}
