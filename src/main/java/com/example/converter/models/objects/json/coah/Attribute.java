
package com.example.converter.models.objects.json.coah;

import com.example.converter.converters.deserializers.AttributeDeserializer;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

//@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@JsonDeserialize(using = AttributeDeserializer.class)
@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Attribute implements Serializable {
    private static final long serialVersionUID = 1L;

    protected Integer priority;
    protected String rating;
    protected String usp;
    protected String value;

//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    @JsonSerialize
    private transient Object container;

    public Attribute() {
        // empty
    }

    private Attribute(final Builder builder) {
        priority = builder.priority;
        rating = builder.rating;
        usp = builder.usp;
        value = builder.value;
        container = builder.container;
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

    public static final class Builder {
        private Integer priority;
        private String rating;
        private String usp;
        private String value;
        private Object container;

        private Builder() {
        }

        public Builder priority(final Integer val) {
            priority = val;
            return this;
        }

        public Builder rating(final String val) {
            rating = val;
            return this;
        }

        public Builder usp(final String val) {
            usp = val;
            return this;
        }

        public Builder value(final String val) {
            value = val;
            return this;
        }

        public Builder container(final Object val) {
            container = val;
            return this;
        }

        public Attribute build() {
            return new Attribute(this);
        }
    }
}
