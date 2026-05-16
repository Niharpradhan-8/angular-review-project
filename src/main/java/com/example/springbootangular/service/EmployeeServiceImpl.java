package com.example.springbootangular.service;

import com.example.springbootangular.dto.EmployeeDto;
import com.example.springbootangular.entity.Employee;
import com.example.springbootangular.entity.EmployeePk;
import com.example.springbootangular.exception.RecordNotFoundException;
import com.example.springbootangular.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService{

     private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(EmployeeDto employeeDto) {
        try {

        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public void deleteEmployee(EmployeePk id) {
        try{
            Employee employee = employeeRepository.findById(id).orElseThrow(() ->new RecordNotFoundException("Employee not found"));
            employeeRepository.deleteById(id);
        }catch(Exception e){
            throw new RecordNotFoundException(e.getMessage());
        }
    }
}
