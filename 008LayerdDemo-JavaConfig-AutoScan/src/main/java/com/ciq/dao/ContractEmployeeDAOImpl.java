package com.ciq.dao;

import org.springframework.stereotype.Repository;

import com.ciq.dto.Employee;
@Repository
public class ContractEmployeeDAOImpl implements EmployeeDAO{

	@Override
	public void save(Employee employee) {
		System.out.println("Employee DAO Save method for Cotract Employee : Employee Saved into DB "+employee);
		
	}

}
