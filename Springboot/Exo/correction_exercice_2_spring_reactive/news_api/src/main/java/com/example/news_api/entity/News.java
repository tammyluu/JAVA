package com.example.news_api.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@Builder
public class News {
    @Id
    private int id;
    private String city;
    private String content;
    private LocalDateTime dateTime;
}
