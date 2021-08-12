package com.example.microservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class Controller {
    @GetMapping("/message")
    public String message()
    {
        return "One Message";
    }
}
