package com.pda.pdacademy.beans;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Status {
    @NotNull
    @Id
    @Column(name = "id_statut")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_statut ;

    @NotNull(message = "number phone doesn't take a null value")
    @Column(name = "name")
    private StatutName name;

    public Status() {
    }

    public long getId_statut() {
        return id_statut;
    }

    public void setId_statut(long id_statut) {
        this.id_statut = id_statut;
    }

    public StatutName getName() {
        return name;
    }

    public void setName(StatutName name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Status{" +
                "id_statut=" + id_statut +
                ", name=" + name +
                '}';
    }
}
