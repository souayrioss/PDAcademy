package com.pda.pdacademy.dao;

import com.pda.pdacademy.entity.Activity;
import com.pda.pdacademy.dao.Idao;
import com.pda.pdacademy.hibernate.HibernateFactory;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;

import java.util.ArrayList;

public class ActivityDao implements Idao<Activity> {
    @Override
    public Activity find(long id) {
        return null;
    }

    @Override
    public ArrayList<Activity> getAll() {
        return null;
    }

    @Override
    public Activity add(Activity activities) {
      EntityManager em = new HibernateFactory().getEntityManager();
      // to work with session, uncomment the following line:
//      Session session = em.unwrap(Session.class);
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
