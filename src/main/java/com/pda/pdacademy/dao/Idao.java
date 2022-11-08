package com.pda.pdacademy.dao;
import com.pda.pdacademy.entity.*;
import java.util.ArrayList;
import java.util.List;

public interface Idao<Entity> {
    Entity find(long id);
    List<Entity> getAll();
    Entity add(Entity entity);
    Entity update(Entity entity);
    boolean delete(long id);
}
