package org.loukili.javac.repository;

import org.loukili.javac.entity.Participant;

public class ParticipantRepository implements IAuthRepository<Participant>{
  @Override
  public Participant login(String Email, String Password) {
    return null;
  }

  @Override
  public void logout() {
  }

  @Override
  public Participant findByEmail(String Email) {
    return null;
  }
}
