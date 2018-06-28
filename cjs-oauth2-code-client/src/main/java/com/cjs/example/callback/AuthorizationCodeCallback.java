package com.cjs.example.callback;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login/oauth2/code")
public class AuthorizationCodeCallback {

    @RequestMapping("/callback")
    public String callback(String code) {
        System.out.println("授权码: " + code);
        return "SUCCESS";
    }
}
