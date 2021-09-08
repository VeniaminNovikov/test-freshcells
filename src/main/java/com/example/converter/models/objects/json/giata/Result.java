package com.example.converter.models.objects.json.giata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer found;
    private Data data;

    public Result() {
        // empty
    }

    public Data getData() {
        return this.data;
    }

    public void setData(final Data data) {
        this.data = data;
    }

    public Integer getFound() {
        return this.found;
    }

    public void setFound(final Integer found) {
        this.found = found;
    }

    @Override
    public String toString() {
        return "Result{" +
            "found=" + found +
            ", data=" + (data != null ? data.getHotelName() : "") +
            '}';
    }
}
