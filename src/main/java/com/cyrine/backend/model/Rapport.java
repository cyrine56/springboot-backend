package com.cyrine.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Rapport {
    @Id
    @GeneratedValue
    private Long id ;
    private Integer codeReclam ;
    private String technicien;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCodeReclam() {
        return codeReclam;
    }

    public void setCodeReclam(Integer codeReclam) {
        this.codeReclam = codeReclam;
    }

    public String getTechnicien() {
        return technicien;
    }

    public void setTechnicien(String technicien) {
        this.technicien = technicien;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
