package com.ciq.bean;

public class EmployeeBean {

	private int eid;
	private String ename;
	private AddressBean addressBean;

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setAddressBean(AddressBean addressBean) {
		this.addressBean = addressBean;
	}

	public void display() {
		System.out.println("Eid : " + eid + " Ename : " + ename);
		addressBean.display();
	}
}
