package com.mahi.model;

public class Customers {
	/*
	 * author mahi
	 */
	
	private String name;
	private String telephone;
	private String address;
	
//	default constructor
	public Customers() {
		
	}


	public Customers(String name, String telephone, String address) {
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
