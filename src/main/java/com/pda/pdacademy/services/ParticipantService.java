package com.pda.pdacademy.services;

import com.pda.pdacademy.entity.Participant;
import com.pda.pdacademy.services.Iservice;

import java.util.ArrayList;

public class ParticipantService implements Iservice<Participant> {
    @Override
    public Participant login(String Email, String Password) {
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
    public Participant find(long id) {
        return null;
    }

    @Override
    public Participant findByEmail(String Email) {
        return null;
    }

    @Override
    public ArrayList<Participant> getAll() {
        return null;
    }

    @Override
    public Participant add(Participant user) {
        return null;
    }

    @Override
    public Participant update(Participant user) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
