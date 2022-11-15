package org.loukili.javac.service;

import org.loukili.javac.dao.ExerciseDao;
import org.loukili.javac.dao.Idao;
import org.loukili.javac.entity.Exercise;

import java.util.List;

public class ExerciseService implements ICRUDService<Exercise> {
  private Idao<Exercise> exerciseDao = new ExerciseDao();

  @Override
  public Exercise find(long id) {
    return exerciseDao.find(id);
  }

  @Override
  public List<Exercise> getAll() {
    return exerciseDao.getAll();
  }

  @Override
  public Exercise add(Exercise exercise) {
    return exerciseDao.add(exercise);
  }

  @Override
  public void update(Exercise exercise) {
    exerciseDao.update(exercise);
  }

  @Override
  public boolean delete(long id) {
    return exerciseDao.delete(id);
  }
}
