package com.mahi.model;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Customers> customerList = new ArrayList<Customers>();
		Customers c=new Customers("mahi","+306574815455","Leoforos Stratou 62");
		customerList.add(c);
		System.out.println("Informations about my customers list:"+" "+c);

	 System.out.println("mahi");

	}

}
