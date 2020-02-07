package com.krishantha.training.salesmanager.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.krishantha.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}