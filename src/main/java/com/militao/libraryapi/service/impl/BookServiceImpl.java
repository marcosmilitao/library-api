package com.militao.libraryapi.service.impl;

import com.militao.libraryapi.model.entity.Book;
import com.militao.libraryapi.repository.BookRepository;
import com.militao.libraryapi.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book save(Book book) {
        return repository.save(book);
    }
}
