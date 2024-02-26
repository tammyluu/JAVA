package com.example.meteorologique.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Builder
public class Weather {

    private double temperature;
    private String description;
    private double pressure;
    private double humidity;
    private double windSpeed;
    private double windDirection;
    private double visibility;
    private LocalDateTime lastUpdateTime;




}
