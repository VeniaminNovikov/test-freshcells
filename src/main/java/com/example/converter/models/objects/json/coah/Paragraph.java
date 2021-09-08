
package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Paragraph implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String value;
    protected String headline;
    protected String description;
    // todo put value here
    protected String content;

    public Paragraph() {
        // empty
    }

    public String getValue() {
        return this.value;
    }

    public String getHeadline() {
        return this.headline;
    }

    public String getDescription() {
        return this.description;
    }

    public String getContent() {
        return this.content;
    }
}
