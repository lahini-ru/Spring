package com.krishantha.training.salesmanager.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("Overloaded Constructor Executed");
		this.employeeRepository=employeeRepository; }
	 
	public EmployeeServiceImpl() {
		System.out.println("Default Constructor Executed");
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter Executed");
		this.employeeRepository=employeeRepository; }
	 
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}

}
