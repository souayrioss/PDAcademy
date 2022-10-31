package com.pda.pdacademy.beans;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Roles {
    @NotNull
    @Id
    @Column(name = "id_role")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_role ;

    @NotNull(message = "number phone doesn't take a null value")
    @Column(name = "name")
    private RoleName name;

    public Roles() {
    }

    public long getId_role() {
        return id_role;
    }

    public void setId_role(long id_role) {
        this.id_role = id_role;
    }

    public RoleName getName() {
        return name;
    }

    public void setName(RoleName name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "id_role=" + id_role +
                ", name=" + name +
                '}';
    }
}
