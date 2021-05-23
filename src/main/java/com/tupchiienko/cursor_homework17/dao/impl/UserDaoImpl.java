package com.tupchiienko.cursor_homework17.dao.impl;

import com.tupchiienko.cursor_homework17.dao.Dao;
import com.tupchiienko.cursor_homework17.model.User;
import com.tupchiienko.cursor_homework17.util.HibernateSessionFactoryUtil;

import java.util.List;

public class UserDaoImpl implements Dao<User> {
    @Override
    public void save(User user) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    @Override
    public User findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
    }

    @Override
    public void update(User user) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        var mergedUser = (User) session.merge(user);
        session.update(mergedUser);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(User user) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        var mergedUser = (User) session.merge(user);
        session.delete(mergedUser);
        transaction.commit();
        session.close();
    }

    @Override
    public List<User> findAll() {
        return HibernateSessionFactoryUtil.getSessionFactory()
                .openSession().createQuery("FROM User", User.class).list();
    }
}
