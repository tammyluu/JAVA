package com.example.meteorologique.service;

import com.example.meteorologique.entity.AggregateData;
import com.example.meteorologique.entity.News;
import com.example.meteorologique.entity.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class DataService {
    private final WebClient weatherWebClient;
    private final WebClient newsWebClient;


    public DataService(WebClient weatherWebClient, WebClient newsWebClient) {
        this.weatherWebClient = weatherWebClient;
        this.newsWebClient = newsWebClient;
    }

    public Mono<AggregateData> fetchData() {
        Mono<Weather> weatherDataMono = weatherWebClient.get()
                .uri("/current-weather")
                .retrieve()
                .bodyToMono(Weather.class);

        Mono<News> newsDataMono = newsWebClient.get()
                .uri("/latest-news")
                .retrieve()
                .bodyToMono(News.class);

        return Mono.zip(weatherDataMono, newsDataMono, AggregateData::new);
    }


}
