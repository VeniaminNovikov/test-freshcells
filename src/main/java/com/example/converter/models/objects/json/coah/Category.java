package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;

    private List<Object> attributes = new LinkedList<>();

    private transient Object container;

    public Category() {
        // empty
    }

    private Category(final Builder builder) {
        this.name = builder.name;
        this.attributes = builder.attributes;
        this.container = builder.container;
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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        final Category category = (Category) o;
        return Objects.equals(this.name, category.name)
            && Objects.equals(this.attributes, category.attributes)
            && Objects.equals(this.container, category.container);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.attributes, this.container);
    }

    @Override
    public String toString() {
        return "Category{" +
            "name='" + this.name + '\'' +
            ", attributes=" + this.attributes +
            ", container=" + this.container +
            '}';
    }

    public static final class Builder {
        private String name;
        private List<Object> attributes;
        private Object container;

        private Builder() {
        }

        public Builder name(final String val) {
            this.name = val;
            return this;
        }

        public Builder attributes(final List<Object> val) {
            this.attributes = val;
            return this;
        }

        public Builder container(final Object val) {
            this.container = val;
            return this;
        }

        public Category build() {
            return new Category(this);
        }
    }
}
