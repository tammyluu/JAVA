package com.example.tpvendredi0202.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Riddle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;
    private String expectedAnswer;
    private String actualAnswer;

    public Riddle(String question, String expectedAnswer, String actualAnswer) {
        this.question = question;
        this.expectedAnswer = expectedAnswer;
        this.actualAnswer = actualAnswer;
    }
}
