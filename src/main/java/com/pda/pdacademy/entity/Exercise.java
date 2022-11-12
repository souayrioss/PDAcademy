package com.pda.pdacademy.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name ="exercise")
public class Exercise implements Serializable {

    @NotNull
    @Id
    @Column(name = "id_exercise")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "exercise_seq_gen")
    @SequenceGenerator(name = "exercise_seq_gen", sequenceName = "exercise_id_seq" ,initialValue = 1,allocationSize = 1)
    private long id_exercise ;

    @Column(name = "uuid_exercise",length = 60)
    private UUID uuid_exercise;

    @NotNull()
    @Column(name = "annee_exercise")
    private Date annee_exercise;

    @NotNull()
    @Column(name = "start_date_exercise")
    private Date start_date_exercise;

    @NotNull()
    @Column(name = "end_date_exercise")
    private Date end_date_exercise;

    @Enumerated(EnumType.STRING)
    @Column(name = "statut")
    private Statut statut;

    @ManyToMany
    @JoinTable( name = "T_Activity_Exercise_Associations",
            joinColumns = @JoinColumn( name = "id_exercise" ),
            inverseJoinColumns = @JoinColumn( name = "id_activity" ) )
    private List<Activity> activityList = new ArrayList<>();

    public Exercise() {
    }

    public long getId_exercise() {
        return id_exercise;
    }

    public void setId_exercise(long id_exercise) {
        this.id_exercise = id_exercise;
    }

    public UUID getUuid_exercise() {
        return uuid_exercise;
    }

    public void setUuid_exercise(UUID uuid_exercise) {
        this.uuid_exercise = uuid_exercise;
    }

    public Date getAnnee_exercise() {
        return annee_exercise;
    }

    public void setAnnee_exercise(Date annee_exercise) {
        this.annee_exercise = annee_exercise;
    }

    public Date getStart_date_exercise() {
        return start_date_exercise;
    }

    public void setStart_date_exercise(Date start_date_exercise) {
        this.start_date_exercise = start_date_exercise;
    }

    public Date getEnd_date_exercise() {
        return end_date_exercise;
    }

    public void setEnd_date_exercise(Date end_date_exercise) {
        this.end_date_exercise = end_date_exercise;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }

    @Override
    public String toString() {
        return "Exercises{" +
                "id_exercise=" + id_exercise +
                ", uuid_exercise=" + uuid_exercise +
                ", annee_exercise=" + annee_exercise +
                ", start_date_exercise=" + start_date_exercise +
                ", end_date_exercise=" + end_date_exercise +
                ", statut_id=" + statut +
                ", activities=" + activityList +
                '}';
    }
}
