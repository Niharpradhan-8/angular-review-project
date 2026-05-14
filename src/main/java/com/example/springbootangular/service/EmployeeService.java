package com.example.springbootangular.service;

import com.example.springbootangular.dto.EmployeeDto;
import com.example.springbootangular.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

    public Employee saveEmployee(EmployeeDto employeeDto);
}
