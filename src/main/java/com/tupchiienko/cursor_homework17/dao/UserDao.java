package com.tupchiienko.cursor_homework17.dao;

import com.tupchiienko.cursor_homework17.model.User;

public interface UserDao {
    void save(User user);

    User findById(int id);

    void update(User user);

    void delete(User user);
}
