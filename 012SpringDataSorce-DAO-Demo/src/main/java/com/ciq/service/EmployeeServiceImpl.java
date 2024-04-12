package com.ciq.service;

import java.util.List;

import com.ciq.dao.EmployeeDAO;
import com.ciq.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO employeeDAO;

	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public void save(Employee employee) {
		System.out.println("Employee Service Save method: ");
		employeeDAO.save(employee);
	}

	@Override
	public void update(Employee employee) {
		employeeDAO.update(employee);
	}

	@Override
	public void deleteById(Integer eid) {
		employeeDAO.deleteById(eid);
	}

	@Override
	public Employee findById(Integer eid) {
		return employeeDAO.findById(eid);
	}

	@Override
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}
}
