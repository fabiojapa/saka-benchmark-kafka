package com.saka.benchmark.kafka.consumer;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;

/**
 * A bean consuming data from the "prices" Kafka topic and applying some conversion.
 * The result is pushed to the "my-data-stream" stream which is an in-memory stream.
 */
@ApplicationScoped
public class MessageConsumer {

    private static Long count;

    public MessageConsumer() {
        count = 0L;
    }

    @Incoming("users")
    public void process(String message) {
        count++;
        System.out.println("messageconss = " + message);
        System.out.println(String.format("message[%d]: %s", count, message));
    }

}