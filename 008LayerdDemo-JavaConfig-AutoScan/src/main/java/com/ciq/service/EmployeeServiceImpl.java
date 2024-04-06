package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ciq.dao.EmployeeDAO;
import com.ciq.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	@Qualifier("contractEmployeeDAOImpl")
	private EmployeeDAO employeeDAO;

	public void save(Employee employee) {
		System.out.println("Employee Service Save method: ");
		employeeDAO.save(employee);
	}

}
