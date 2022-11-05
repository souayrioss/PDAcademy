package com.pda.pdacademy.repository;


import com.pda.pdacademy.entity.Responsable;
import com.pda.pdacademy.repository.Irepository;

public class ResponsableRepository implements Irepository<Responsable> {
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
    public Responsable findByEmail(String Email) {
        return null;
    }
}
