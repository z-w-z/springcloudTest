package com.example.simpleprovidermovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@SpringBootApplication
public class SimpleProviderMovieApplication {
   /* @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(
                SimpleProviderMovieApplication.class, args);
    }

}
