package com.pda.pdacademy.repository;

import com.pda.pdacademy.entity.User;
import com.pda.pdacademy.dao.Idao;
import com.pda.pdacademy.dao.UserDao;

public class UserRepository implements Irepository<User> {
    Idao<User> userDao = new UserDao();

    @Override
    public User login(String Email, String Password) {
        User user = new UserRepository().findByEmail(Email);
        if(user.getFirst_name() == null){return null;}
        return  (user.getLast_name().equals(Password)) ? user : null;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean updatePasswordById(String newPassword, long user_id) {
        return false;
    }

    @Override
    public User findByEmail(String Email) {
        return null;
    }

    @Override
    public User findByLogin(String Email) {
        return null;
    }
}
