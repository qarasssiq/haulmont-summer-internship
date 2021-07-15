package com.company.lib.service;

import com.company.lib.entity.Book;

public interface BookService {
    String NAME = "lib_BookService";

    boolean isTaken(Book book);
}