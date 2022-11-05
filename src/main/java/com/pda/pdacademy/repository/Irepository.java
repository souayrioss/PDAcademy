package com.pda.pdacademy.repository;


public interface Irepository<Entity> {
    Entity login(String Email, String Password);
    void logout();
    boolean updatePasswordById(String newPassword, long user_id);
    Entity findByEmail(String Email);

}
