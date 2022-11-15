package org.loukili.javac.repository;

import org.loukili.javac.entity.Admin;

public class AdminRepository implements IAuthRepository<Admin>{
  @Override
  public Admin login(String Email, String Password) {
    return null;
  }

  @Override
  public void logout() {

  }

  @Override
  public Admin findByEmail(String Email) {
    return null;
  }
}
