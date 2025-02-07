package com.aaditya.expense.tracker.services;

import com.aaditya.expense.tracker.dto.ExpenseRequestDTO;
import com.aaditya.expense.tracker.dto.ExpenseResponseDTO;

import java.util.List;

public interface ExpenseService {
    ExpenseResponseDTO createExpense(ExpenseRequestDTO expenseRequestDTO);

    ExpenseResponseDTO getExpenseById(long id);

    List<ExpenseResponseDTO> getExpensesByGroup(long groupId);
}
