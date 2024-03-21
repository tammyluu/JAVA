package org.example.springsecuritytodolist.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private boolean isCompleted;

    @ManyToOne(fetch = FetchType.LAZY)
    private AppUser user;
}
