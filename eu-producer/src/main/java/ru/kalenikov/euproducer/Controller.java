package ru.kalenikov.euproducer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hi")
    public String getHelloWorld() {
        return "HI FROM PRODUCER";
    }
}
