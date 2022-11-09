package com.pda.pdacademy.dao;

import com.pda.pdacademy.entity.Activity;
import com.pda.pdacademy.entity.Admin;
import com.pda.pdacademy.dao.Idao;
import com.pda.pdacademy.hibernate.HibernateFactory;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class AdminDao implements Idao<Admin> {
    Transaction transaction = null;

    private final EntityManager em = new HibernateFactory().getEntityManager();
    // to work with session, uncomment the following line:
    private final Session session = em.unwrap(Session.class);
    @Override
    public Admin find(long id) {
        transaction = (Transaction) em.getTransaction();
        transaction.begin();
        Admin activity = em.find(Admin.class, id);
        transaction.commit();
        return activity;
    }
    @Override
    public ArrayList<Admin> getAll() {
        return null;
    }

    @Override
    public Admin add(Admin Admin) {
        return null;
    }

    @Override
    public void update(Admin Admin) {
        return;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
