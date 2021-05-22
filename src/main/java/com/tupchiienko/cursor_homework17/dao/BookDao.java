package com.tupchiienko.cursor_homework17.dao;

import com.tupchiienko.cursor_homework17.model.Book;

import java.util.List;

public interface BookDao {
    void save(Book book);

    Book findById(int id);

    void update(Book book);

    void delete(Book book);

    List<Book> findAll();
}
