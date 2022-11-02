package com.pda.pdacademy.repository.ImpRepository;

import com.pda.pdacademy.beans.Users;
import com.pda.pdacademy.dao.Idao;
import com.pda.pdacademy.dao.impDao.UserDao;
import com.pda.pdacademy.repository.Irepository;

public class UserRepository implements Irepository<Users> {
    Idao<Users> userDao = new UserDao();

    @Override
    public boolean login(String Email, String Password) {
        Users user = new UserRepository().findByEmail(Email);
        if(user.getFirst_name() == null){return false;}
        return  (user.getLast_name().equals(Password)) ? true : false;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean updatePasswordById(String newPassword, long user_id) {
        return false;
    }

    @Override
    public Users findByEmail(String Email) {
        return null;
    }
}
