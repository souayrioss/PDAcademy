package com.pda.pdacademy.repository;

import com.pda.pdacademy.entity.Exercise;
import com.pda.pdacademy.repository.Irepository;

public class ExerciseRepository implements Irepository<Exercise> {
    @Override
    public Exercise login(String Email, String Password) {
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
    public Exercise findByEmail(String Email) {
        return null;
    }

    @Override
    public Exercise findByLogin(String Email) {
        return null;
    }
}
