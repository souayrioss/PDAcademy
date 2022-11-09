package com.pda.pdacademy.dao;

import com.pda.pdacademy.entity.User;
import com.pda.pdacademy.dao.Idao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;

public class UserDao implements Idao<User> {
    @Override
    public User find(long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PDAcademy");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, id);
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
        return user;
    }

    @Override
    public ArrayList<User> getAll() {
        return null;
    }

    @Override
    public User add(User User) {
        return null;
    }

    @Override
    public void update(User User) {
        return;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
