package com.saka.benchmark.kafka.resource;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.jboss.resteasy.annotations.SseElementType;
import org.reactivestreams.Publisher;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * A simple resource retrieving the in-memory "my-data-stream" and sending the items as server-sent events.
 */
@Path("/kafka")
public class MessageResource {

    @Inject
    @Channel("users")
    private Emitter<String> priceEmitter;

    @POST
    @Path("/publish")
    public void publish() {
        priceEmitter.send("message");
    }
}