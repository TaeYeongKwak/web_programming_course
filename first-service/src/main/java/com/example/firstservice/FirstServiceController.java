package com.example.firstservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/first-service")
public class FirstServiceController {

    @GetMapping(value = "/welcome")
    public String welcome(){
        return "Welcome to the First service";
    }

    @GetMapping(value = "/message")
    public String message(@RequestHeader("first-request") String header){
        log.info(header);
        return "Hello World in First Service.";
    }
}
