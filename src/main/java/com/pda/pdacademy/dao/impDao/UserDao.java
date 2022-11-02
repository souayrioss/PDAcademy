package com.pda.pdacademy.dao.impDao;

import com.pda.pdacademy.beans.Users;
import com.pda.pdacademy.dao.Idao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;

public class UserDao implements Idao<Users> {
    @Override
    public Users find(long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PDAcademy");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Users user = entityManager.find(Users.class, id);
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
        return user;
    }

    @Override
    public ArrayList<Users> getAll() {
        return null;
    }

    @Override
    public Users add(Users users) {
        return null;
    }

    @Override
    public Users update(Users users) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
