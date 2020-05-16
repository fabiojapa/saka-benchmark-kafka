package com.saka.benchmark.kafka.sakaspringbootkafkaproducer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MessageConsumer {

    private final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);
    private static Long count;

    public MessageConsumer() {
        count = 0L;
    }

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) throws IOException {
        count++;
        logger.info(String.format("#### -> Consumed message [%d]-> %s", count, message));
    }
}