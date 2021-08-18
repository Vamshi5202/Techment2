package com.techment.service;

import java.util.List;

import com.techment.dao.EmployeeDaoImpl;
import com.techment.dao.IEmployeeDao;
import com.techment.model.Employee;

public class EmployeeServiceImpl implements IEmployeeService{

	IEmployeeDao employeeDao=new EmployeeDaoImpl();

	@Override
	public Employee getEmployeeById(int id) {
		
		return employeeDao.getEmployeeById(id) ;
	}

	@Override
	public List<Employee> getEmployeeByDept(String dept) {
		return employeeDao.getEmployeeByDept(dept);
	}
   

}
