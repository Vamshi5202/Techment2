package com.techment.dao;

import java.util.List;

import com.techment.model.Employee;

public interface IEmployeeDao {

	Employee getEmployeeById(int id);
	List<Employee> getEmployeeByDept(String dept);
    

}
