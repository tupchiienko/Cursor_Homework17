package com.tupchiienko.cursor_homework17.dao.impl;

import com.tupchiienko.cursor_homework17.dao.AuthorDao;
import com.tupchiienko.cursor_homework17.model.Author;
import com.tupchiienko.cursor_homework17.util.HibernateSessionFactoryUtil;

import java.util.List;

public class AuthorDaoImpl implements AuthorDao {
    @Override
    public void save(Author author) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        session.save(author);
        transaction.commit();
        session.close();
    }

    @Override
    public Author findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Author.class, id);
    }

    @Override
    public void update(Author author) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        var mergedAuthor = (Author) session.merge(author);
        session.update(mergedAuthor);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Author author) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        var mergedAuthor = (Author) session.merge(author);
        session.delete(mergedAuthor);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Author> findAll() {
        return HibernateSessionFactoryUtil.getSessionFactory()
                .openSession().createQuery("FROM Author", Author.class).list();
    }
}
