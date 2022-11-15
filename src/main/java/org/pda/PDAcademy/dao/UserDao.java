package org.loukili.javac.dao;

import org.loukili.javac.entity.User;

import java.util.List;

public class UserDao implements Idao<User> {
  @Override
  public User find(long id) {
    return null;
  }

  @Override
  public List<User> getAll() {
    return null;
  }

  @Override
  public User add(User entity) {
    return null;
  }

  @Override
  public void update(User entity) {

  }

  @Override
  public boolean delete(long id) {
    return false;
  }
}
