package org.loukili.javac.dao;

import java.util.List;

public interface Idao<T> {
  T find(long id);
  List<T> getAll();
  T add(T entity);
  void update(T entity);
  boolean delete(long id);
}
