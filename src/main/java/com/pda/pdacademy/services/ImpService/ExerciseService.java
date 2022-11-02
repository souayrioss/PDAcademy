package com.pda.pdacademy.services.ImpService;

import com.pda.pdacademy.beans.Exercises;
import com.pda.pdacademy.services.Iservice;

import java.util.ArrayList;

public class ExerciseService implements Iservice<Exercises> {
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
    public Exercises find(long id) {
        return null;
    }

    @Override
    public Exercises findByEmail(String Email) {
        return null;
    }

    @Override
    public ArrayList<Exercises> getAll() {
        return null;
    }

    @Override
    public Exercises add(Exercises user) {
        return null;
    }

    @Override
    public Exercises update(Exercises user) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
