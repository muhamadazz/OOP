package com.azz.libraryApp.service;

import com.azz.libraryApp.model.Book;
import com.azz.libraryApp.model.Transaction;
import com.azz.libraryApp.repository.BookRepository;
import com.azz.libraryApp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private BookRepository bookRepository;

    public Transaction save(Transaction transaction) {
        Optional<Book> optionalBook = bookRepository.findById(transaction.getId());
        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            if (transaction.getStatus()==1 && book.getQty() > 0){
                book.setQty(book.getQty()-1);
                book.setBooked(book.getBooked()+1);
            } else if (transaction.getStatus()==2 && book.getBooked()> 0) {
                book.setBooked(book.getBooked()-1);
                book.setQty(book.getQty()+1);
            } else {
                throw new RuntimeException("transaction status is wrong");
            }
            bookRepository.save(book);
        }
        return transactionRepository.save(transaction);
    }

    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }
    public Transaction findById(Long id) {
        return transactionRepository.findById(id).orElse(null);
    }

    public Transaction update(Long id, Transaction updatedTransaction){
        Optional<Transaction> optionalTransaction = transactionRepository.findById(id);
        if (optionalTransaction.isPresent()) {
            Transaction existTransaction = optionalTransaction.get();
            existTransaction.setDate(updatedTransaction.getDate());
            existTransaction.setIdbook(updatedTransaction.getIdbook());
            existTransaction.setIdmember(updatedTransaction.getIdmember());
            existTransaction.setStatus(updatedTransaction.getStatus());
            return transactionRepository.save(existTransaction);
        } else {
            throw new RuntimeException("transaction not found");
        }
    }


}
