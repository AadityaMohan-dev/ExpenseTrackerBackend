package com.aaditya.expense.tracker.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BalanceResponseDTO {
    private long id;
    private long userId;
    private long groupId;
    private double amount; // Positive means the user is owed, negative means the user owes.
}
