package com.douineau.tuto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Adress {

    @Id
    private Integer id;
    private String city;
    private String location;
}
