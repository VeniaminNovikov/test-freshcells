
package com.example.converter.models.objects.json.giata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Text implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String value;
    protected String lang;

    public Text() {
        // empty
    }

    public String getValue() {
        return this.value;
    }

    public String getLang() {
        return this.lang;
    }
}
