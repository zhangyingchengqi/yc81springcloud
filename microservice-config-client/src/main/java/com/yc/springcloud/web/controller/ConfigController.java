package com.yc.springcloud.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
//    @Value("${server.port}")
//    private String port;

    @Value("${spring.application.name}")
    private String applicationName;
    //    坑:   service-url:以前的是  serviceUrl
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @RequestMapping("/config")
    public String getConfig() {
        //                   microconfig-test-client222
        return "ApplicationName = " + this.applicationName + "、EurekaServers = "
                + this.eurekaServers;
    }
}
