package com.techment.streamcasestudy;

public class Department {
    private int departmentId;
    private String deparatmentNmae;
    private int managerId;
	public Department(int departmentId, String deparatmentNmae, int managerId) {
		super();
		this.departmentId = departmentId;
		this.deparatmentNmae = deparatmentNmae;
		this.managerId = managerId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDeparatmentNmae() {
		return deparatmentNmae;
	}
	public void setDeparatmentNmae(String deparatmentNmae) {
		this.deparatmentNmae = deparatmentNmae;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
    
    
     
}
