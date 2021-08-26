package com.techment.modal;

public class University {
	Department department;
	int noOfStudents;
	

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void displayDeptDetails() {
		department.deptDetails();
		System.out.println("No of Students: "+noOfStudents);
	System.out.println("HOD Name: "+department.hodName);
	}
}
