package com.aaditya.expense.tracker.controllers;

import com.aaditya.expense.tracker.dto.ExpenseRequestDTO;
import com.aaditya.expense.tracker.dto.ExpenseResponseDTO;
import com.aaditya.expense.tracker.services.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService expenseService;

    @PostMapping
    public ResponseEntity<ExpenseResponseDTO> createExpense(@RequestBody ExpenseRequestDTO expenseRequestDTO) {
        return ResponseEntity.ok(expenseService.createExpense(expenseRequestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExpenseResponseDTO> getExpenseById(@PathVariable long id) {
        return ResponseEntity.ok(expenseService.getExpenseById(id));
    }

    @GetMapping("/group/{groupId}")
    public ResponseEntity<List<ExpenseResponseDTO>> getExpensesByGroup(@PathVariable long groupId) {
        return ResponseEntity.ok(expenseService.getExpensesByGroup(groupId));
    }
}
