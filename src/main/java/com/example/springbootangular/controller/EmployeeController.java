package com.example.springbootangular.controller;

import com.example.springbootangular.dto.ApiResponseDto;
import com.example.springbootangular.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @PostMapping("/saveEmployee")
    public ResponseEntity<ApiResponseDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
        return ResponseEntity.ok(null);
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
