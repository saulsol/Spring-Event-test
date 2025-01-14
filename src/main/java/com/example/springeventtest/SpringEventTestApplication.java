package com.example.springeventtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringEventTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEventTestApplication.class, args);
    }

}
