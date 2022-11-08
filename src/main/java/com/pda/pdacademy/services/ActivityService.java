package com.pda.pdacademy.services;

import com.pda.pdacademy.dao.ActivityDao;
import com.pda.pdacademy.dao.Idao;
import com.pda.pdacademy.entity.Activity;
import com.pda.pdacademy.entity.User;

import java.util.List;

public class ActivityService implements Iservice<Activity> {

  private Idao<Activity> activityDao = new ActivityDao();
    @Override
    public Activity login(String Email, String Password) {
        return null;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean updatePasswordById(String newPassword, long user_id) {
        return false;
    }

    @Override
    public Activity find(long id) {
        return activityDao.find(id);
    }

    @Override
    public Activity findByEmail(String Email) {
        return null;
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
        return false;
    }
}
