package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String getInitialMsg(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s", name);
    }

    @GetMapping("/greetings")
    public Map<String, String> getGreetings(@RequestParam(value = "key") String key, @RequestParam(value = "value") String value) {
        Map<String, String> _greetings = new HashMap<>();
        _greetings.put(key, value);
        return _greetings;
    }
}
