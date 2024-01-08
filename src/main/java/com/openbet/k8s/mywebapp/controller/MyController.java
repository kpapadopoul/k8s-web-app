package com.openbet.k8s.mywebapp.controller;

import com.openbet.k8s.mywebapp.config.MyWebAppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyWebAppConfig myWebAppConfig;

    @Autowired
    public MyController(MyWebAppConfig myWebAppConfig) {
        this.myWebAppConfig = myWebAppConfig;
    }

    @GetMapping("/hello")
    String hello() {
        return "Hello from my web app:<br>" +
                "App config applied... " + myWebAppConfig.getConfigApplied() + "<br>" +
                "Product default config applied... " + myWebAppConfig.getDefaultConfigApplied() + "<br>" +
                "Operator-specific config... " + myWebAppConfig.getOperatorConfigApplied();
    }
}
