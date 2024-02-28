package com.example.weather_api.repository;

import com.example.weather_api.entity.WeatherForecast;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface WeatherRepository  extends ReactiveMongoRepository<WeatherForecast, String> {


    Flux<WeatherForecast> searchByCity(String city);
}
