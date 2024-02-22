package com.example.correction_boutique_bonbons.entity;

import jakarta.persistence.*;

@Entity
public class CandyOrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int qty;
    @ManyToOne
    private Candy candy;

    @ManyToOne
    private CandyOrder candyOrder;

}
