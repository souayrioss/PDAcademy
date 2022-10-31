package com.pda.pdacademy.beans;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Types {
    @NotNull
    @Id
    @Column(name = "id_type")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_type ;

    @NotNull(message = "number phone doesn't take a null value")
    @Column(name = "name")
    private TypeName name;

    public Types() {
    }

    public long getId_type() {
        return id_type;
    }

    public void setId_type(long id_type) {
        this.id_type = id_type;
    }

    @Override
    public String toString() {
        return "Types{" +
                "id_type=" + id_type +
                ", name=" + name +
                '}';
    }
}
