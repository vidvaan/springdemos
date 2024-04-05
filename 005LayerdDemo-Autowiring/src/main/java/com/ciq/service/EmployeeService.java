package com.ciq.service;

import com.ciq.dao.EmployeeDAO;
import com.ciq.dto.Employee;

public class EmployeeService {
	
	private EmployeeDAO employeeDAO;
	
	

	public EmployeeService(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}



	public void save(Employee employee) {
		System.out.println("Employee Service Save method: ");
		employeeDAO.save(employee);
	}

}
