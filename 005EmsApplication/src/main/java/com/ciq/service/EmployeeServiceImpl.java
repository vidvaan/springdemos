package com.ciq.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.ciq.entity.Employee;
import com.ciq.exception.EmployeeNotFoundException;
import com.ciq.exception.InvalidRequestException;
import com.ciq.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(Integer eid) {

		Optional<Employee> optional = employeeRepository.findById(eid);

		if (optional.isPresent()) {
			return optional.get();
		}

		throw new EmployeeNotFoundException("Employee details not avialable with given employee Id");
	}

	@Override
	public Employee save(Employee employee) {
		
		try {
			return employeeRepository.save(employee);
		} catch (DataIntegrityViolationException e) {
             throw new InvalidRequestException("Email or Phone number already existed in Database ");
		}

	}

	@Override
	public Employee update(Employee employee) {
		return employeeRepository.save(employee);

	}

	@Override
	public void deleteById(Integer eid) {
		
		Optional<Employee> optional = employeeRepository.findById(eid);

		if (optional.isEmpty()) {
			throw new EmployeeNotFoundException("Employee details not avialable with given employee Id, So we can not delete record");
		}

		
		employeeRepository.deleteById(eid);
	}

}
