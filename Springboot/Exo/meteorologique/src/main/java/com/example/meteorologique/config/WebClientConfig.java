package com.example.meteorologique.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Value("${weather.api.url}")
    private String weatherApiUrl;

    @Value("${news.api.url}")
    private String newsApiUrl;

    @Bean
    public WebClient weatherWebClient() {
        return WebClient.create(weatherApiUrl);
    }

    @Bean
    public WebClient newsWebClient() {
        return WebClient.create(newsApiUrl);
    }
}
