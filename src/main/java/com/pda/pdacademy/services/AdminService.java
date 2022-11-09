package com.pda.pdacademy.services;

import com.pda.pdacademy.entity.Admin;
import com.pda.pdacademy.entity.User;
import com.pda.pdacademy.repository.AdminRepository;
import com.pda.pdacademy.repository.IrepositoryAuth;

import java.util.List;

public class AdminService implements Iservice<Admin> {
    private IrepositoryAuth<Admin> adminRepository = new AdminRepository();
    @Override
    public Admin login(String Email, String Password) {
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
    public Admin find(long id) {
        return null;
    }

    @Override
    public Admin findByEmail(String Email) {
        return null;
    }

    @Override
    public List<Admin> getAll() {
        return null;
    }

    @Override
    public Admin add(Admin user) {
        return null;
    }

    @Override
    public void update(Admin user) {
        return;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
