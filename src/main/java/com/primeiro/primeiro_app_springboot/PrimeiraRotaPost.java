package com.primeiro.primeiro_app_springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class PrimeiraRotaPost {
    @PostMapping("/")
    public String create(@RequestBody String payload) {
        return payload;
    }
}
