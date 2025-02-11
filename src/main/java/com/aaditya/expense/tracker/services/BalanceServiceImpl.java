package com.aaditya.expense.tracker.services;

import com.aaditya.expense.tracker.dto.BalanceResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BalanceServiceImpl implements BalanceService{
    @Override
    public BalanceResponseDTO getBalanceForUserInGroup(long userId, long groupId) {
        return null;
    }

    @Override
    public List<BalanceResponseDTO> getBalancesForGroup(long groupId) {
        return List.of();
    }
}
