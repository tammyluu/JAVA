package com.example._spring_reactive.controller;

import com.example._spring_reactive.service.NewService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("news")
public class NewsController {
    private NewService newService;

    public NewsController(NewService newService){
        this.newService = newService;

    }
    @GetMapping("add/{news}")
    public ResponseEntity<String> addNews(@PathVariable("news") String news){
        this.newService.sendNews(news);
        return  ResponseEntity.ok("OK");
    }
    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> get (){
        return newService.getFlux();
    }

}
