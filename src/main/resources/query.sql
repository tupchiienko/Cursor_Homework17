CREATE DATABASE library_db;

CREATE TABLE users
(
    id INTEGER NOT NULL PRIMARY KEY,
    name TEXT NOT NULL
);

CREATE TABLE books
(
    id INTEGER NOT NULL PRIMARY KEY,
    name TEXT NOT NULL,
    user_id INTEGER,
    CONSTRAINT books_users_user_id_fk FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE authors
(
    id INTEGER NOT NULL PRIMARY KEY,
    name TEXT NOT NULL,
    book_id INTEGER,
    CONSTRAINT authors_books_book_id_fk FOREIGN KEY (book_id) REFERENCES books(id)
);


