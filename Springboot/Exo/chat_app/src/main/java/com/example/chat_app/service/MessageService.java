package com.example.chat_app.service;

import com.example.chat_app.entity.Message;
import com.example.chat_app.repository.IMessageRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;

@Service
public class MessageService {
    private final Sinks.Many<Message> sink;
    private final IMessageRepository messageRepository;


    public MessageService( IMessageRepository messageRepository) {
        this.messageRepository = messageRepository;
        this.sink = Sinks.many().unicast().onBackpressureBuffer();

    }

    public Mono<Message> postMessage(Message message) {
        // Obtenez la date actuelle
        LocalDate date = LocalDate.now();

        // Créez une LocalDateTime à partir de LocalDate en ajoutant l'heure (00:00 )
        LocalDateTime posttime = date.atStartOfDay();

        // Définir le timestamp du message
        message.setPosttime(posttime);

        return messageRepository.save(message)
                .flatMap(savedMessage -> {
                    // Envoyer le message au flux après l'avoir sauvegardé
                    sink.tryEmitNext(savedMessage);
                    return Mono.just(savedMessage);
                });
    }

    public Flux<Message> getMessages() {
        return this.sink.asFlux();
    }
    public Mono<Message> getMessageById(Long id){
        return messageRepository.findById(id);
    }
    public Flux<Message> getMessageBySender(String sender){
        return messageRepository.searchAllBySenderContainingIgnoreCase(sender);
    }
    public Mono deleteMessage(Long id){
        return messageRepository.deleteById(id);

    }
    public Mono<Message> update(Long id, Message updatedMessage) {
        // Recherchez le message par son ID
        return messageRepository.findById(id)
                .flatMap(existingMessage -> {
                    // Mettez à jour les propriétés du message existant avec les nouvelles valeurs
                    existingMessage.setContent(updatedMessage.getContent());
                    existingMessage.setSender(updatedMessage.getSender());
                    existingMessage.setPosttime(updatedMessage.getPosttime());
                    // Enregistrez les modifications et retournez le message mis à jour
                    return messageRepository.save(existingMessage);
                });
    }


}
