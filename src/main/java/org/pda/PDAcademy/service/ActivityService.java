package org.loukili.javac.service;

import org.loukili.javac.dao.ActivityDao;
import org.loukili.javac.dao.ExerciseDao;
import org.loukili.javac.dao.Idao;
import org.loukili.javac.entity.Activity;
import org.loukili.javac.entity.Exercise;

import java.util.List;

public class ActivityService implements ICRUDService<Activity> {

  private Idao<Activity> activityDao = new ActivityDao();

  @Override
  public Activity find(long id) {
    return activityDao.find(id);
  }

  @Override
  public List<Activity> getAll() {
    return activityDao.getAll();
  }

  @Override
  public Activity add(Activity activity) {
    return activityDao.add(activity);
  }

  @Override
  public void update(Activity activity) {
    activityDao.update(activity);
  }

  @Override
  public boolean delete(long id) {
    return activityDao.delete(id);
  }

}
