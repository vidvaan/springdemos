package com.ciq.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Emp_id;

	@NotEmpty(message = "Must not be Empty and NULL")
	@Column(unique = true)
	private String phoneNumber;

	@NotBlank(message = "Employee name can't be left empty")
	private String employeeName;

	@Min(value = 18, message = "Minimum working age 18")
	@Max(value = 60, message = "Maximum working age 60")
	@NotNull(message = "Age cannot be NULL")
	private Integer age;

	@Email(message = "Please enter a valid email Id")
	@NotNull(message = "Email cannot be NULL")
	private String emailId;

	@Pattern(regexp = "^[0-9]{5}$", message = "Employee postal code must be a 5-digit number.")
	@NotNull(message = "Postal Code cannot be NULL")
	private String employeePostalCode;

	@Size(min = 10, max = 100, message = "Address should have a length between 10 and 100 characters.")
	@NotNull(message = "Address cannot be NULL")
	@Column(unique = true)
	private String employeeAddress;

	public Long getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(Long emp_id) {
		Emp_id = emp_id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmployeePostalCode() {
		return employeePostalCode;
	}

	public void setEmployeePostalCode(String employeePostalCode) {
		this.employeePostalCode = employeePostalCode;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	
	

}
