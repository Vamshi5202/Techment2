package com.techment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp555")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  private String firstName;
  private String lastName;
  private String dept;
  
  
  
public Employee() {
	super();
}

public Employee(String firstName, String lastName, String dept) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.dept = dept;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
  
  
  
  
}
