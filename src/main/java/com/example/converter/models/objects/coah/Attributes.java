package com.example.converter.models.objects.coah;

import com.example.converter.converters.deserializers.AttributesDeserializer;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonDeserialize(using = AttributesDeserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Attributes implements Serializable {
    private static final long serialVersionUID = 1L;

    private String source;
    private List<Category> category = new LinkedList<>();
    private Map<String, String> container = new LinkedHashMap<>();

    public Attributes() {
        // empty
    }

    private Attributes(final Builder builder) {
        this.source = builder.source;
        this.category = builder.category;
        this.container = builder.container;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Attributes copy) {
        Builder builder = new Builder();
        builder.source = copy.getSource();
        builder.category = copy.getCategory();
        builder.container = copy.getContainer();
        return builder;
    }

    public String getSource() {
        return this.source;
    }

    @JsonGetter(value = "category")
    public List<Category> getCategory() {
        return this.category;
    }

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonGetter(value = "@attributes")
    @JsonUnwrapped
    public Map<String, String> getContainer() {
        return this.container;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Attributes)) return false;
        final Attributes that = (Attributes) o;
        return Objects.equals(this.source, that.source)
            && Objects.equals(this.category, that.category)
            && Objects.equals(this.container, that.container);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.source, this.category, this.container);
    }

    @Override
    public String toString() {
        return "Attributes{" +
            "source='" + this.source + '\'' +
            ", category=" + this.category +
            ", container=" + this.container +
            '}';
    }

    public static final class Builder {
        private String source;
        private List<Category> category;
        private Map<String, String> container;

        private Builder() {
        }

        public Builder source(final String val) {
            this.source = val;
            return this;
        }

        public Builder category(final List<Category> val) {
            this.category = val;
            return this;
        }

        public Builder container(final Map<String, String> val) {
            this.container = val;
            return this;
        }

        public Attributes build() {
            return new Attributes(this);
        }
    }
}
