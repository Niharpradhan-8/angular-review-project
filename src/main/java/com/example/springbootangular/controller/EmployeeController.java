package com.example.springbootangular.controller;

import com.example.springbootangular.dto.ApiResponseDto;
import com.example.springbootangular.dto.EmployeeDto;
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

    private EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public ResponseEntity<ApiResponseDto> saveEmployee(@RequestBody @Valid EmployeeDto employeeDto){
        ApiResponseDto result = employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
    @GetMapping("/getAllEmployee")
    public ResponseEntity<ApiResponseDto> getAllEmployee(){
        return ResponseEntity.ok(null);
    }
    @PutMapping("/updateEmployee/{id}")
    public ResponseEntity<ApiResponseDto> updateEmployee(@RequestBody EmployeeDto employeeDto,@PathVariable
                                                         Long id){
        return ResponseEntity.ok(null);
    }
    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<ApiResponseDto> deleteEmployee(@PathVariable Long id){
        return ResponseEntity.ok(null);

    }
}
