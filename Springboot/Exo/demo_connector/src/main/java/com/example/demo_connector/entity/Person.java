package com.example.demo_connector.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.beans.Transient;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    private int id;
    private String lastname;
    private String firstname;


}
