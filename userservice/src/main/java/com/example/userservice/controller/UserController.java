package com.example.userservice.controller;

import com.example.userservice.vo.RequestUser;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/users")
public class UserController {

    private final Environment env;

    @GetMapping(value = "/health-check")
    public String status(){
        return "It`s Working in User Service";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return env.getProperty("greeting.message");
    }

    @PostMapping(value = "")
    public String createUser(@Valid @RequestBody RequestUser user){
        return "Create user method is called";
    }
}
