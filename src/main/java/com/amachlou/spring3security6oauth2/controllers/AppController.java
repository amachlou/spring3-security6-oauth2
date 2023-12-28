package com.amachlou.spring3security6oauth2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AppController {

    @GetMapping
    public String home(){
        return "Welcome HOME !";
    }

    @GetMapping("/secured")
    public String secured(Principal principal){
        return "Authenticated as: "+principal.getName();
    }

}
