package com.tupchiienko.cursor_homework17.model;

import javax.persistence.*;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public Author() {
    }

    public Author(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return name;
    }
}
