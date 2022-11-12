package com.pda.pdacademy.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Activity")
public class Activity implements Serializable {
    @NotNull
    @Id
    @Column(name = "id_activity")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "activiy_seq_gen")
    @SequenceGenerator(name = "activiy_seq_gen", sequenceName = "activiy_id_seq" ,initialValue = 1,allocationSize = 1)
    private long id_activity ;

    @Column(name = "uuid_activity",length = 60)
    private UUID uuid_activity;

    @NotNull(message = "title activity doesn't take a null value")
    @Column(name = "title_activity")
    private String title_activity;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private ActiviteType activiteType;

    @NotNull(message = "description activity doesn't take a null value")
    @Column(name = "description_activity")
    private String description_activity;

    @NotNull(message = "start date activity doesn't take a null value")
    @Column(name = "start_date_activity")
    private Date start_date_activity;

    @NotNull(message = "end date activity doesn't take a null value")
    @Column(name = "end_date_activity")
    private Date end_date_activity;

    @Enumerated(EnumType.STRING)
    @Column(name = "etat")
    private Etat etat;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "responsable_id", unique = false, referencedColumnName = "id_user")
    private Responsable responsable_id;

    @ManyToMany
    @JoinTable( name = "T_Activity_Participant_Associations",
            joinColumns = @JoinColumn( name = "id_activity" ),
            inverseJoinColumns = @JoinColumn( name = "id_user" ) )
    private List<Participant> participantList = new ArrayList<>();

    @ManyToMany
    @JoinTable( name = "T_Activity_Exercise_Associations",
            joinColumns = @JoinColumn( name = "id_activity" ),
            inverseJoinColumns = @JoinColumn( name = "id_exercise" ) )
    private List<Exercise> exerciseList = new ArrayList<>();


    public Activity() {
        this.uuid_activity=UUID.randomUUID();
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

    public ActiviteType getActiviteType() {
        return activiteType;
    }

    public void setActiviteType(ActiviteType activiteType) {
        this.activiteType = activiteType;
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

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Responsable getResponsable_id() {
        return responsable_id;
    }

    public void setResponsable_id(Responsable responsable_id) {
        this.responsable_id = responsable_id;
    }

    public List<Participant> getParticipantList() {
        return participantList;
    }

    public void setParticipantList(List<Participant> participantList) {
        this.participantList = participantList;
    }

    public List<Exercise> getExerciseList() {
        return exerciseList;
    }

    public void setExerciseList(List<Exercise> exerciseList) {
        this.exerciseList = exerciseList;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id_activity=" + id_activity +
                ", uuid_activity=" + uuid_activity +
                ", title_activity='" + title_activity + '\'' +
                ", activiteType=" + activiteType +
                ", description_activity='" + description_activity + '\'' +
                ", start_date_activity=" + start_date_activity +
                ", end_date_activity=" + end_date_activity +
                ", etat=" + etat +
                ", responsable_id=" + responsable_id +
                ", participantList=" + participantList +
                ", exerciseList=" + exerciseList +
                '}';
    }
}
