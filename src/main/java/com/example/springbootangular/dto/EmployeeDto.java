package com.example.springbootangular.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    @NotBlank(message = "Name should not be blank")
    private String name;
    @NotBlank(message = "Email should not be blank")
    private String email;
    @PastOrPresent(message = "Date of birth should be a past date")
    private LocalDate dob;
    @NotBlank(message = "address should not be blank")
    private String address;
    @NotBlank(message = "phone number should not be null")
    private String phoneNumber;
}
