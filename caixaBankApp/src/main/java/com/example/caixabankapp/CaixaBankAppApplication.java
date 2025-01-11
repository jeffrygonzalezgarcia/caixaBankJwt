package com.example.caixabankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CaixaBankAppApplication {

    @GetMapping("/message")
    public String getMessaage(){
        return "Welcome To Caixa Bank App";
    }
    public static void main(String[] args) {
        SpringApplication.run(CaixaBankAppApplication.class, args);
    }

}
