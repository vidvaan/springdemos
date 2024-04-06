package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ciq.dao.EmployeeDAO;
import com.ciq.dto.Employee;

public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;
	
	public void save(Employee employee) {
		System.out.println("Employee Service Save method: ");
		employeeDAO.save(employee);
	}

}
