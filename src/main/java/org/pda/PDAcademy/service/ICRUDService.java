package org.loukili.javac.service;

import java.util.List;

public interface ICRUDService<T> {
  T find(long id);
  List<T> getAll();
  T add(T user);
  void update(T user);
  boolean delete(long id);
}
