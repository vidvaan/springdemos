package com.ciq.dao;

import com.ciq.dto.Employee;

public class EmployeeDAO {
	
	public void save(Employee employee) {
		System.out.println("Employee DAO Save method : Employee Saved into DB "+employee);
	}

}
