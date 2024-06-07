package com.azz.libraryApp.controller;// BookController.java
import com.azz.libraryApp.model.Book;
import com.azz.libraryApp.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api-books/")
public class BookController {

    private final BookRepository BookRepository;

    public BookController(com.azz.libraryApp.repository.BookRepository bookRepository) {
        BookRepository = bookRepository;
    }

    @GetMapping("/get-books")
    public List<Book> getAllBooks() {
        return BookRepository.findAll();
    }

    @PostMapping("/add-book")
    public Book createBook(@RequestBody Book book) {
        return BookRepository.save(book);
    }
}