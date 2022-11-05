package com.pda.pdacademy.services;

import com.pda.pdacademy.entity.Activity;
import com.pda.pdacademy.services.Iservice;

import java.util.ArrayList;

public class ActivityService implements Iservice<Activity> {
    @Override
    public Activity login(String Email, String Password) {
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
    public Activity find(long id) {
        return null;
    }

    @Override
    public Activity findByEmail(String Email) {
        return null;
    }

    @Override
    public ArrayList<Activity> getAll() {
        return null;
    }

    @Override
    public Activity add(Activity user) {
        return null;
    }

    @Override
    public Activity update(Activity user) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
