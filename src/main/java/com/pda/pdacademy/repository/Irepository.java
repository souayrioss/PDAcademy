package com.pda.pdacademy.repository;

import java.util.ArrayList;

public interface Irepository<Entity> {
    boolean login(String Email, String Password);
    void logout();
    boolean updatePasswordById(String newPassword, long user_id);
    Entity findByEmail(String Email);

}
