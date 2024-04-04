package com.ciq.bean;

public class EmployeeBean {

	private int eid;
	private String ename;
	private AddressBean addressBean;

	

	public EmployeeBean(int eid, String ename, AddressBean addressBean) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.addressBean = addressBean;
	}



	public void display() {
		System.out.println("Eid : " + eid + " Ename : " + ename);
		addressBean.display();
	}
}
