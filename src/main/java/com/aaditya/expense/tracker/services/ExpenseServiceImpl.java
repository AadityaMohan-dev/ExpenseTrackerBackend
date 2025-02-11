package com.aaditya.expense.tracker.services;

import com.aaditya.expense.tracker.dto.ExpenseRequestDTO;
import com.aaditya.expense.tracker.dto.ExpenseResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExpenseServiceImpl implements ExpenseService{
    @Override
    public ExpenseResponseDTO createExpense(ExpenseRequestDTO expenseRequestDTO) {
        return null;
    }

    @Override
    public ExpenseResponseDTO getExpenseById(long id) {
        return null;
    }

    @Override
    public List<ExpenseResponseDTO> getExpensesByGroup(long groupId) {
        return List.of();
    }
}
