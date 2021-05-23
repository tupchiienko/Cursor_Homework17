package com.tupchiienko.cursor_homework17.dao;

import java.util.List;

public interface Dao<T> {
    void save(T entity);

    T findById(int id);

    void update(T entity);

    void delete(T entity);

    List<T> findAll();
}
