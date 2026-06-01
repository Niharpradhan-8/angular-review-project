package com.example.springbootangular.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.*;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder(toBuilder = true)
public class EmployeePk {

    @Column(name = "emp_name")
    private String name;
    @Column(name = "emp_email")
    private String email;
}
