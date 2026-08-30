package com.devsecops.employee.controller;

import com.devsecops.employee.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/api/employees")
    public List<Employee> getEmployees() {

        return Arrays.asList(
                new Employee(1, "Omkar", "DevOps"),
                new Employee(2, "Rahul", "Development"),
                new Employee(3, "Priya", "Testing")
        );
    }
}