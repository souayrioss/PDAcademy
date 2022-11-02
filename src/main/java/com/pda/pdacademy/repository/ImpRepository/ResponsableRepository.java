package com.pda.pdacademy.repository.ImpRepository;

import com.pda.pdacademy.beans.Responsables;
import com.pda.pdacademy.repository.Irepository;

public class ResponsableRepository implements Irepository<Responsables> {
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
    public Responsables findByEmail(String Email) {
        return null;
    }
}
