package com.example.springbootangular.repository;

import com.example.springbootangular.entity.Employee;
import com.example.springbootangular.entity.EmployeePk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, EmployeePk>, JpaSpecificationExecutor<Employee> {
}
