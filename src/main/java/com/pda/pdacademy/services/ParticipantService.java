package com.pda.pdacademy.services;

import com.pda.pdacademy.entity.Participant;
import com.pda.pdacademy.entity.User;

import java.util.List;

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
    public List<Participant> getAll() {
        return null;
    }

    @Override
    public Participant add(Participant user) {
        return null;
    }

    @Override
    public void update(Participant user) {
        return;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
