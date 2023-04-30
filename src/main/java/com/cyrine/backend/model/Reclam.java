package com.cyrine.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Reclam {
    @Id
    @GeneratedValue
    private Long id ;
    private Integer codeReclam ;
    private String technicien;
    private String description;


}
