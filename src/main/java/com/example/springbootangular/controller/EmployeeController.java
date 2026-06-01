package com.example.springbootangular.controller;

import com.example.springbootangular.dto.ApiResponseDto;
import com.example.springbootangular.dto.EmployeeDto;
import com.example.springbootangular.entity.Employee;
import com.example.springbootangular.entity.EmployeePk;
import com.example.springbootangular.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public ResponseEntity<ApiResponseDto<Employee>> saveEmployee(@RequestBody @Valid EmployeeDto employeeDto){
        return new ResponseEntity<>(employeeService.saveEmployee(employeeDto), HttpStatus.CREATED);
    }
    @GetMapping("/getAllEmployee")
    public ResponseEntity<ApiResponseDto<Employee>> getAllEmployee(int pageNo, int pageSize, String searchParam){
        return ResponseEntity.ok(null);
    }
    @PutMapping("/updateEmployee/{id}")
    public ResponseEntity<ApiResponseDto<Employee>> updateEmployee(@RequestBody EmployeeDto employeeDto,@PathVariable
                                                         Long id){
        return ResponseEntity.ok(null);
    }
    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<ApiResponseDto<Employee>> deleteEmployee(@PathVariable Long id){
        return ResponseEntity.ok(null);

    }

    @GetMapping("/getEmployeeById/{name}/{email}")
    public ResponseEntity<ApiResponseDto<Employee>> getEmployeeById(@PathVariable String name, @PathVariable String email){
        EmployeePk employeePk = new EmployeePk(name,email);
        return ResponseEntity.ok(employeeService.getEmployeeById(employeePk));
    }
}
