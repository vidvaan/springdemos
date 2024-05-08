package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.Employee;
import com.ciq.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/emps")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping
	public ResponseEntity<?> findAll() {
		return new ResponseEntity<List<Employee>>(employeeService.findAll(), HttpStatus.OK);

	}

	@GetMapping("{eid}")
	public ResponseEntity<?> findById(@PathVariable("eid") Integer eid) {
		return new ResponseEntity<Employee>(employeeService.findById(eid), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<?> save(@Valid @RequestBody Employee employee) {
		Employee employeeOp = employeeService.save(employee);
		return new ResponseEntity<Employee>(employeeOp, HttpStatus.CREATED);

	}

	@PutMapping
	public ResponseEntity<?> update(@RequestBody @Valid Employee employee) {
		Employee employeeOp = employeeService.save(employee);
		return new ResponseEntity<Employee>(employeeOp, HttpStatus.CREATED);

	}

	@DeleteMapping("{eid}")
	public ResponseEntity<?> deleteById(@PathVariable("eid") Integer eid) {
		employeeService.deleteById(eid);
		return new ResponseEntity<String>("Deleted Successflly", HttpStatus.OK);
	}

}
