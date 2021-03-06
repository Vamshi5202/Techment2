package com.techment.streamcasestudy;

import java.sql.Date;
import java.time.LocalDate;

public class Employee {
private int employeeId;
private String firstName;
private String lastName;
private String email;
private String phoneNumber;
private Date hireDate;
private String designation;
private double salary;
private int managerId;
private Department deparatment;


public Employee(int employeeId, String firstName, String lastName, String email, String phoneNumber, Date hireDate,
		String designation, double salary, int managerId, Department deparatment) {
	super();
	this.employeeId = employeeId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.hireDate = hireDate;
	this.designation = designation;
	this.salary = salary;
	this.managerId = managerId;
	this.deparatment = deparatment;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public Date getHireDate() {
	return hireDate;
}
public void setHireDate(Date hireDate) {
	this.hireDate = hireDate;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getManagerId() {
	return managerId;
}
public void setManagerId(int managerId) {
	this.managerId = managerId;
}
public Department getDeparatment() {
	return deparatment;
}
public void setDeparatment(Department deparatment) {
	this.deparatment = deparatment;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
			+ email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", designation=" + designation
			+ ", salary=" + salary + ", managerId=" + managerId + ", deparatment=" + deparatment + "]";
}



}
