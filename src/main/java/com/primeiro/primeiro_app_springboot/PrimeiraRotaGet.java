package com.primeiro.primeiro_app_springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class PrimeiraRotaGet {
    @GetMapping("/")
    public String read() {
        return "Bem-vindo ao primeiro app Spring Boot!";
    }
}
