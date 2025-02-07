package com.aaditya.expense.tracker.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GroupRequestDTO {
    private String name;
    private String description;
}
