package com.pda.pdacademy.repository;


import com.pda.pdacademy.entity.Responsable;


public class ResponsableRepository implements IrepositoryAuth<Responsable> {
    @Override
    public Responsable login(String Email, String Password) {
        return null;
    }

    @Override
    public void logout() {

    }

    @Override
    public Responsable findByEmail(String Email) {
        return null;
    }


}
