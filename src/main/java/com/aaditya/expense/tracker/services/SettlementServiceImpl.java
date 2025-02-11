package com.aaditya.expense.tracker.services;

import com.aaditya.expense.tracker.dto.SettlementRequestDTO;
import com.aaditya.expense.tracker.dto.SettlementResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SettlementServiceImpl implements SettlementService{
    @Override
    public SettlementResponseDTO createSettlement(SettlementRequestDTO settlementRequestDTO) {
        return null;
    }

    @Override
    public List<SettlementResponseDTO> getSettlementsForGroup(long groupId) {
        return List.of();
    }
}
