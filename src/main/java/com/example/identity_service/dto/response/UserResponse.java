package com.example.identity_service.dto.response;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    private int userId;
    private String username;
    private String email;
    private String password;
    private String fullName;
    private LocalDate dob;
}
