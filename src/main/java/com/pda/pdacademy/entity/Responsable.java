package com.pda.pdacademy.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@PrimaryKeyJoinColumn( name = "id_user" )
public class Responsable extends User  {

    @NotNull(message = "domain doesn't take a null value")
    @Column(name = "domain")
    private String domain;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "type doesn't take a null value")
    @Column(name = "type")
    private ResponsapleType responsapleType;

    @Enumerated(EnumType.STRING)
    @Column(name = "etat")
    private Etat etat;


    public Responsable() {
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ResponsapleType getResponsapleType() {
        return responsapleType;
    }

    public void setResponsapleType(ResponsapleType responsapleType) {
        this.responsapleType = responsapleType;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Responsables{" +
                "domain='" + domain + '\'' +
                ", type='" + responsapleType + '\'' +
                ", etat_id=" + etat +
                '}';
    }
}
