package com.example.identity_service.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestDTO {
    @Size(min = 5, message = "INVALID_USERNAME")
    private String username;
    @Email
    private String email;

    @Size(min = 8, message = "INVALID_PASSWORD")
    private String password;
    @NotBlank
    private String fullName;
    private String dob;
}
