package com.example.euopenconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eu-producer")
public interface HiClient {
    @GetMapping("/hi")
    String hi();
}
