package com.krishantha.training.salesmanager.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.krishantha.training.salesmanager.model.Employee;

@Service("employeeService")
public interface EmployeeService {
	
	List<Employee> getAllEmployees();

}
