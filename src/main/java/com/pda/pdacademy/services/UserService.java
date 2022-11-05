package com.pda.pdacademy.services;

import com.pda.pdacademy.entity.Users;
import com.pda.pdacademy.repository.UserRepository;
import com.pda.pdacademy.repository.Irepository;
import com.pda.pdacademy.services.Iservice;

import java.util.ArrayList;

public class UserService implements Iservice<Users> {

    private Irepository<Users> userRepository = new UserRepository();
    @Override
    public Users login(String Email, String Password) {
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
    public Users find(long id) {
        return null;
    }

    @Override
    public Users findByEmail(String Email) {
        return null;
    }

    @Override
    public ArrayList<Users> getAll() {
        return null;
    }

    @Override
    public Users add(Users user) {
        return null;
    }

    @Override
    public Users update(Users user) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
