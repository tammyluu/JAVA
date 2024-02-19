package com.example.demo_springData.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Controller;

@Entity
@Table(name = "personne")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
}
