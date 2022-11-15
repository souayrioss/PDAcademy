package org.loukili.javac.service;

import org.loukili.javac.dao.ActivityDao;
import org.loukili.javac.dao.Idao;
import org.loukili.javac.dao.ResponsibleDao;
import org.loukili.javac.entity.Activity;
import org.loukili.javac.entity.Responsible;

import java.util.List;

public class ResponsibleService implements ICRUDService<Responsible> {

  private Idao<Responsible> responsibleDao = new ResponsibleDao();
  @Override
  public Responsible find(long id) {
    return responsibleDao.find(id);
  }

  @Override
  public List<Responsible> getAll() {
    return responsibleDao.getAll();
  }

  @Override
  public Responsible add(Responsible responsible) {
    return responsibleDao.add(responsible);
  }

  @Override
  public void update(Responsible responsible) {
    responsibleDao.update(responsible);
  }

  @Override
  public boolean delete(long id) {
    return responsibleDao.delete(id);
  }
}
