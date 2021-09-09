package com.example.converter.models.objects.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressFormatted implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<String> line = new LinkedList<>();

    public AddressFormatted() {
        // empty
    }

    private AddressFormatted(final Builder builder) {
        this.line = builder.line;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final AddressFormatted copy) {
        Builder builder = new Builder();
        builder.line = copy.getLine();
        return builder;
    }

    public List<String> getLine() {
        return this.line;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressFormatted)) return false;
        final AddressFormatted that = (AddressFormatted) o;
        return Objects.equals(this.line, that.line);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.line);
    }

    @Override
    public String toString() {
        return "AddressFormatted{" +
            "line=" + this.line +
            '}';
    }

    public static final class Builder {
        private List<String> line;

        private Builder() {
        }

        public Builder line(final List<String> val) {
            this.line = val;
            return this;
        }

        public AddressFormatted build() {
            return new AddressFormatted(this);
        }
    }
}
