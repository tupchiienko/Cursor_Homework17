package com.tupchiienko.cursor_homework17.dao;

import com.tupchiienko.cursor_homework17.model.Author;

import java.util.List;

public interface AuthorDao {
    void save(Author author);

    Author findById(int id);

    void update(Author author);

    void delete(Author author);

    List<Author> findAll();
}
