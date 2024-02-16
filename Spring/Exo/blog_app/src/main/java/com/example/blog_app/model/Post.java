package com.example.blog_app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Post {
    private UUID id;
    private String title;
    private String description;
    private String content;
    private List<Comment> comments;
}
