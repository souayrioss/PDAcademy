package com.pda.pdacademy.repository.ImpRepository;

import com.pda.pdacademy.beans.Admins;
import com.pda.pdacademy.dao.Idao;
import com.pda.pdacademy.dao.impDao.AdminDao;
import com.pda.pdacademy.repository.Irepository;

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

        return null;
    }
}
