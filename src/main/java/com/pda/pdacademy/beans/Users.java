package com.pda.pdacademy.beans;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Users implements Serializable {

    @NotNull
    @Id
    @Column(name = "id_user")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_user ;

    @Column(name = "uuid",length = 60)
    private UUID uuid_user;

    @NotNull(message = "first_name doesn't take a null value")
    @Column(name = "first_name")
    private String first_name;

    @NotNull(message = "last_name doesn't take a null value")
    @Column(name = "last_name")
    private String last_name;

    @NotNull(message = "number phone doesn't take a null value")
    @Column(name = "phone")
    private String phone;


    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "role_id", unique = false, referencedColumnName = "id_role")
    private Roles role_id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "genre_id", unique = false, referencedColumnName = "id_genre")
    private Genres genre_id;


    public Users() {
        this.uuid_user=UUID.randomUUID();
    }
    public long getId_user() {
        return id_user;
    }
    public UUID getUuid_user() {
        return uuid_user;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Roles getRole_id() {
        return role_id;
    }

    public void setRole_id(Roles role_id) {
        this.role_id = role_id;
    }

    public Genres getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Genres genre_id) {
        this.genre_id = genre_id;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id_user=" + id_user +
                ", uuid_user=" + uuid_user +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone='" + phone + '\'' +
                ", genre=" + genre_id +
                ", role=" + role_id +
                '}';
    }
}

