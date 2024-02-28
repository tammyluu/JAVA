package com.example.chat_app.service;

import com.example.chat_app.entity.Message;
import com.example.chat_app.repository.IMessageRepository;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class MessageService {
    private final Sinks.Many<Message> sink;
    private final IMessageRepository messageRepository;
    private  final ConnectionFactory connectionFactory;

    private DatabaseClient databaseClient;



    public MessageService(IMessageRepository messageRepository, ConnectionFactory connectionFactory) {
        this.messageRepository = messageRepository;
        this.connectionFactory = connectionFactory;
        // au moment créer service, je crée mes tables
        createTable();
        this.sink = Sinks.many().unicast().onBackpressureBuffer();

    }
    public void createTable() {
        databaseClient = DatabaseClient.create(connectionFactory);
        Mono<Void> monCreateTable = databaseClient
                .sql("CREATE TABLE  IF NOT EXISTS message (id long primary key auto_increment, content varchar(300), sender varchar(100), posttime DATETIME)")
                .then().doOnSuccess((Void) ->  {
                    System.out.println("Création de la table OK");
                }).doOnError((Void) ->  {
                    System.out.println("Création de la table Not OK");
                });
        monCreateTable.subscribe();

    }

    public void postMessage(String sender, String content) {
        Message message1 = Message.builder().sender(sender).content(content).posttime(LocalDateTime.now()).build();
        messageRepository.save(message1).subscribe((m) ->sink.tryEmitNext(m));
    }

    public Flux<Message> getMessages() {
        messageRepository.findAll().onBackpressureBuffer().subscribe((m)->{
            // une action pour vérifier qu'un message n'est pas dans le sink déjà
            System.out.println(m);
            sink.tryEmitNext(m);
        });
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
