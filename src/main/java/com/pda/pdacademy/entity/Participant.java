package com.pda.pdacademy.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Participant extends User {

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
    private List<Activity> activityList = new ArrayList<>();

    public Participant() {
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

    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }

    @Override
    public String toString() {
        return "Participants{" +
                "email='" + email + '\'' +
                ", domain='" + domain + '\'' +
                ", structure='" + structure + '\'' +
                ", activities=" + activityList +
                '}';
    }
}
