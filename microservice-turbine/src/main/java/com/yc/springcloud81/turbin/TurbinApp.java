package com.yc.springcloud81.turbin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class TurbinApp {
    public static void main(String[] args) {
        SpringApplication.run( TurbinApp.class, args  );
    }
}
