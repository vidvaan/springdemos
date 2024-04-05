package com.ciq.controller;

import com.ciq.dto.Employee;
import com.ciq.service.EmployeeService;

public class EmployeeController {
	
	private EmployeeService employeeService;
	
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}


	public void save(Employee employee) {
		System.out.println("Employee Controller Save Method");
		employeeService.save(employee);
	}

}
