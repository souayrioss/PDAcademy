package com.pda.pdacademy.services.ImpService;

import com.pda.pdacademy.beans.Participants;
import com.pda.pdacademy.services.Iservice;

import java.util.ArrayList;

public class ParticipantService implements Iservice<Participants> {
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
    public Participants find(long id) {
        return null;
    }

    @Override
    public Participants findByEmail(String Email) {
        return null;
    }

    @Override
    public ArrayList<Participants> getAll() {
        return null;
    }

    @Override
    public Participants add(Participants user) {
        return null;
    }

    @Override
    public Participants update(Participants user) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
