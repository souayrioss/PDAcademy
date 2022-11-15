package org.loukili.javac.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Id;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.loukili.javac.entity.Activity;
import org.loukili.javac.entity.Exercise;
import org.loukili.javac.hibernate.HibernateFactory;

import java.util.List;

public class ActivityDao implements Idao<Activity> {

  Transaction transaction = null;
  private EntityManager em = HibernateFactory.getEntityManager();
  private Session session = em.unwrap(Session.class);

  @Override
  public Activity find(long id) {
    em.getTransaction().begin();
    Activity activity = em.find(Activity.class, id);
    em.getTransaction().commit();
    return activity;
  }

  @Override
  public List<Activity> getAll() {
    List activities = null;
    try  {
      transaction = session.beginTransaction();
      Query query = session.createQuery("from Activity");
      activities = query.getResultList();
      transaction.commit();
    } catch (Exception e) {
      if (transaction != null) {
        transaction.rollback();
      }
      e.printStackTrace();
    }
    return activities;
  }

  @Override
  public Activity add(Activity activity) {
    transaction = (Transaction) em.getTransaction();
    transaction.begin();
    em.merge(activity);
    transaction.commit();
    return activity;
  }

  @Override
  public void update(Activity activity) {
    transaction = (Transaction) em.getTransaction();
    transaction.begin();
    em.merge(activity);
    transaction.commit();
  }

  @Override
  public boolean delete(long id) {
    em.getTransaction().begin();
    Activity activity = em.find(Activity.class, id);
    em.getTransaction().commit();
    if (activity != null) {
      session.beginTransaction();
      session.delete(activity);
      System.out.println("activity is deleted");
      session.getTransaction().commit();
      return true;
    }
    return false;
  }
}
