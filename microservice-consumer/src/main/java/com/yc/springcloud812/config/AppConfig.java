package com.yc.springcloud812.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean     //少了 @LoadBalance
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
