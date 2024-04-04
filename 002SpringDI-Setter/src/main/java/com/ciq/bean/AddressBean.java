package com.ciq.bean;

public class AddressBean {
	private int aid;
	private String aloc;

	public void setAid(int aid) {
		this.aid = aid;
	}

	public void setAloc(String aloc) {
		this.aloc = aloc;
	}

	public void display() {
		System.out.println("Aid : " + aid + " Aloc: " + aloc);
	}

}
