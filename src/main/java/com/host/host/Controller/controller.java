package com.host.host.Controller;

import com.host.host.Models.Employee;
import com.host.host.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class controller {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String getStatus(){
        return "Yes, it is running!";
    }

    @GetMapping(value = "/all/employee")
    public List<Employee> getAllEmployees() {

        List<Employee> employees = employeeService.getAllEmployee();

        return employees;
    }
}

