package com.openbet.k8s.mywebapp;

import com.openbet.k8s.mywebapp.config.MyWebAppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MyWebAppConfig.class)
public class MyWebApp {

    public static void main(String[] args) {
        SpringApplication.run(MyWebApp.class, args);
    }

}
