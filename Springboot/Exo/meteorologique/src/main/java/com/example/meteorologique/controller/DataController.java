package com.example.meteorologique.controller;

import com.example.meteorologique.entity.AggregateData;
import com.example.meteorologique.entity.News;
import com.example.meteorologique.entity.Weather;
import com.example.meteorologique.service.DataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class DataController {
    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/data")
    public Mono<AggregateData> getData() {
        return dataService.fetchData();
    }



}
