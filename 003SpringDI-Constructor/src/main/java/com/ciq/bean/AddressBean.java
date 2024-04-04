package com.ciq.bean;

public class AddressBean {
	private int aid;
	private String aloc;

	
	public AddressBean(int aid, String aloc) {
		super();
		this.aid = aid;
		this.aloc = aloc;
	}


	public void display() {
		System.out.println("Aid : " + aid + " Aloc: " + aloc);
	}

}
