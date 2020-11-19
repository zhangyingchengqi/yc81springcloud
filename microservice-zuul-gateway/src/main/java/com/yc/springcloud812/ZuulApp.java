package com.yc.springcloud812;

import com.yc.springcloud812.filters.AuthorizedRequestFilter;
import org.jboss.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableZuulProxy
public class ZuulApp {
    private static Logger logger= Logger.getLogger(ZuulApp.class);

    @Bean   //将这个 AuthorizedRequestFilter 实例化，且交给spring 托管
    public AuthorizedRequestFilter authorizedRequestFilter(){
        logger.debug("AuthorizedRequestFilter 创建了");
        return new AuthorizedRequestFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class,args);
    }
}
