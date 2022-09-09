package com.books.booksservice.service;

import com.books.booksservice.entity.Book;

import java.util.List;

public interface BookService {
    abstract List<Book> getBooksForUser(String userId);
}
