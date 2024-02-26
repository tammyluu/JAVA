package com.example.chat_app.controller;

import com.example.chat_app.entity.Message;
import com.example.chat_app.service.MessageService;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequestMapping("/messages/stream")
public class MessageStreamController {
   /* private final MessageService messageService;

    public MessageStreamController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping(produces = "text/event-stream")
    public Flux<ServerSentEvent<Message>> streamMessages() {
        return messageService.getMessages()
                .map(message -> ServerSentEvent.<Message>builder()
                        .data(message)
                        .build())
                // Intervalle de rafraîchissement
                .delayElements(Duration.ofMillis(1000));
    }*/
}
