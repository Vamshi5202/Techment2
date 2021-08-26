package com.techment.client;


public class Employee {
	int id;
	String name;
	Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void displayEmployeeDetails() {
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Employee Address: "+address.toString());
	}

}
