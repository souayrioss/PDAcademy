package com.pda.pdacademy.services;

import com.pda.pdacademy.entity.Responsable;

import java.util.List;

public class ResponsableService implements Iservice<Responsable> {
    @Override
    public Responsable login(String Email, String Password) {
        return null;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean updatePasswordById(String newPassword, long user_id) {
        return false;
    }

    @Override
    public Responsable find(long id) {
        return null;
    }

    @Override
    public Responsable findByEmail(String Email) {
        return null;
    }

    @Override
    public List<Responsable> getAll() {
        return null;
    }

    @Override
    public Responsable add(Responsable user) {
        return null;
    }

    @Override
    public void update(Responsable user) {
        return;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
