package com.example.chat_app.service;

import com.example.chat_app.entity.Message;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

import java.time.LocalDateTime;

@Service
public class MessageService {
    private final Sinks.Many<Message> sink;


    public MessageService() {
        this.sink = Sinks.many().unicast().onBackpressureBuffer();

    }

    public void postMessage(Message message) {
        // Définir le timestamp du message
        message.setTimestamp(LocalDateTime.now());
        this.sink.tryEmitNext(message);
    }

    public Flux<Message> getMessages() {
        return this.sink.asFlux();
    }


}
