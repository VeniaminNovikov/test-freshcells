package com.example.converter.models.objects.json.coah;

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

@JsonDeserialize(using = AttributesDeserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Attributes implements Serializable {
    private static final long serialVersionUID = 1L;

    private String source;
    private final List<Category> category = new LinkedList<>();
    private final Map<String, String> container = new LinkedHashMap<>();

    public Attributes() {
        // empty
    }

    private Attributes(final Builder builder) {
        source = builder.source;
        category.addAll(builder.category);
        container.putAll(builder.container);
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

    public static final class Builder {
        private String source;
        private List<Category> category;
        private Map<String, String> container;

        private Builder() {
        }

        public Builder source(final String val) {
            source = val;
            return this;
        }

        public Builder category(final List<Category> val) {
            category = val;
            return this;
        }

        public Builder container(final Map<String, String>  val) {
            container = val;
            return this;
        }

        public Attributes build() {
            return new Attributes(this);
        }
    }
}
