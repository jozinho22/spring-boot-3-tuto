package com.douineau.tuto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Content implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description;

    private Status status;

    private Type contentType;

    private LocalDateTime created;

    private LocalDateTime updated;

    private String url;

    public Content(Integer id, String title, String description, Status status, Type contentType, LocalDateTime created, LocalDateTime updated, String url) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.contentType = contentType;
        this.created = created;
        this.updated = updated;
        this.url = url;
    }

    public Content() {
    }
}
