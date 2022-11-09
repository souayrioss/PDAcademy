package com.pda.pdacademy.repository;

import com.pda.pdacademy.entity.Participant;
import com.pda.pdacademy.repository.IrepositoryAuth;

public class ParticipantRepository implements IrepositoryAuth<Participant> {
    @Override
    public Participant login(String Email, String Password) {
        return null;
    }

    @Override
    public void logout() {

    }

    @Override
    public Participant findByEmail(String Email) {
        return null;
    }


}
