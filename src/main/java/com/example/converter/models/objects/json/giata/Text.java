
package com.example.converter.models.objects.json.giata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Text implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String value;
    protected String lang;

    public Text() {
        // empty
    }

    private Text(final Builder builder) {
        this.value = builder.value;
        this.lang = builder.lang;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Text copy) {
        Builder builder = new Builder();
        builder.value = copy.getValue();
        builder.lang = copy.getLang();
        return builder;
    }

    public String getValue() {
        return this.value;
    }

    public String getLang() {
        return this.lang;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Text)) return false;
        final Text text = (Text) o;
        return Objects.equals(this.value, text.value) && Objects.equals(this.lang, text.lang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value, this.lang);
    }

    @Override
    public String toString() {
        return "Text{" +
            "value='" + this.value + '\'' +
            ", lang='" + this.lang + '\'' +
            '}';
    }

    public static final class Builder {
        private String value;
        private String lang;

        private Builder() {
        }

        public Builder value(final String val) {
            this.value = val;
            return this;
        }

        public Builder lang(final String val) {
            this.lang = val;
            return this;
        }

        public Text build() {
            return new Text(this);
        }
    }
}
