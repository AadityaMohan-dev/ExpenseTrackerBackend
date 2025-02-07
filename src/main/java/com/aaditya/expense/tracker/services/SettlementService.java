package com.aaditya.expense.tracker.services;

import com.aaditya.expense.tracker.dto.SettlementRequestDTO;
import com.aaditya.expense.tracker.dto.SettlementResponseDTO;

import java.util.List;

public interface SettlementService {
    SettlementResponseDTO createSettlement(SettlementRequestDTO settlementRequestDTO);

    List<SettlementResponseDTO> getSettlementsForGroup(long groupId);
}
