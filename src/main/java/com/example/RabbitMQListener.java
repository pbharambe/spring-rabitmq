package com.example;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQListener {

    @RabbitListener(queues = "demoQueue")
    public void listen(String message) {
        System.out.println("Received message from RabbitMQ: " + message);
    }
}
