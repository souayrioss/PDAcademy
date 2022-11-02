package com.pda.pdacademy.beans;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn( name = "id_user" )
public class Participants extends Users {

    @NotNull(message = "email doesn't take a null value")
    @Email
    @Column(name = "email")
    private String email;

    @NotNull(message = "domain doesn't take a null value")
    @Column(name = "domain")
    private String domain;

    @NotNull(message = "structure doesn't take a null value")
    @Column(name = "structure")
    private String structure;

    @ManyToMany
    @JoinTable( name = "T_Activity_Participant_Associations",
            joinColumns = @JoinColumn( name = "id_user" ),
            inverseJoinColumns = @JoinColumn( name = "id_activity" ) )
    private List<Activities> activities = new ArrayList<>();

    public Participants() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public List<Activities> getActivities() {
        return activities;
    }

    public void setActivities(List<Activities> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Participants{" +
                "email='" + email + '\'' +
                ", domain='" + domain + '\'' +
                ", structure='" + structure + '\'' +
                ", activities=" + activities +
                '}';
    }
}
