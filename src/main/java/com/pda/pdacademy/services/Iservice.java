package com.pda.pdacademy.services;

import java.util.ArrayList;

public interface Iservice<Entity> {
    Entity login(String Email, String Password);
    void logout();
    boolean updatePasswordById(String newPassword, long user_id);
    Entity find(long id);
    Entity findByEmail(String Email);
    ArrayList<Entity> getAll();
    Entity add(Entity user);
    Entity update(Entity user);
    boolean delete(long id);
}
