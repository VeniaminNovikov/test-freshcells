package com.example.converter.models.objects.json.coah;

import java.io.Serializable;

public class ContentWrapper implements Serializable {
    private static final long serialVersionUID = 1L;

    private Content content;

    public ContentWrapper() {
        // empty
    }

    public Content getContent() {
        return this.content;
    }

    @Override
    public String toString() {
        return "ContentWrapper{" +
            "content=" + (content != null ? content.toString() : "") +
            '}';
    }
}
