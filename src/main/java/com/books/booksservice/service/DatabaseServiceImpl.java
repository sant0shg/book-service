package com.books.booksservice.service;

import com.books.booksservice.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("databaseServiceStub")
public class DatabaseServiceImpl implements DatabaseService{
    @Override
    public List<Object> getAll(String id) {
        User user = new User();
        user.setName("Test User");
        user.setId(id);
        List<Object> userList = new ArrayList<>();
        userList.add(user);
        return userList;
    }

    @Override
    public Object get(String id) {
        User user = new User();
        user.setName("Test User");
        user.setId(id);
        return user;
    }
}
