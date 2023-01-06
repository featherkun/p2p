package com.example.p2p_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class P2pConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(P2pConsumerApplication.class, args);
    }
}
