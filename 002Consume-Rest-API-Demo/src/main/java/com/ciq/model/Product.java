package com.ciq.model;

public class Product {

	private Integer pid;
	private String pname;
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
