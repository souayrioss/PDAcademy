package org.loukili.javac.dao;

import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.loukili.javac.entity.Exercise;
import org.loukili.javac.hibernate.HibernateFactory;

import java.util.List;

public class ExerciseDao  implements Idao<Exercise>{
  Transaction transaction = null;

  private EntityManager em = HibernateFactory.getEntityManager();
  private Session session = em.unwrap(Session.class);


  @Override
  public Exercise find(long id) {
    em.getTransaction().begin();
    Exercise exercise = em.find(Exercise.class, id);
    em.getTransaction().commit();
    return exercise;
  }

  @Override
  public List<Exercise> getAll() {
    List exercises = null;
    try  {
      transaction = session.beginTransaction();
      Query query = session.createQuery("from Exercise");
      exercises = query.getResultList();
      transaction.commit();
    } catch (Exception e) {
      if (transaction != null) {
        transaction.rollback();
      }
      e.printStackTrace();
    }
    return exercises;
  }

  @Override
  public Exercise add(Exercise exercise) {
    transaction = (Transaction) em.getTransaction();
    transaction.begin();
    em.persist(exercise);
    transaction.commit();
    return exercise;
  }

  @Override
  public void update(Exercise exercise) {
    transaction = (Transaction) em.getTransaction();
    transaction.begin();
    em.merge(exercise);
    transaction.commit();
  }

  @Override
  public boolean delete(long id) {
    em.getTransaction().begin();
    Exercise exercise = em.find(Exercise.class, id);
    em.getTransaction().commit();
    if (exercise != null) {
      session.beginTransaction();
      session.delete(exercise);
      System.out.println("exercise is deleted");
      session.getTransaction().commit();
      return true;
    }
    return false;
  }
}
