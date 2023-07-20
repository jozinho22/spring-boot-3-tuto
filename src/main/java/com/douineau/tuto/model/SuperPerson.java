package com.douineau.tuto.model;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class SuperPerson {

    @Id
    private Integer id;

    private String name;

}
