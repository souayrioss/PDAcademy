package com.pda.pdacademy.dao;
import com.pda.pdacademy.beans.*;
import java.util.ArrayList;

public interface Idao<Entity> {
    Entity find(long id);
    ArrayList<Entity> getAll();
    Entity add(Entity entity);
    Entity update(Entity entity);
    boolean delete(long id);
}
