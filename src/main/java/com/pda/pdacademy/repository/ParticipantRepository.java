package com.pda.pdacademy.repository;

import com.pda.pdacademy.entity.Participant;
import com.pda.pdacademy.repository.Irepository;

public class ParticipantRepository implements Irepository<Participant> {
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
    public Participant findByEmail(String Email) {
        return null;
    }

    @Override
    public Participant findByLogin(String Email) {
        return null;
    }
}
