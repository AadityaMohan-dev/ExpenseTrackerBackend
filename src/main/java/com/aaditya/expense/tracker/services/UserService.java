package com.aaditya.expense.tracker.services;

import com.aaditya.expense.tracker.dto.UserRequestDTO;
import com.aaditya.expense.tracker.dto.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO createUser(UserRequestDTO userRequestDTO);

    UserResponseDTO getUserById(long id);

    List<UserResponseDTO> getAllUsers();
}
