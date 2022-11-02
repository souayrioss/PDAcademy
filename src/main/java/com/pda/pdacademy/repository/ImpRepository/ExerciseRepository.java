package com.pda.pdacademy.repository.ImpRepository;

import com.pda.pdacademy.beans.Exercises;
import com.pda.pdacademy.repository.Irepository;

public class ExerciseRepository implements Irepository<Exercises> {
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
    public Exercises findByEmail(String Email) {
        return null;
    }
}
