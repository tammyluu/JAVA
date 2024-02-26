package com.example.chat_app.controller;

import com.example.chat_app.entity.Message;
import com.example.chat_app.service.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("messages")
public class PostMessageController {

    private final MessageService messageService;

    public PostMessageController(MessageService messageService) {
        this.messageService = messageService;
    }
    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Message> getMessages() {
        return messageService.getMessages();
    }

    @PostMapping
    public Mono<ResponseEntity<Void>> postMessage(@RequestBody Message message) {
        try {
            messageService.postMessage(message);
            return Mono.just(ResponseEntity.ok().build());
        } catch (Exception e) {
            return Mono.just(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
        }
    }
}
