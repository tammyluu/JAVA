package com.example._spring_reactive.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

@Service
public class NewService {
    // un sinks multicast qui permet de pousser des élements vers plusieurs subscriber
    private final Sinks.Many<String> sink;

    public NewService() {
        //multicast: emttre plusieur publisher
        sink = Sinks.many().multicast().onBackpressureBuffer();
    }
    public void sendNews(String news){
        sink.tryEmitNext(news);
    }
    public Flux<String> getFlux(){
        return sink.asFlux();
    }
}


