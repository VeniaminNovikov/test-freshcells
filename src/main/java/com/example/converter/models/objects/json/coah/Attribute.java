
package com.example.converter.models.objects.json.coah;

import com.example.converter.converters.deserializers.AttributeDeserializer;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;
import java.util.Objects;

@JsonDeserialize(using = AttributeDeserializer.class)
@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Attribute implements Serializable {
    private static final long serialVersionUID = 1L;

    protected Integer priority;
    protected String rating;
    protected String usp;
    protected String value;
    private transient Object container;

    public Attribute() {
        // empty
    }

    private Attribute(final Builder builder) {
        this.priority = builder.priority;
        this.rating = builder.rating;
        this.usp = builder.usp;
        this.value = builder.value;
        this.container = builder.container;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Attribute copy) {
        Builder builder = new Builder();
        builder.priority = copy.getPriority();
        builder.rating = copy.getRating();
        builder.usp = copy.getUsp();
        builder.value = copy.getValue();
        builder.container = copy.getContainer();
        return builder;
    }

    public String getValue() {
        return this.value;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public String getRating() {
        return this.rating;
    }

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonGetter(value = "@attributes")
    @JsonUnwrapped
    public Object getContainer() {
        return this.container;
    }

    public String getUsp() {
        return this.usp;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Attribute)) return false;
        final Attribute attribute = (Attribute) o;
        return Objects.equals(this.priority, attribute.priority)
            && Objects.equals(this.rating, attribute.rating)
            && Objects.equals(this.usp, attribute.usp)
            && Objects.equals(this.value, attribute.value)
            && Objects.equals(this.container, attribute.container);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.priority, this.rating, this.usp, this.value, this.container);
    }

    @Override
    public String toString() {
        return "Attribute{" +
            "priority=" + this.priority +
            ", rating='" + this.rating + '\'' +
            ", usp='" + this.usp + '\'' +
            ", value='" + this.value + '\'' +
            ", container=" + this.container +
            '}';
    }

    public static final class Builder {
        private Integer priority;
        private String rating;
        private String usp;
        private String value;
        private Object container;

        private Builder() {
        }

        public Builder priority(final Integer val) {
            this.priority = val;
            return this;
        }

        public Builder rating(final String val) {
            this.rating = val;
            return this;
        }

        public Builder usp(final String val) {
            this.usp = val;
            return this;
        }

        public Builder value(final String val) {
            this.value = val;
            return this;
        }

        public Builder container(final Object val) {
            this.container = val;
            return this;
        }

        public Attribute build() {
            return new Attribute(this);
        }
    }
}
