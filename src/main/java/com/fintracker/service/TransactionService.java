package com.fintracker.service;

import com.fintracker.model.Transaction;
import com.fintracker.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

  private final TransactionRepository transactionRepository;

  public List<Transaction> getTransactionsByUser(Long userId) {
    return transactionRepository.findByUserId(userId);
  }
}
