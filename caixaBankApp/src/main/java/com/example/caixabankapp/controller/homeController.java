package com.example.caixabankapp.controller;

import com.example.caixabankapp.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static com.fasterxml.jackson.databind.type.LogicalType.Collection;

@RestController
public class homeController {

    @GetMapping
    public String home() {
        return "Welcome To Caixa Bank App home controller ";
    }

    @GetMapping("/authorized")
    public Map<String, String> authorized(@RequestParam String code) {

        Map<String, String> map = new HashMap<>();
        map.put("code", code);
        return map;
    }

    @GetMapping("/logout")
    public Map<String, String> logout() {
        return Collections.singletonMap("logout", "Ok");
    }


    @GetMapping("/api/users/{id}")
    public User getUserById(@PathVariable Long id) {
        // Mock response for demonstration (replace with actual logic)
        return new User(id, "John Doe", "john.doe@example.com","12345");
    }

}
