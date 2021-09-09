
package com.example.converter.models.objects.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Texts implements Serializable {
    private static final long serialVersionUID = 1L;

    private Text text;

    public Texts() {
        // empty
    }

    private Texts(final Builder builder) {
        this.text = builder.text;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Texts copy) {
        Builder builder = new Builder();
        builder.text = copy.getText();
        return builder;
    }

    public Text getText() {
        return this.text;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Texts)) return false;
        final Texts texts = (Texts) o;
        return Objects.equals(this.text, texts.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.text);
    }

    @Override
    public String toString() {
        return "Texts{" +
            "text=" + this.text +
            '}';
    }

    public static final class Builder {
        private Text text;

        private Builder() {
        }

        public Builder text(final Text val) {
            this.text = val;
            return this;
        }

        public Texts build() {
            return new Texts(this);
        }
    }
}
