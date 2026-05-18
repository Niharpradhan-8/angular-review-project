package com.example.springbootangular.service;

import com.example.springbootangular.dto.EmployeeDto;
import com.example.springbootangular.entity.Employee;
import com.example.springbootangular.entity.EmployeePk;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

    public Employee saveEmployee(EmployeeDto employeeDto);

    public void deleteEmployee(EmployeePk id);

    public Employee getEmployeebyId(EmployeePk empployeePk);
}
