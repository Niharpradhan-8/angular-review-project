package com.example.springbootangular.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
@Table(name= "emp_table")
@Entity
public class Employee {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @EmbeddedId
    private EmployeePk employeePk;

    private LocalDate dob;

    private String address;

    private String phoneNumber;
}
