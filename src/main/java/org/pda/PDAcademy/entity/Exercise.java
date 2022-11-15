package org.loukili.javac.entity;

import jakarta.persistence.*;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Exercise implements Serializable {
  public Exercise() {
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "year")
  private Integer year;

  @Column(name = "start_date")
  private Date startDate;

  @Column(name = "end_date")
  private Date endDate;

  @Enumerated(EnumType.STRING)
  @Column(name = "exercise_status")
  private ExerciseStatus exerciseStatus;

  @ManyToMany(mappedBy = "exercises", cascade = CascadeType.DETACH)
  private List<Activity> activities = new ArrayList<>();

  @Column(name = "title")
  private String title;

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<Activity> getActivities() {
    return activities;
  }

  public void setActivities(List<Activity> activities) {
    this.activities = activities;
  }

  public ExerciseStatus getExerciseStatus() {
    return exerciseStatus;
  }

  public void setExerciseStatus(ExerciseStatus exerciseStatus) {
    this.exerciseStatus = exerciseStatus;
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

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    Exercise exercise = (Exercise) o;
    return id != null && Objects.equals(id, exercise.id);
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}
