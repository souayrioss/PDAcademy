package com.pda.pdacademy.services;

import com.pda.pdacademy.entity.User;
import com.pda.pdacademy.repository.UserRepository;
import com.pda.pdacademy.repository.Irepository;

import java.util.List;

public class UserService implements Iservice<User> {

    private Irepository<User> userRepository = new UserRepository();
    @Override
    public User login(String Email, String Password) {
        return userRepository.login(Email,Password);
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean updatePasswordById(String newPassword, long user_id) {
        return false;
    }

    @Override
    public User find(long id) {
        return null;
    }

    @Override
    public User findByEmail(String Email) {
        return null;
    }

    @Override
    public List getAll() {
        return null;
    }

    @Override
    public User add(User user) {
        return null;
    }

    @Override
    public void update(User user) {
        return ;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
