package com.books.booksservice.service;

import com.books.booksservice.entity.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("bookServiceStub")
public class BookServiceImpl implements BookService{
    @Override
    public List<Book> getBooksForUser(String userId) {
        Book book = new Book();
        book.setName("Test book");
        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        return bookList;
    }
}
