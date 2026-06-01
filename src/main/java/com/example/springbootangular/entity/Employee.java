package com.example.springbootangular.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Table(name= "emp_table")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder(toBuilder = true)
public class Employee {

    @EmbeddedId
    private EmployeePk employeePk;

    @Column(name = "date_of_birth")
    private LocalDate dob;

    @Column(name = "emp_address")
    private String address;

    @Column(name = "emp_phone_no")
    private String phoneNumber;
}
