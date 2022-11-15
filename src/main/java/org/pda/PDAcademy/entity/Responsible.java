package org.loukili.javac.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.io.Serializable;

@Entity
public class Responsible extends User implements Serializable {

  public Responsible() {
  }

  @Column(name = "domain")
  private String domain;

  @Enumerated(EnumType.STRING)
  @Column(name = "responsible_type")
  private ResponsibleType responsibleType;

  @Enumerated(EnumType.STRING)
  @Column(name = "state")
  private State state;

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public ResponsibleType getResponsibleType() {
    return responsibleType;
  }

  public void setResponsibleType(ResponsibleType responsibleType) {
    this.responsibleType = responsibleType;
  }

  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }
}
