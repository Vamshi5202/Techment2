package com.techment.modal;

public class Employee {
	int id;
	String name;
	Address address;
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void displayEmployeeDetails() {
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+name);
		System.out.println(address.toString());

	}

}
