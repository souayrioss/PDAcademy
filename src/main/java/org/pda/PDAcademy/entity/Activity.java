package org.loukili.javac.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Activity implements Serializable {
  public Activity() {
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "title")
  private String title;

  @Lob
  @Column(name = "description")
  private String description;

  @Enumerated(EnumType.STRING)
  @Column(name = "activity_type", nullable = false)
  private ActivityType activityType;

  @Column(name = "start_date", nullable = false)
  private Date startDate;

  @Column(name = "end_date", nullable = false)
  private Date endDate;

  @Enumerated(EnumType.STRING)
  @Column(name = "state")
  private State state;


  @ManyToMany
  @JoinTable(name = "Activity_participants",
    joinColumns = @JoinColumn(name = "activity_id"),
    inverseJoinColumns = @JoinColumn(name = "participants_id"))
  private List<Participant> participants = new ArrayList<>();

  @ManyToMany(cascade = CascadeType.DETACH)
  @JoinTable(name = "Activity_exercises",
    joinColumns = @JoinColumn(name = "activity_id"),
    inverseJoinColumns = @JoinColumn(name = "exercises_id"))
  private List<Exercise> exercises = new ArrayList<>();

  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "responsible_id")
  private Responsible responsible;

  public Responsible getResponsible() {
    return responsible;
  }

  public void setResponsible(Responsible responsible) {
    this.responsible = responsible;
  }

  public List<Exercise> getExercises() {
    return exercises;
  }

  public void setExercises(List<Exercise> exercises) {
    this.exercises = exercises;
  }

  public List<Participant> getParticipants() {
    return participants;
  }

  public void setParticipants(List<Participant> participants) {
    this.participants = participants;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public ActivityType getActivityType() {
    return activityType;
  }

  public void setActivityType(ActivityType activityType) {
    this.activityType = activityType;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
