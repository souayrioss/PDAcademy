package com.pda.pdacademy.services.ImpService;

import com.pda.pdacademy.beans.Activities;
import com.pda.pdacademy.services.Iservice;

import java.util.ArrayList;

public class ActivityService implements Iservice<Activities> {
    @Override
    public boolean login(String Email, String Password) {
        return false;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean updatePasswordById(String newPassword, long user_id) {
        return false;
    }

    @Override
    public Activities find(long id) {
        return null;
    }

    @Override
    public Activities findByEmail(String Email) {
        return null;
    }

    @Override
    public ArrayList<Activities> getAll() {
        return null;
    }

    @Override
    public Activities add(Activities user) {
        return null;
    }

    @Override
    public Activities update(Activities user) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
