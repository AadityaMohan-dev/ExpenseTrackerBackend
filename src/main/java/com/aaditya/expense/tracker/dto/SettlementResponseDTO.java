package com.aaditya.expense.tracker.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SettlementResponseDTO {
    private long id;
    private long fromUserId;
    private long toUserId;
    private long groupId;
    private double amount;
}
