package com.example.springbootangular.service;

import com.example.springbootangular.dto.ApiResponseDto;
import com.example.springbootangular.dto.EmployeeDto;
import com.example.springbootangular.entity.Employee;
import com.example.springbootangular.entity.EmployeePk;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public interface EmployeeService {

    public ApiResponseDto<Employee> saveEmployee(EmployeeDto employeeDto);

    public ApiResponseDto<Employee> deleteEmployee(EmployeePk id);

    public ApiResponseDto<Employee> getEmployeeById(EmployeePk empployeePk);

    public ApiResponseDto<Employee> updateEmployee(EmployeeDto employeeDto);

    public ApiResponseDto<Employee> getAllEmployee(@RequestParam int pageNo, RequestParam pageSize, @RequestParam String searchParam);
}
