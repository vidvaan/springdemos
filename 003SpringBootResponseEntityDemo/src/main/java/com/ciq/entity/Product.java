package com.ciq.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	@NotBlank(message = "Pname should not be blank")
	private String pname;
	@NotNull(message = "Pcost should not be blank")
	private Double pcost;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Integer pid, String pname, Double pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPcost() {
		return pcost;
	}

	public void setPcost(Double pcost) {
		this.pcost = pcost;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + "]";
	}

}
