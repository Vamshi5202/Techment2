package com.manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee600")
public class Employee1 {
	@Id
	int id;
	String name;
	String designation;
	@ManyToOne
	Address1 address;
	
	
	public Employee1() {
		super();
	}
	public Employee1(int id, String name, String designation, Address1 address) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.address = address;
	}
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Address1 getAddress() {
		return address;
	}
	public void setAddress(Address1 address) {
		this.address = address;
	}	
	
	

}
