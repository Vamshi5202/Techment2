package com.techment;

public class StudentDto {
	int studentId;
	String name;
	String dept;
	public StudentDto() {
		super();
	}
	
	public StudentDto(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}

	public StudentDto(int studentId, String name, String dept) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.dept = dept;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	

}
