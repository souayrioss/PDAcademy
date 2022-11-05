package com.pda.pdacademy.services;

import com.pda.pdacademy.beans.Responsables;
import com.pda.pdacademy.services.Iservice;

import java.util.ArrayList;

public class ResponsableService implements Iservice<Responsables> {
    @Override
    public Responsables login(String Email, String Password) {
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
    public Responsables find(long id) {
        return null;
    }

    @Override
    public Responsables findByEmail(String Email) {
        return null;
    }

    @Override
    public ArrayList<Responsables> getAll() {
        return null;
    }

    @Override
    public Responsables add(Responsables user) {
        return null;
    }

    @Override
    public Responsables update(Responsables user) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
