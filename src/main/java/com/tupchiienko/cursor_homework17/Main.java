package com.tupchiienko.cursor_homework17;

import com.tupchiienko.cursor_homework17.model.Author;
import com.tupchiienko.cursor_homework17.model.Book;
import com.tupchiienko.cursor_homework17.model.User;
import com.tupchiienko.cursor_homework17.service.impl.LibraryServiceImpl;

public class Main {
    public static void main(String[] args) {
        var libraryService = new LibraryServiceImpl();
        var newUser = new User(1, "Vlad");
        var book1 = new Book(1, "World Travel: An Irreverent Guide");
        book1.addAuthor(new Author(1, "Anthony Bourdain"));
        book1.addAuthor(new Author(2, "Laurie Woolever"));
        var book2 = new Book(2, "Caste (Oprah's Book Club): The Origins of Our Discontents");
        book2.addAuthor(new Author(3, "Isabel Wilkerson"));
        var book3 = new Book(3, "The Invisible Life of Addie LaRue");
        book3.addAuthor(new Author(4, "V. E. Schwab"));
        newUser.addBook(book1);
        newUser.addBook(book2);
        libraryService.saveUser(newUser);
        newUser.addBook(book3);
        libraryService.updateUser(newUser);
        var user = libraryService.findUser(1);
        System.out.println('\n' + user.getName() + "'s books:");
        user.getBooks().forEach(System.out::println);
        System.out.println("\nAll books:");
        libraryService.findAllBooks().forEach(System.out::println);
        System.out.println("\nAll authors:");
        libraryService.findAllAuthors().forEach(System.out::println);
        System.out.println("\nBook with id 1: " + libraryService.findBook(1));
        System.out.println("Author with id 1: " + libraryService.findAuthor(1));
    }
}
