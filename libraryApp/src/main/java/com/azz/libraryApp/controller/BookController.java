package com.azz.libraryApp.controller;// BookController.java
import com.azz.libraryApp.model.Book;
import com.azz.libraryApp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api-books/")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/get-books")
    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("/add-book")
    public Book addBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

}