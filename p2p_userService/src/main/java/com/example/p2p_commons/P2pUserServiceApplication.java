package com.example.p2p_commons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class P2pUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(P2pUserServiceApplication.class, args);
    }

}
