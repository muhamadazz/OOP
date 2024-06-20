package com.azz.libraryApp.controller;

import com.azz.libraryApp.model.Transaction;
import com.azz.libraryApp.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping("transaction")
    public List<Transaction> getAllTransactions() {
        return transactionService.findAll();
    }

    @GetMapping("transaction/{id}")
    public Transaction getTransaction(@PathVariable Long id) {
        return transactionService.findById(id);
    }

    @PostMapping("transaction")
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        return transactionService.save(transaction);
    }

    @PutMapping("transaction/{id}")
    public Transaction updateTransaction(@PathVariable Long id, @RequestBody Transaction transaction) {
        return transactionService.update(id, transaction);
    }
}
