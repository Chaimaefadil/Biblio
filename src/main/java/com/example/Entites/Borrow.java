package com.example.Entites;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Document document;

    @Temporal(TemporalType.DATE)
    private Date dateBorrow;

    @Temporal(TemporalType.DATE)
    private Date returnDate;


    // Getters et Setters
}
