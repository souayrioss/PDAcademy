package com.pda.pdacademy.repository;

import com.pda.pdacademy.entity.Activity;
import com.pda.pdacademy.repository.Irepository;

public class ActivityRepository implements Irepository<Activity> {
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
    public Activity findByEmail(String Email) {
        return null;
    }

    @Override
    public Activity findByLogin(String Email) {
        return null;
    }


}
