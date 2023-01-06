package com.example.p2p_loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class P2pLoanApplication {

    public static void main(String[] args) {
        SpringApplication.run(P2pLoanApplication.class, args);
    }

}
