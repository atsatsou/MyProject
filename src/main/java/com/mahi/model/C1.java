package com.mahi.model;

public class C1 {
	/*
	 * author mahi
	 */

	private String name;
	private String telephone;
	private String address;
	private Double b;

//	a

	// default constructor
	public C1() {

	}

	public C1(String name, String telephone, String address) {
		super();
		this.name = name;
		this.telephone = telephone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
