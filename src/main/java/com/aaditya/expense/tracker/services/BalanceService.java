package com.aaditya.expense.tracker.services;

import com.aaditya.expense.tracker.dto.BalanceResponseDTO;

import java.util.List;

public interface BalanceService {
    BalanceResponseDTO getBalanceForUserInGroup(long userId, long groupId);

    List<BalanceResponseDTO> getBalancesForGroup(long groupId);
}
