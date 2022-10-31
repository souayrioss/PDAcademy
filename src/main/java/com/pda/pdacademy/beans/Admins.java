package com.pda.pdacademy.beans;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
public class Admins extends Users implements Serializable {

    @NotNull(message = "login doesn't take a null value")
    @Column(name = "login")
    private String login;

    @NotNull(message = "email doesn't take a null value")
    @Email
    @Column(name = "email")
    private String email;

    @NotNull(message = "password doesn't take a null value")
    @Column(name = "password")
    private String password;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "etat_id", unique = false, referencedColumnName = "id_etat")
    private Etats etat_id;

    public Admins() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Etats getEtat_id() {
        return etat_id;
    }

    public void setEtat_id(Etats etat_id) {
        this.etat_id = etat_id;
    }

    @Override
    public String toString() {
        return "Admins{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", etat_id=" + etat_id +
                '}';
    }
}
