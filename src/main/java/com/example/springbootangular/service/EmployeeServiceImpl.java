package com.example.springbootangular.service;

import com.example.springbootangular.dto.ApiResponseDto;
import com.example.springbootangular.dto.EmployeeDto;
import com.example.springbootangular.entity.Employee;
import com.example.springbootangular.entity.EmployeePk;
import com.example.springbootangular.exception.RecordAlreadyExistException;
import com.example.springbootangular.exception.RecordNotFoundException;
import com.example.springbootangular.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public ApiResponseDto<Employee> saveEmployee(EmployeeDto employeeDto) {
        EmployeePk employeePk = EmployeePk.builder().name(employeeDto.getName()).email(employeeDto.getEmail()).build();
        Optional<Employee> employeeoptional = employeeRepository.findById(employeePk);
        if (employeeoptional.isPresent()) {
            throw new RecordAlreadyExistException("Employee Record is already added.");
        }
        Employee employee = Employee.builder().employeePk(employeePk).
                dob(employeeDto.getDob()).address(employeeDto.getAddress())
                .phoneNumber(employeeDto.getPhoneNumber()).build();
        employeeRepository.save(employee);
        return new ApiResponseDto<>("SUCCESS", "EMPLOYEE RECORD ADDED SUCCESSFULLY", employee);

    }

    @Override
    public void deleteEmployee(EmployeePk id) {
        try {
            Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RecordNotFoundException("Employee not found"));
            employeeRepository.deleteById(id);
        } catch (Exception e) {
            throw new RecordNotFoundException(e.getMessage());
        }
    }

    @Override
    public Employee getEmployeebyId(EmployeePk empployeePk) {
        try {
            return employeeRepository.findById(empployeePk).orElseThrow(() -> new RecordNotFoundException("User not found!"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RecordNotFoundException(e.getMessage());
        }
    }
}
