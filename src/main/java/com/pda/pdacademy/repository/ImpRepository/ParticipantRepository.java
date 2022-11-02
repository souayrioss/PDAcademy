package com.pda.pdacademy.repository.ImpRepository;

import com.pda.pdacademy.beans.Participants;
import com.pda.pdacademy.repository.Irepository;

public class ParticipantRepository implements Irepository<Participants> {
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
    public Participants findByEmail(String Email) {
        return null;
    }
}
