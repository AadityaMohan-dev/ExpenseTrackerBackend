package com.aaditya.expense.tracker.services;

import com.aaditya.expense.tracker.dto.TransactionRequestDTO;
import com.aaditya.expense.tracker.dto.TransactionResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionServiceImpl implements TransactionService{
    @Override
    public TransactionResponseDTO createTransaction(TransactionRequestDTO transactionRequestDTO) {
        return null;
    }

    @Override
    public TransactionResponseDTO getTransactionById(long id) {
        return null;
    }

    @Override
    public List<TransactionResponseDTO> getTransactionsByExpense(long expenseId) {
        return List.of();
    }
}
