package com.cjs.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class MainController {

    @Autowired
    private OAuth2RestTemplate oAuth2RestTemplate;

    @GetMapping("/test")
    public String test(Principal principal) {
        return "Hello, " + principal.getName();
    }

    @GetMapping("/hello")
    public String hello() {
        return oAuth2RestTemplate.getForObject("http://localhost:8080/sayHi", String.class);
    }
}
