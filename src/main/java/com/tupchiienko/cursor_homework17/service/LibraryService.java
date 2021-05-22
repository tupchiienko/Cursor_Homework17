package com.tupchiienko.cursor_homework17.service;

import com.tupchiienko.cursor_homework17.model.Author;
import com.tupchiienko.cursor_homework17.model.Book;
import com.tupchiienko.cursor_homework17.model.User;

import java.util.List;

public interface LibraryService {
    void saveUser(User user);

    User findUser(int id);

    void updateUser(User user);

    Book findBook(int id);

    List<Book> findAllBooks();

    Author findAuthor(int id);

    List<Author> findAllAuthors();
}
