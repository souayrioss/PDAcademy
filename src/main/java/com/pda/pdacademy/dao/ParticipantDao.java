package com.pda.pdacademy.dao;

import com.pda.pdacademy.entity.Participant;
import com.pda.pdacademy.dao.Idao;

import java.util.ArrayList;

public class ParticipantDao implements Idao<Participant> {
    @Override
    public Participant find(long id) {
        return null;
    }

    @Override
    public ArrayList<Participant> getAll() {
        return null;
    }

    @Override
    public Participant add(Participant participant) {
        return null;
    }

    @Override
    public void update(Participant participant) {
        return;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
