package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;

    private final List<Object> attributes = new LinkedList<>();

    private transient Object container;

    public Category() {
        // empty
    }

    private Category(final Builder builder) {
        name = builder.name;
        attributes.addAll(builder.attributes);
        container = builder.container;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Category copy) {
        Builder builder = new Builder();
        builder.name = copy.getName();
        builder.attributes = copy.getAttributes();
        builder.container = copy.getContainer();
        return builder;
    }

    public String getName() {
        return this.name;
    }

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonGetter(value = "attribute")
    public List<Object> getAttributes() {
        return this.attributes;
    }

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonGetter(value = "@attributes")
    @JsonUnwrapped
    public Object getContainer() {
        return this.container;
    }

    public static final class Builder {
        private String name;
        private List<Object> attributes;
        private Object container;

        private Builder() {
        }

        public Builder name(final String val) {
            name = val;
            return this;
        }

        public Builder attributes(final List<Object> val) {
            attributes = val;
            return this;
        }

        public Builder container(final Object val) {
            container = val;
            return this;
        }

        public Category build() {
            return new Category(this);
        }
    }
}
