package org.loukili.javac.repository;

import org.loukili.javac.entity.Responsible;

public class ResponsibleRepository implements IAuthRepository<Responsible>{
  @Override
  public Responsible login(String Email, String Password) {
    return null;
  }

  @Override
  public void logout() {

  }

  @Override
  public Responsible findByEmail(String Email) {
    return null;
  }
}
