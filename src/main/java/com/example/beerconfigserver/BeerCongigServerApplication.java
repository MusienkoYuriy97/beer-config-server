package com.example.beerconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BeerCongigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeerCongigServerApplication.class, args);
    }

}
