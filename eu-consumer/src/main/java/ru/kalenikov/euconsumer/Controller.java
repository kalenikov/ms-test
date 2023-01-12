package ru.kalenikov.euconsumer;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class Controller {
    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/hi")
    public String hi() {
        RestTemplate restTemplate = new RestTemplate();
        InstanceInfo server = eurekaClient.getNextServerFromEureka("eu-producer", false);
        URI url = URI.create(server.getHomePageUrl() + "hi/");
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        return "HI FROM CONSUMER + " + responseEntity.getBody();
    }
}
