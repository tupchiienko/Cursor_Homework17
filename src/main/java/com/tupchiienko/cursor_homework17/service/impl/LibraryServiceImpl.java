package com.tupchiienko.cursor_homework17.service.impl;

import com.tupchiienko.cursor_homework17.dao.AuthorDao;
import com.tupchiienko.cursor_homework17.dao.BookDao;
import com.tupchiienko.cursor_homework17.dao.UserDao;
import com.tupchiienko.cursor_homework17.dao.impl.AuthorDaoImpl;
import com.tupchiienko.cursor_homework17.dao.impl.BookDaoImpl;
import com.tupchiienko.cursor_homework17.dao.impl.UserDaoImpl;
import com.tupchiienko.cursor_homework17.model.Author;
import com.tupchiienko.cursor_homework17.model.Book;
import com.tupchiienko.cursor_homework17.model.User;
import com.tupchiienko.cursor_homework17.service.LibraryService;

import java.util.List;

public class LibraryServiceImpl implements LibraryService {
    private static final UserDao userDao = new UserDaoImpl();
    private static final AuthorDao authorDao = new AuthorDaoImpl();
    private static final BookDao bookDao = new BookDaoImpl();

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    public User findUser(int id) {
        return userDao.findById(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.update(user);
    }

    @Override
    public Book findBook(int id) {
        return bookDao.findById(id);
    }

    @Override
    public List<Book> findAllBooks() {
        return bookDao.findAll();
    }

    @Override
    public Author findAuthor(int id) {
        return authorDao.findById(id);
    }

    @Override
    public List<Author> findAllAuthors() {
        return authorDao.findAll();
    }
}
