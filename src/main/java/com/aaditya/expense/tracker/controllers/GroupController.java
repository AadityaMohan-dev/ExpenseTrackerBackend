package com.aaditya.expense.tracker.controllers;

import com.aaditya.expense.tracker.dto.GroupRequestDTO;
import com.aaditya.expense.tracker.dto.GroupResponseDTO;
import com.aaditya.expense.tracker.services.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    @PostMapping
    public ResponseEntity<GroupResponseDTO> createGroup(@RequestBody GroupRequestDTO groupRequestDTO) {
        return ResponseEntity.ok(groupService.createGroup(groupRequestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GroupResponseDTO> getGroupById(@PathVariable long id) {
        return ResponseEntity.ok(groupService.getGroupById(id));
    }

    @GetMapping
    public ResponseEntity<List<GroupResponseDTO>> getAllGroups() {
        return ResponseEntity.ok(groupService.getAllGroups());
    }
}
