package com.openbet.k8s.mywebapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationProperties(prefix = "app")
@ConfigurationPropertiesScan
public class MyWebAppConfig {
    private Boolean configApplied;
    private Boolean defaultConfigApplied;
    private Boolean operatorConfigApplied;

    public Boolean getConfigApplied() {
        return configApplied;
    }

    public void setConfigApplied(Boolean configApplied) {
        this.configApplied = configApplied;
    }

    public Boolean getDefaultConfigApplied() {
        return defaultConfigApplied;
    }

    public void setDefaultConfigApplied(Boolean defaultConfigApplied) {
        this.defaultConfigApplied = defaultConfigApplied;
    }

    public Boolean getOperatorConfigApplied() {
        return operatorConfigApplied;
    }

    public void setOperatorConfigApplied(Boolean operatorConfigApplied) {
        this.operatorConfigApplied = operatorConfigApplied;
    }
}
