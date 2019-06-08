package com.example.springcloudereuka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEreukaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEreukaApplication.class, args);
    }

}
