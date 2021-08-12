package com.example.microservice2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
public class Controller {
    @GetMapping("/message")
    public String message()
    {
        return "Two Message";
    }
}
