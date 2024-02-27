package com.example.chat_app.repository;

import com.example.chat_app.entity.Message;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface IMessageRepository extends R2dbcRepository<Message,Long> {

    Flux<Message> searchAllBySenderContainingIgnoreCase(String sender);

    Mono<Message> findAllById(Long id);

}
