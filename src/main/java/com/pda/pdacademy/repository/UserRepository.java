package com.pda.pdacademy.repository;

import com.pda.pdacademy.entity.User;
import com.pda.pdacademy.dao.Idao;
import com.pda.pdacademy.dao.UserDao;

public class UserRepository implements IrepositoryAuth<User> {
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
    public User findByEmail(String Email) {
        return null;
    }

}
