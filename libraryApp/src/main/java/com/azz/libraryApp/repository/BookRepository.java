package com.azz.libraryApp.repository;

import com.azz.libraryApp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

// BookRepository.java
public interface BookRepository extends JpaRepository<Book, Long> {
}
