package com.techment.service;

import java.util.List;

import com.techment.model.Employee;

public interface IEmployeeService {

	Employee getEmployeeById(int id);
	List<Employee> getEmployeeByDept(String dept);

	
}
