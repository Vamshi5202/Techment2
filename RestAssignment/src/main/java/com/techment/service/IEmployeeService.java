package com.techment.service;

import java.util.List;

import com.techment.entity.Employee;

public interface IEmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmployeeById(int id);
	Employee updateEmployee(Employee employee,int id);
	void deleteEmployee(int id);
		
	

}
