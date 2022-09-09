package com.books.booksservice.service;

import java.util.List;

public interface DatabaseService {
    List<Object> getAll(String id);

    Object get(String id);
}
