package com.pda.pdacademy.beans;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Genres {

    @NotNull
    @Id
    @Column(name = "id_genre")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_genre ;

    @NotNull(message = "number phone doesn't take a null value")
    @Column(name = "name")
    private GenreName name;

    public Genres() {
    }

    public long getId_genre() {
        return id_genre;
    }

    public void setId_genre(long id_genre) {
        this.id_genre = id_genre;
    }

    public GenreName getName() {
        return name;
    }

    public void setName(GenreName name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genres{" +
                "id_genre=" + id_genre +
                ", name=" + name +
                '}';
    }
}

