package com.example.converter.models.objects.giata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer found;
    private Data data;

    public Result() {
        // empty
    }

    private Result(final Builder builder) {
        this.found = builder.found;
        this.data = builder.data;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Result copy) {
        Builder builder = new Builder();
        builder.found = copy.getFound();
        builder.data = copy.getData();
        return builder;
    }

    public Data getData() {
        return this.data;
    }

    public Integer getFound() {
        return this.found;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Result)) return false;
        final Result result = (Result) o;
        return Objects.equals(this.found, result.found) && Objects.equals(this.data, result.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.found, this.data);
    }

    @Override
    public String toString() {
        return "Result{" +
            "found=" + this.found +
            ", data=" + (this.data != null ? this.data.getHotelName() : "") +
            '}';
    }

    public static final class Builder {
        private Integer found;
        private Data data;

        private Builder() {
        }

        public Builder found(final Integer val) {
            this.found = val;
            return this;
        }

        public Builder data(final Data val) {
            this.data = val;
            return this;
        }

        public Result build() {
            return new Result(this);
        }
    }
}
