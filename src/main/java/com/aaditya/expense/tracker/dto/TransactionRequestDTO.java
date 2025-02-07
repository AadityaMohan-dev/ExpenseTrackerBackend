package com.aaditya.expense.tracker.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionRequestDTO {
    private long payerId;
    private long payeeId;
    private double amount;
    private long expenseId;
}
