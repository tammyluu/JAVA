package com.example.correction_boutique_bonbons.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderOnLine {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "candy_id")
        private Candy candy;

        private int quantity;

        @ManyToOne
        @JoinColumn(name = "order_id")
        private CandyOrder order;




}
