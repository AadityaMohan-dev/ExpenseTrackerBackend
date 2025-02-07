package com.aaditya.expense.tracker.controllers;

import com.aaditya.expense.tracker.dto.SettlementRequestDTO;
import com.aaditya.expense.tracker.dto.SettlementResponseDTO;
import com.aaditya.expense.tracker.services.SettlementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/settlements")
@RequiredArgsConstructor
public class SettlementController {

    private final SettlementService settlementService;

    @PostMapping
    public ResponseEntity<SettlementResponseDTO> createSettlement(@RequestBody SettlementRequestDTO settlementRequestDTO) {
        return ResponseEntity.ok(settlementService.createSettlement(settlementRequestDTO));
    }

    @GetMapping("/group/{groupId}")
    public ResponseEntity<List<SettlementResponseDTO>> getSettlementsForGroup(@PathVariable long groupId) {
        return ResponseEntity.ok(settlementService.getSettlementsForGroup(groupId));
    }
}
