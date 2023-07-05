package com.douineau.tuto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;

@Entity
public record ContentRecord(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id,
        @NotEmpty
        String title,
        String description,
        Status status,
        Type contentType,
        LocalDateTime created,
        LocalDateTime updated,
        String url
) {}
