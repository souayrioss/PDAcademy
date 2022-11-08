package com.pda.pdacademy.repository;

import com.pda.pdacademy.entity.Admin;
import com.pda.pdacademy.dao.Idao;
import com.pda.pdacademy.dao.AdminDao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AdminRepository implements Irepository<Admin> {
    Idao<Admin> adminDao = new AdminDao();
    @Override
    public Admin login(String Email, String Password) {
        Admin admin = new AdminRepository().findByEmail(Email);

        if(admin == null){
            admin = new AdminRepository().findByLogin(Email);
            if(admin == null ){
                return null;
            }
        }
        return  (admin.getPassword().equals(Password)) ? admin : null;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean updatePasswordById(String newPassword, long user_id) {
        return false;
    }

    @Override
    public Admin findByEmail(String Email) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PDAcademy");
        entityManagerFactory.isOpen();
        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.getTransaction().commit();
            return entityManager.createQuery("SELECT adm FROM Admin adm WHERE adm.email LIKE :email",Admin.class).setParameter("email", Email).getSingleResult();
        }catch(Exception e){
            return null;
        }
    }
    @Override
    public Admin findByLogin(String Email) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PDAcademy");
        entityManagerFactory.isOpen();
        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.getTransaction().commit();
            return entityManager.createQuery("SELECT adm FROM Admin adm WHERE adm.login LIKE :email",Admin.class).setParameter("email", Email).getSingleResult();
        }catch(Exception e){
            return null;
        }
    }
}
