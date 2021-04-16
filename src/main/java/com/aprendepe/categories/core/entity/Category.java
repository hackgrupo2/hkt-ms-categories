package com.aprendepe.categories.core.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Category", schema = "equipo2")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    private String description;
}
