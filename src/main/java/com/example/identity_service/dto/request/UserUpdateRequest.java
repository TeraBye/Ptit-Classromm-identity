package com.example.identity_service.dto.request;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserUpdateRequest {
    @Email
    private String email;
    @Size(min = 8, message = "INVALID_PASSWORD")
    private String password;
    @NotBlank
    private String fullName;
    private String dob;
}
