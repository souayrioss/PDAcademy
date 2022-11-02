package com.pda.pdacademy.services.ImpService;

import com.pda.pdacademy.beans.Admins;
import com.pda.pdacademy.beans.Users;
import com.pda.pdacademy.repository.ImpRepository.AdminRepository;
import com.pda.pdacademy.repository.ImpRepository.UserRepository;
import com.pda.pdacademy.repository.Irepository;
import com.pda.pdacademy.services.Iservice;

import java.util.ArrayList;

public class AdminService implements Iservice<Admins> {
    private Irepository<Admins> adminRepository = new AdminRepository();
    @Override
    public boolean login(String Email, String Password) {
        return adminRepository.login(Email,Password);
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean updatePasswordById(String newPassword, long user_id) {
        return false;
    }

    @Override
    public Admins find(long id) {
        return null;
    }

    @Override
    public Admins findByEmail(String Email) {
        return null;
    }

    @Override
    public ArrayList<Admins> getAll() {
        return null;
    }

    @Override
    public Admins add(Admins user) {
        return null;
    }

    @Override
    public Admins update(Admins user) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
