package com.example.meteorologique.entity;

public class AggregateData {
    private Weather weather;
    private News news;

    public AggregateData(Weather weather, News news) {
        this.weather = weather;
        this.news = news;
    }
}
