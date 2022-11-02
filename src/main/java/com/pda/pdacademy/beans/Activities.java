package com.pda.pdacademy.beans;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Activities implements Serializable {
    @NotNull
    @Id
    @Column(name = "id_activity")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_activity ;

    @Column(name = "uuid_activity",length = 60)
    private UUID uuid_activity;

    @NotNull(message = "title activity doesn't take a null value")
    @Column(name = "title_activity")
    private String title_activity;

    @Column(name = "type")
    private Types type;

    @NotNull(message = "description activity doesn't take a null value")
    @Column(name = "description_activity")
    private String description_activity;

    @NotNull(message = "start date activity doesn't take a null value")
    @Column(name = "start_date_activity")
    private Date start_date_activity;

    @NotNull(message = "end date activity doesn't take a null value")
    @Column(name = "end_date_activity")
    private Date end_date_activity;

    @Column(name = "etat")
    private Etats etat;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "responsable_id", unique = false, referencedColumnName = "id_user")
    private Responsables responsable_id;

    @ManyToMany
    @JoinTable( name = "T_Activity_Participant_Associations",
            joinColumns = @JoinColumn( name = "id_activity" ),
            inverseJoinColumns = @JoinColumn( name = "id_user" ) )
    private List<Participants> participants = new ArrayList<>();

    @ManyToMany
    @JoinTable( name = "T_Activity_Exercise_Associations",
            joinColumns = @JoinColumn( name = "id_activity" ),
            inverseJoinColumns = @JoinColumn( name = "id_exercise" ) )
    private List<Exercises> exercises = new ArrayList<>();


    public Activities() {
    }

    public long getId_activity() {
        return id_activity;
    }

    public void setId_activity(long id_activity) {
        this.id_activity = id_activity;
    }

    public UUID getUuid_activity() {
        return uuid_activity;
    }

    public void setUuid_activity(UUID uuid_activity) {
        this.uuid_activity = uuid_activity;
    }

    public String getTitle_activity() {
        return title_activity;
    }

    public void setTitle_activity(String title_activity) {
        this.title_activity = title_activity;
    }

    public Types getType_id() {
        return type;
    }

    public void setType_id(Types type) {
        this.type = type;
    }

    public String getDescription_activity() {
        return description_activity;
    }

    public void setDescription_activity(String description_activity) {
        this.description_activity = description_activity;
    }

    public Date getStart_date_activity() {
        return start_date_activity;
    }

    public void setStart_date_activity(Date start_date_activity) {
        this.start_date_activity = start_date_activity;
    }

    public Date getEnd_date_activity() {
        return end_date_activity;
    }

    public void setEnd_date_activity(Date end_date_activity) {
        this.end_date_activity = end_date_activity;
    }

    public Etats getEtat_id() {
        return etat;
    }

    public void setEtat_id(Etats etat) {
        this.etat = etat;
    }

    public Responsables getResponsable_id() {
        return responsable_id;
    }

    public void setResponsable_id(Responsables responsable_id) {
        this.responsable_id = responsable_id;
    }

    public List<Participants> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participants> participants) {
        this.participants = participants;
    }

    public List<Exercises> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercises> exercises) {
        this.exercises = exercises;
    }

    @Override
    public String toString() {
        return "Activities{" +
                "id_activity=" + id_activity +
                ", uuid_activity=" + uuid_activity +
                ", title_activity='" + title_activity + '\'' +
                ", type_id=" + type +
                ", description_activity='" + description_activity + '\'' +
                ", start_date_activity=" + start_date_activity +
                ", end_date_activity=" + end_date_activity +
                ", etat_id=" + etat +
                ", responsable_id=" + responsable_id +
                ", participants=" + participants +
                ", exercises=" + exercises +
                '}';
    }
}
