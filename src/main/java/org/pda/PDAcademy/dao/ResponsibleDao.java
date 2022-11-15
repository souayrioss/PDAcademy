package org.loukili.javac.dao;

import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.loukili.javac.entity.Activity;
import org.loukili.javac.entity.Responsible;
import org.loukili.javac.hibernate.HibernateFactory;

import java.util.List;

public class ResponsibleDao implements Idao<Responsible> {
  Transaction transaction = null;
  private EntityManager em = HibernateFactory.getEntityManager();
  private Session session = em.unwrap(Session.class);

  @Override
  public Responsible find(long id) {
    em.getTransaction().begin();
    Responsible responsible = em.find(Responsible.class, id);
    em.getTransaction().commit();
    return responsible;
  }

  @Override
  public List<Responsible> getAll() {
    List responsibles = null;
    try  {
      transaction = session.beginTransaction();
      Query query = session.createQuery("from Responsible");
      responsibles = query.getResultList();
      transaction.commit();
    } catch (Exception e) {
      if (transaction != null) {
        transaction.rollback();
      }
      e.printStackTrace();
    }
    return responsibles;
  }

  @Override
  public Responsible add(Responsible entity) {
    return null;
  }

  @Override
  public void update(Responsible entity) {

  }

  @Override
  public boolean delete(long id) {
    return false;
  }
}
