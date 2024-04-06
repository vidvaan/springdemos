package com.ciq.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ciq.dto.Employee;
public class EmployeeDAO {
	
	public void save(Employee employee) {
		System.out.println("Employee DAO Save method : Employee Saved into DB "+employee);
	}

}
