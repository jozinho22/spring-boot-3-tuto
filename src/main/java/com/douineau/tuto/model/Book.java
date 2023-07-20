package com.douineau.tuto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {

    @Id
    private Integer id;

    private String name;

    @ManyToOne
    private Author author;
}
