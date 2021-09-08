package com.example.converter.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="resources")
public class ResourceConfiguration {

    private String dataSource;

    public ResourceConfiguration() {
        // empty
    }

    public String getDataSource() {
        return this.dataSource;
    }

    public void setDataSource(final String dataSource) {
        this.dataSource = dataSource;
    }
}
