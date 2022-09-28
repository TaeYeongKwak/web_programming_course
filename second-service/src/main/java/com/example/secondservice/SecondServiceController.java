package com.example.secondservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/second-service")
public class SecondServiceController {

    @GetMapping(value = "/welcome")
    public String welcome(){
        return "Welcome to the Second service";
    }

}
