package com.example.euopenconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    HiClient hiClient;

    @GetMapping("/hi")
    public String hi() {
        return "HI FROM OPEN-CONSUMER +" + hiClient.hi();

    }
}
