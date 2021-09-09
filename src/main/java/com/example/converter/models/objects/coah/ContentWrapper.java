package com.example.converter.models.objects.coah;

import java.io.Serializable;
import java.util.Objects;

public class ContentWrapper implements Serializable {
    private static final long serialVersionUID = 1L;

    private Content content;

    public ContentWrapper() {
        // empty
    }

    private ContentWrapper(final Builder builder) {
        this.content = builder.content;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final ContentWrapper copy) {
        Builder builder = new Builder();
        builder.content = copy.getContent();
        return builder;
    }

    public Content getContent() {
        return this.content;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof ContentWrapper)) return false;
        final ContentWrapper that = (ContentWrapper) o;
        return Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.content);
    }

    @Override
    public String toString() {
        return "ContentWrapper{" +
            "content=" + (this.content != null ? this.content.toString() : "") +
            '}';
    }

    public static final class Builder {
        private Content content;

        private Builder() {
        }

        public Builder content(final Content val) {
            this.content = val;
            return this;
        }

        public ContentWrapper build() {
            return new ContentWrapper(this);
        }
    }
}
