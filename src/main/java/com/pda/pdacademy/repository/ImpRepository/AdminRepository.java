package com.pda.pdacademy.repository.ImpRepository;

import com.pda.pdacademy.beans.Admins;
import com.pda.pdacademy.dao.Idao;
import com.pda.pdacademy.dao.impDao.AdminDao;
import com.pda.pdacademy.repository.Irepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class AdminRepository implements Irepository<Admins> {
    Idao<Admins> adminDao = new AdminDao();
    @Override
    public boolean login(String Email, String Password) {
        Admins admin = new AdminRepository().findByEmail(Email);
        if(admin.getEmail() == null){return false;}
        return  (admin.getPassword().equals(Password)) ? true : false;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean updatePasswordById(String newPassword, long user_id) {
        return false;
    }

    @Override
    public Admins findByEmail(String Email) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PDAcademy");
        entityManagerFactory.isOpen();
        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.getTransaction().commit();
            return entityManager.createQuery("SELECT adm FROM Admins adm WHERE adm.email LIKE :email",Admins.class).setParameter("email", Email).getSingleResult();
        }catch(Exception e){
            return null;
        }
    }
}
