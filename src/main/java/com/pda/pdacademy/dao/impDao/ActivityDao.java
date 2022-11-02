package com.pda.pdacademy.dao.impDao;

import com.pda.pdacademy.beans.Activities;
import com.pda.pdacademy.dao.Idao;
import com.pda.pdacademy.hibernate.HibernateFactory;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;

import java.util.ArrayList;

public class ActivityDao implements Idao<Activities> {
    @Override
    public Activities find(long id) {
        return null;
    }

    @Override
    public ArrayList<Activities> getAll() {
        return null;
    }

    @Override
    public Activities add(Activities activities) {
      EntityManager em = new HibernateFactory().getEntityManager();
      // to work with session, uncomment the following line:
//      Session session = em.unwrap(Session.class);
      // TODO this method is not completed yet

      return null;
    }

    @Override
    public Activities update(Activities activities) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
