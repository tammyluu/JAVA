package com.example.chat_app.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class MessageDTO {
    private Long id;
    private String content;
    private String sender;
}
