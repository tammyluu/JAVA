package com.example.chat_app.controller;


import com.example.chat_app.dto.MessageDTO;
import com.example.chat_app.entity.Message;
import com.example.chat_app.repository.IMessageRepository;
import com.example.chat_app.service.MessageService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("messages")
public class PostMessageController {


    private final MessageService messageService;

    public PostMessageController( MessageService messageService) {

        this.messageService = messageService;
    }
    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Message> getMessages() {
        return messageService.getMessages();
    }

    @PostMapping
    public void post(@RequestBody MessageDTO messageDTO) {
        messageService.postMessage(messageDTO.getSender(), messageDTO.getContent());
    }
    @GetMapping("/sender/{sender}")
    public Flux<Message> getMessageBySender(@PathVariable("sender") String sender){
        return  messageService.getMessageBySender(sender);
    }
    @GetMapping("{id}")
    public Mono<Message> getMessageById(@PathVariable("id") Long id){
        return messageService.getMessageById(id);
    }
    @DeleteMapping("{id}")
    public  Mono deleteMessage(@PathVariable("id") Long id){
        System.out.println("delete");
        return messageService.deleteMessage(id);
    }
    @PutMapping("/update/{id}")
    public Mono<ResponseEntity<Void>> put(@PathVariable("id") Long id, @RequestBody Message message) {
        System.out.println("update");
        return messageService.update(id, message)
                .flatMap(updatedMessage -> Mono.just(ResponseEntity.ok().<Void>build()))
                .defaultIfEmpty(ResponseEntity.notFound().build());

    }


}
