package com.example.demo_connector.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    private Long id;
    private String fullAddress;

    private int personId;

    @Transient
    private Person person;
}
