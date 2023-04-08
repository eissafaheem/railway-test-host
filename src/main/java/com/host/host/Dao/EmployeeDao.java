package com.host.host.Dao;

import com.host.host.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, String> {
}
