package org.loukili.javac.dao;

import org.loukili.javac.entity.Participant;

import java.util.List;

public class ParticipantDao implements Idao<Participant> {
  @Override
  public Participant find(long id) {
    return null;
  }

  @Override
  public List<Participant> getAll() {
    return null;
  }

  @Override
  public Participant add(Participant entity) {
    return null;
  }

  @Override
  public void update(Participant entity) {

  }

  @Override
  public boolean delete(long id) {
    return false;
  }
}
