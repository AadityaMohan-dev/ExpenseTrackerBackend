package com.aaditya.expense.tracker.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpenseResponseDTO {
    private long id;
    private String description;
    private double amount;
    private long userId;
    private long groupId;
}
