package com.example.SpringRestApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;

@RestController
public class FacebookController {


    @GetMapping("/auth/facebook")
    public void startFacebookAuth(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Facebook Oauth Login Initiated");
                String uri = request.getRequestURI();
        System.out.println(uri);
    }

    // On Successfull OAuth Facebook will return principal object
    // Principal Object Consist of username ,name ,email depending on scope mention in yml.

    @GetMapping("/oauth2/callback/facebook")
    public Principal callbackFacebook(Principal principal) {
        System.out.println(principal.toString());
        return principal;

    }
}