package com.pda.pdacademy.dao;

import com.pda.pdacademy.entity.Activity;
import com.pda.pdacademy.hibernate.HibernateFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class ActivityDao implements Idao<Activity> {
  Transaction transaction = null;

  private EntityManager em = new HibernateFactory().getEntityManager();
  // to work with session, uncomment the following line:
  private Session session = em.unwrap(Session.class);
    @Override
    public Activity find(long id) {
        return null;
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
    public Activity add(Activity activities) {
      // TODO this method is not completed yet

      return null;
    }

    @Override
    public Activity update(Activity activities) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
