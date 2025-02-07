package com.aaditya.expense.tracker.controllers;

import com.aaditya.expense.tracker.dto.BalanceResponseDTO;
import com.aaditya.expense.tracker.services.BalanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/balances")
@RequiredArgsConstructor
public class BalanceController {

    private final BalanceService balanceService;

    @GetMapping("/user/{userId}/group/{groupId}")
    public ResponseEntity<BalanceResponseDTO> getBalanceForUserInGroup(@PathVariable long userId, @PathVariable long groupId) {
        return ResponseEntity.ok(balanceService.getBalanceForUserInGroup(userId, groupId));
    }

    @GetMapping("/group/{groupId}")
    public ResponseEntity<List<BalanceResponseDTO>> getBalancesForGroup(@PathVariable long groupId) {
        return ResponseEntity.ok(balanceService.getBalancesForGroup(groupId));
    }
}
