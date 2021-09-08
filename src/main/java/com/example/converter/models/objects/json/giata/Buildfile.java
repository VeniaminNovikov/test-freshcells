package com.example.converter.models.objects.json.giata;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Buildfile implements Serializable {
    private static final long serialVersionUID = 1L;

    private String typ;
    private Integer seq;
    private Integer size;
    private Integer width;
    private Integer height;
    private String id;
    private String url;

    public Buildfile() {
        // empty
    }

    public String getTyp() {
        return this.typ;
    }

    public Integer getSeq() {
        return this.seq;
    }

    public Integer getSize() {
        return this.size;
    }

    public Integer getWidth() {
        return this.width;
    }

    public Integer getHeight() {
        return this.height;
    }

    public String getId() {
        return this.id;
    }

    @JsonGetter(value = "Bildfile")
    public String getUrl() {
        return this.url;
    }
}
