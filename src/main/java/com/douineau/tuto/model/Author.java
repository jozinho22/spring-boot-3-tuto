package com.douineau.tuto.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author extends SuperPerson {

    @OneToMany(mappedBy = "author")
    /*(optionnel)*/
    private List<Book> books;

    // standard getters, setters
}