package com.fcb.servicehelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceHelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHelloworldApplication.class, args);
    }

}
