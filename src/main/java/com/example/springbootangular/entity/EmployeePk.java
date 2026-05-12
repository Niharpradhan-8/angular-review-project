package com.example.springbootangular.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
public class EmployeePk {

    private String name;
    private String email;
}
