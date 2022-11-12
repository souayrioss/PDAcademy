package com.pda.pdacademy.services;

import com.pda.pdacademy.dao.ActivityDao;
import com.pda.pdacademy.dao.Idao;
import com.pda.pdacademy.dao.ResponsableDao;
import com.pda.pdacademy.entity.Activity;
import com.pda.pdacademy.entity.Responsable;

import java.util.List;

public class ResponsableService implements Iservice<Responsable> {

    private Idao<Responsable> responsableIdao = new ResponsableDao();
    @Override
    public Responsable login(String Email, String Password) {
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
    public Responsable find(long id) {
         return responsableIdao.find(id);
    }

    @Override
    public Responsable findByEmail(String Email) {
        return null;
    }

    @Override
    public List<Responsable> getAll() {
        return responsableIdao.getAll();
    }

    @Override
    public Responsable add(Responsable user) {
        return null;
    }

    @Override
    public void update(Responsable user) {
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
