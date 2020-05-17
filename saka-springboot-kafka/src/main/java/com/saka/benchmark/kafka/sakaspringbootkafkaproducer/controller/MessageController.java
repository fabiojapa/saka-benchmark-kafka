package com.saka.benchmark.kafka.sakaspringbootkafkaproducer.controller;

import com.saka.benchmark.kafka.sakaspringbootkafkaproducer.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/kafka")
public class MessageController {

    @Autowired
    private MessageProducer producer;

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
    }

    @PostMapping(value = "/publishAuto")
    public void sendMessageToKafkaTopic() {
        this.producer.sendMessage("message");
    }

}