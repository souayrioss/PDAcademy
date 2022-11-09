package com.pda.pdacademy.repository;

public interface IrepositoryAuth<T> {

    T login(String Email, String Password);

    void logout();


    T findByEmail(String Email);
}
