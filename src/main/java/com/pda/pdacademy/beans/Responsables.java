package com.pda.pdacademy.beans;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@PrimaryKeyJoinColumn( name = "id_user" )
public class Responsables extends Users  {

    @NotNull(message = "domain doesn't take a null value")
    @Column(name = "domain")
    private String domain;

    @NotNull(message = "type doesn't take a null value")
    @Column(name = "type")
    private String type;

    @Column(name = "etat")
    private Etats etat;


    public Responsables() {
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "Responsables{" +
                "domain='" + domain + '\'' +
                ", type='" + type + '\'' +
                ", etat_id=" + etat +
                '}';
    }
}
