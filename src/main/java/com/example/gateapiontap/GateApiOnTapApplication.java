package com.example.gateapiontap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GateApiOnTapApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateApiOnTapApplication.class, args);
    }

}
