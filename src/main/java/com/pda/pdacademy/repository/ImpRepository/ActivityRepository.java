package com.pda.pdacademy.repository.ImpRepository;

import com.pda.pdacademy.beans.Activities;
import com.pda.pdacademy.repository.Irepository;

import java.util.ArrayList;

public class ActivityRepository implements Irepository<Activities> {
    @Override
    public boolean login(String Email, String Password) {
        return true;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean updatePasswordById(String newPassword, long user_id) {
        return false;
    }


    @Override
    public Activities findByEmail(String Email) {
        return null;
    }


}
