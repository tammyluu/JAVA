package com.example.meteorologique.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@Builder
    public class News {
        private String city;
        private String title;
        private String description;
        private String author;
        private String source;
        private String url;
        private LocalDateTime publishedAt;
        private String imageUrl;
        private String category;



}
