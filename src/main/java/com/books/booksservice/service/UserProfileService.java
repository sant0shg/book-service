package com.books.booksservice.service;

import com.books.booksservice.entity.Book;
import com.books.booksservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileService {

    @Autowired
    DatabaseServiceImpl databaseServiceStub;

    @Autowired
    BookService bookServiceStub;

    public User getProfile(String userId){
        User user = (User) databaseServiceStub.get(userId);
        List<Book> booksList = bookServiceStub.getBooksForUser(userId);
        user.setBooks(booksList);
        return user;
    }
}
