package com.aaditya.expense.tracker.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDTO {
    private String responseCode;
    private String responseMessage;
    private long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;

    public UserResponseDTO(String number, String userFound, String firstName, String lastName, String emailAddress, String phoneNumber) {
    }
}
