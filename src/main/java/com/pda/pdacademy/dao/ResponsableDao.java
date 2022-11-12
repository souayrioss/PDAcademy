package com.pda.pdacademy.dao;

import com.pda.pdacademy.entity.Activity;
import com.pda.pdacademy.entity.Responsable;
import com.pda.pdacademy.hibernate.HibernateFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class ResponsableDao implements Idao<Responsable> {
    /*
    Transaction transaction = null;

    private final EntityManager em = new HibernateFactory().getEntityManager();
    private final Session session = em.unwrap(Session.class);


    @Override
    public Responsable find(long id) {
        transaction = (Transaction) em.getTransaction();
        transaction.begin();
        Responsable responsable = em.find(Responsable.class, id);
        transaction.commit();
        return responsable;
    }

    @Override
    public List<Responsable> getAll() {
        List responsables = null;
        try  {
            transaction = session.beginTransaction();
            Query query = session.createQuery("from Responsable ");
            responsables = query.getResultList();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return responsables;
    }

    @Override
    public Responsable add(Responsable Responsable) {
        return null;
    }

    @Override
    public void update(Responsable Responsable) {
        return;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

     */
}
