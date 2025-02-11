package com.aaditya.expense.tracker.services;

import com.aaditya.expense.tracker.dto.UserRequestDTO;
import com.aaditya.expense.tracker.dto.UserResponseDTO;
import com.aaditya.expense.tracker.model.Users;
import com.aaditya.expense.tracker.repository.UserRepository;
import com.aaditya.expense.tracker.utils.Exceptions.UserAlreadyExistsException;
import com.aaditya.expense.tracker.utils.Exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponseDTO createUser(UserRequestDTO userRequestDTO) {
        if (userRepository.existsByEmailAddress(userRequestDTO.getEmailAddress())) {
            throw new UserAlreadyExistsException("Account with this email already exists.");
        }

        Users addUser = Users.builder()
                .firstName(userRequestDTO.getFirstName())
                .lastName(userRequestDTO.getLastName())
                .emailAddress(userRequestDTO.getEmailAddress())
                .phoneNumber(userRequestDTO.getPhoneNumber())
                .build();

        userRepository.save(addUser);

        return UserResponseDTO.builder()
                .responseCode("201")
                .responseMessage("Account created successfully.")
                .id(addUser.getId())
                .firstName(addUser.getFirstName())
                .lastName(addUser.getLastName())
                .emailAddress(addUser.getEmailAddress())
                .phoneNumber(addUser.getPhoneNumber())
                .build();
    }

    @Override
    public UserResponseDTO getUserById(long id) {
        Users user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + id));

        return UserResponseDTO.builder()
                .responseCode("200")
                .responseMessage("User found")
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName( user.getLastName())
                .emailAddress(user.getEmailAddress())
                .phoneNumber(user.getPhoneNumber())
                .build();


    }

    @Override
    public List<UserResponseDTO> getAllUsers() {
        List<Users> users = userRepository.findAll();

        if (users.isEmpty()) {
            throw new UserNotFoundException("No users found.");
        }

        return users.stream()
                .map(user -> new UserResponseDTO(
                        "200",
                        "User found",
                        user.getId(),
                        user.getFirstName(),
                        user.getLastName(),
                        user.getEmailAddress(),
                        user.getPhoneNumber()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public String deleteUser(long id) {
        Optional<Users> optional = userRepository.findById(id);
        if(optional.isPresent()){
            userRepository.deleteById(id);
            return "User deleted Successfully.";
        }
        return "User Not Found or Already been deleted.";
    }

    @Override
    public UserResponseDTO updateUserDetails(long id, UserRequestDTO userRequestDTO) {
        Optional<Users> optional = userRepository.findById(id);
        if(optional.isEmpty()) return UserResponseDTO.builder()
                .responseCode("404")
                .responseMessage("user with id : " + id + " not found.")
                .build();

        Users user = optional.get();
        user.setFirstName(userRequestDTO.getFirstName());
        user.setLastName(userRequestDTO.getLastName());
        user.setEmailAddress(userRequestDTO.getEmailAddress());
        user.setPhoneNumber(userRequestDTO.getPhoneNumber());
        userRepository.save(user);

        return UserResponseDTO.builder()
                .responseCode("200")
                .responseMessage("user updated successfully.")
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName( user.getLastName())
                .emailAddress(user.getEmailAddress())
                .phoneNumber(user.getPhoneNumber())
                .build();
    }
}
