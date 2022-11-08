package com.pda.pdacademy.services;

import com.pda.pdacademy.entity.Exercise;

import java.util.List;

public class ExerciseService implements Iservice<Exercise> {
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
    public Exercise find(long id) {
        return null;
    }

    @Override
    public Exercise findByEmail(String Email) {
        return null;
    }

    @Override
    public List<Exercise> getAll() {
        return null;
    }

    @Override
    public Exercise add(Exercise user) {
        return null;
    }

    @Override
    public void update(Exercise user) {
        return ;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
