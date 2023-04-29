package com.cyrine.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Interv {
    @Id
    @GeneratedValue
    private Long id ;
    private LocalDate date;
    private String heure ;
    private String client ;
    private String modelMachine ;
    private String panne ;
    private String technicien;
    private LocalDate dateDebut;
    private String heureDebut ;
    private LocalDate dateFIN ;
    private String heureFin;
    private Integer numFiche;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getModelMachine() {
        return modelMachine;
    }

    public void setModelMachine(String modelMachine) {
        this.modelMachine = modelMachine;
    }

    public String getPanne() {
        return panne;
    }

    public void setPanne(String panne) {
        this.panne = panne;
    }

    public String getTechnicien() {
        return technicien;
    }

    public void setTechnicien(String technicien) {
        this.technicien = technicien;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public LocalDate getDateFIN() {
        return dateFIN;
    }

    public void setDateFIN(LocalDate dateFIN) {
        this.dateFIN = dateFIN;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public Integer getNumFiche() {
        return numFiche;
    }

    public void setNumFiche(Integer numFiche) {
        this.numFiche = numFiche;
    }
}

