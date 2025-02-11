package com.aaditya.expense.tracker.services;

import com.aaditya.expense.tracker.dto.GroupRequestDTO;
import com.aaditya.expense.tracker.dto.GroupResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GroupServiceImpl implements GroupService{
    @Override
    public GroupResponseDTO createGroup(GroupRequestDTO groupRequestDTO) {
        return null;
    }

    @Override
    public GroupResponseDTO getGroupById(long id) {
        return null;
    }

    @Override
    public List<GroupResponseDTO> getAllGroups() {
        return List.of();
    }
}
