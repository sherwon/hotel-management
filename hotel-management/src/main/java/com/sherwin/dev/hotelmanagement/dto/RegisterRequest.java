package com.sherwin.dev.hotelmanagement.dto;

import com.sherwin.dev.hotelmanagement.entity.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
//    @NonNull
//    @NotBlank(message = "Name should not be empty")
//    @Pattern(regexp = "^[a-zA-Z ]*$", message = "Name should not contain special characters or numbers")
//    @Size(min = 3, max = 30)
    private String firstName;
    private String lastName;
    @Email
    private String email;
    @NonNull
    private String password;
    @NonNull
    private Role role;
}