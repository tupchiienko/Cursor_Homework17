package com.tupchiienko.cursor_homework17.dao.impl;

import com.tupchiienko.cursor_homework17.dao.Dao;
import com.tupchiienko.cursor_homework17.model.Book;
import com.tupchiienko.cursor_homework17.util.HibernateSessionFactoryUtil;

import java.util.List;

public class BookDaoImpl implements Dao<Book> {
    @Override
    public void save(Book book) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        session.save(book);
        transaction.commit();
        session.close();
    }

    @Override
    public Book findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Book.class, id);
    }

    @Override
    public void update(Book book) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        var mergedBook = (Book) session.merge(book);
        session.update(mergedBook);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Book book) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        var mergedBook = (Book) session.merge(book);
        session.delete(mergedBook);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Book> findAll() {
        return HibernateSessionFactoryUtil.getSessionFactory()
                .openSession().createQuery("FROM Book", Book.class).list();
    }
}
