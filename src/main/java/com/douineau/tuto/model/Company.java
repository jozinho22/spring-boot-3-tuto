package com.douineau.tuto.model;

import jakarta.persistence.*;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String address;

    private String phone;

    @Embedded
    private EmbeddedPerson Person;

    // standard getters, setters
}