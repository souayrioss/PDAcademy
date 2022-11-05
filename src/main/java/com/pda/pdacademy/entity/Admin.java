package com.pda.pdacademy.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name ="admin")
public class Admin extends User {

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

    @Enumerated(EnumType.STRING)
    @Column(name = "etat")
    private Etat etat;

    public Admin() {
        super();
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

    public Etat getEtat_id() {
        return etat;
    }

    public void setEtat_id(Etat etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return super.toString() + "Admins{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", etat_id=" + etat +
                '}';
    }
}
