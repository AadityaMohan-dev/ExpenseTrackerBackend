package com.aaditya.expense.tracker.services;

import com.aaditya.expense.tracker.dto.TransactionRequestDTO;
import com.aaditya.expense.tracker.dto.TransactionResponseDTO;

import java.util.List;

public interface TransactionService {
    TransactionResponseDTO createTransaction(TransactionRequestDTO transactionRequestDTO);

    TransactionResponseDTO getTransactionById(long id);

    List<TransactionResponseDTO> getTransactionsByExpense(long expenseId);
}
