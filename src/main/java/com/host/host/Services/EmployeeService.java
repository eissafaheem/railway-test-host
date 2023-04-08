package com.host.host.Services;

import com.host.host.Dao.EmployeeDao;
import com.host.host.Models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;
    public List<Employee> getAllEmployee() {
        List<Employee> allEmployees = employeeDao.findAll();
        return allEmployees;
    }
}
