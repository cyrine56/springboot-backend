package com.cyrine.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


import java.time.LocalDate;

/* Created by Arjun Gautam */
@Entity
public class Equipement {

    @Id
    @GeneratedValue
    private Long id;
    private Integer codeb  ;
    private String bur ;
    private  Integer numSerieGAB;
    private LocalDate dateVisitepre;
    private LocalDate dateLiv ;
    private LocalDate dateMiseEnService;
    private LocalDate dateFormation ;
    private String telephone ;
    private String modelPC ;
    private String modelEcran;
    private String os ;
    private String paramReseau;
    private String tech ;
    private Integer fiche;
    private String observation ;
    private String etat ;
    private LocalDate dateReception ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCodeb() {
        return codeb;
    }

    public void setCodeb(Integer codeb) {
        this.codeb = codeb;
    }

    public String getBur() {
        return bur;
    }

    public void setBur(String bur) {
        this.bur = bur;
    }

    public Integer getNumSerieGAB() {
        return numSerieGAB;
    }

    public void setNumSerieGAB(Integer numSerieGAB) {
        this.numSerieGAB = numSerieGAB;
    }

    public LocalDate getDateVisitepre() {
        return dateVisitepre;
    }

    public void setDateVisitepre(LocalDate dateVisitepre) {
        this.dateVisitepre = dateVisitepre;
    }

    public LocalDate getDateLiv() {
        return dateLiv;
    }

    public void setDateLiv(LocalDate dateLiv) {
        this.dateLiv = dateLiv;
    }

    public LocalDate getDateMiseEnService() {
        return dateMiseEnService;
    }

    public void setDateMiseEnService(LocalDate dateMiseEnService) {
        this.dateMiseEnService = dateMiseEnService;
    }

    public LocalDate getDateFormation() {
        return dateFormation;
    }

    public void setDateFormation(LocalDate dateFormation) {
        this.dateFormation = dateFormation;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getModelPC() {
        return modelPC;
    }

    public void setModelPC(String modelPC) {
        this.modelPC = modelPC;
    }

    public String getModelEcran() {
        return modelEcran;
    }

    public void setModelEcran(String modelEcran) {
        this.modelEcran = modelEcran;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getParamReseau() {
        return paramReseau;
    }

    public void setParamReseau(String paramReseau) {
        this.paramReseau = paramReseau;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Integer getFiche() {
        return fiche;
    }

    public void setFiche(Integer fiche) {
        this.fiche = fiche;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public LocalDate getDateReception() {
        return dateReception;
    }

    public void setDateReception(LocalDate dateReception) {
        this.dateReception = dateReception;
    }
}

