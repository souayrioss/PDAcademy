package org.loukili.javac.repository;

public interface IAuthRepository<T> {

  T login(String Email, String Password);

  void logout();

  T findByEmail(String Email);
}
