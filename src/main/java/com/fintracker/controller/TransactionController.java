package com.fintracker.controller;

import com.fintracker.model.Transaction;
import com.fintracker.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

  private final TransactionService transactionService;

  public TransactionController(TransactionService transactionService) {
    this.transactionService = transactionService;
  }

  @GetMapping("/user/{userId}")
  public List<Transaction> getTransactions(@PathVariable Long userId) {
    return transactionService.getTransactionsByUser(userId);
  }

}
