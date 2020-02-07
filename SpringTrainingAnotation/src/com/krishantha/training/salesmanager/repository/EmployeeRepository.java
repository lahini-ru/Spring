package com.krishantha.training.salesmanager.repository;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.krishantha.training.salesmanager.model.Employee;

@Repository("employeeRepository")
public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}