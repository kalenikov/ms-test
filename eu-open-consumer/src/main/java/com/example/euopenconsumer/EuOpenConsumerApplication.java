package com.example.euopenconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EuOpenConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EuOpenConsumerApplication.class, args);
    }
}
