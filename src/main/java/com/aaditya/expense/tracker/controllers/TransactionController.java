package com.aaditya.expense.tracker.controllers;

import com.aaditya.expense.tracker.dto.TransactionRequestDTO;
import com.aaditya.expense.tracker.dto.TransactionResponseDTO;
import com.aaditya.expense.tracker.services.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping
    public ResponseEntity<TransactionResponseDTO> createTransaction(@RequestBody TransactionRequestDTO transactionRequestDTO) {
        return ResponseEntity.ok(transactionService.createTransaction(transactionRequestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransactionResponseDTO> getTransactionById(@PathVariable long id) {
        return ResponseEntity.ok(transactionService.getTransactionById(id));
    }

    @GetMapping("/expense/{expenseId}")
    public ResponseEntity<List<TransactionResponseDTO>> getTransactionsByExpense(@PathVariable long expenseId) {
        return ResponseEntity.ok(transactionService.getTransactionsByExpense(expenseId));
    }
}
