package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        rabbitMQProducer.sendMessage(message);
        return "Message sent: " + message;
    }
}
