package com.example.springbootangular.service;

import com.example.springbootangular.dto.ApiResponseDto;
import com.example.springbootangular.dto.EmployeeDto;
import com.example.springbootangular.entity.Employee;
import com.example.springbootangular.entity.EmployeePk;
import com.example.springbootangular.exception.RecordAlreadyExistException;
import com.example.springbootangular.exception.RecordNotFoundException;
import com.example.springbootangular.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    private MessageSource messageSource;

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
        return new ApiResponseDto<>("SUCCESS", messageSource.getMessage("EMPLOYEE.MSG.VALERR0001",null, LocaleContextHolder.getLocale()), employee);

    }

    @Override
    public ApiResponseDto<Employee> deleteEmployee(EmployeePk id) {
        try {
            Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RecordNotFoundException("Employee not found"));
            employeeRepository.deleteById(id);
            return new ApiResponseDto<>("SUCCESS", "Employee deleted successfully", null);
        } catch (Exception e) {
            throw new RecordNotFoundException(e.getMessage());
        }
    }

    @Override
    public ApiResponseDto<Employee> getEmployeeById(EmployeePk employeePk) {
        try {
            Optional<Employee> optionalEmployee = employeeRepository.findById(employeePk);
            if (optionalEmployee.isEmpty()) {
                throw new RecordNotFoundException("Employee record not found!");
            }
            Employee employee = optionalEmployee.get();
            return new ApiResponseDto<>("SUCCESS", "Employee record fetched success", employee);
        } catch (Exception e) {
            throw new RecordNotFoundException(e.getMessage());
        }
    }

    @Override
    public ApiResponseDto<Employee> updateEmployee(EmployeeDto employeeDto) {
        try {

        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public ApiResponseDto<Employee> getAllEmployee(int pageNo, RequestParam pageSize, String searchParam) {
        try {

        } catch (Exception e) {

        }
        return null;
    }
}
