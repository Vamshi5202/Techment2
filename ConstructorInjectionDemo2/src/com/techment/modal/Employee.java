package com.techment.modal;

public class Employee {
  String name;
  String id;
  int salary;
public Employee(String name, String id, int salary) {
	super();
	this.name = name;
	this.id = id;
	this.salary = salary;
}


public Employee(String name) {
	super();
	this.name = name;
}


public Employee(int salary) {
	super();
	this.salary = salary;
}


@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
}
  
  
  
}
