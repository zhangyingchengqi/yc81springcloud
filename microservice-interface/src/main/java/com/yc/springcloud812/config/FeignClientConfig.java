package com.yc.springcloud812.config;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//关于feign客户端所有的配置
@Configuration
public class FeignClientConfig {

     //加入安全配置
     @Bean
     public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor(){
         return new BasicAuthRequestInterceptor("admin","b");
     }

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

}
