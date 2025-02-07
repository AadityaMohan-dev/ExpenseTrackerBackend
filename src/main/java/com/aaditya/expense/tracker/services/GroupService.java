package com.aaditya.expense.tracker.services;

import com.aaditya.expense.tracker.dto.GroupRequestDTO;
import com.aaditya.expense.tracker.dto.GroupResponseDTO;

import java.util.List;

public interface GroupService {
    GroupResponseDTO createGroup(GroupRequestDTO groupRequestDTO);

    GroupResponseDTO getGroupById(long id);

    List<GroupResponseDTO> getAllGroups();
}
