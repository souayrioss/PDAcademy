package com.pda.pdacademy.dao;

import com.pda.pdacademy.entity.Admin;
import com.pda.pdacademy.dao.Idao;

import java.util.ArrayList;

public class AdminDao implements Idao<Admin> {
    @Override
    public Admin find(long id) {
        return null;
    }

    @Override
    public ArrayList<Admin> getAll() {
        return null;
    }

    @Override
    public Admin add(Admin Admin) {
        return null;
    }

    @Override
    public void update(Admin Admin) {
        return;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
