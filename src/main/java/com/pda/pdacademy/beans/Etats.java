package com.pda.pdacademy.beans;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Etats {
    @NotNull
    @Id
    @Column(name = "id_etat")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_etat ;

    @NotNull(message = "number phone doesn't take a null value")
    @Column(name = "name")
    private EtatName name;

    public Etats() {
    }

    public long getId_etat() {
        return id_etat;
    }

    public void setId_etat(long id_etat) {
        this.id_etat = id_etat;
    }

    public EtatName getName() {
        return name;
    }

    public void setName(EtatName name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Etats{" +
                "id_etat=" + id_etat +
                ", name=" + name +
                '}';
    }
}
