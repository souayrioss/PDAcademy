package com.pda.pdacademy.hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateFactory {
  public EntityManager getEntityManager(){
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PDAcademy");
    return entityManagerFactory.createEntityManager();
  }
}
