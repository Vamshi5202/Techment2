package com.techment.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.techment.model.Employee;
import com.techment.util.CollectionUtil;

public class EmployeeDaoImpl implements IEmployeeDao {
	CollectionUtil collectionUtil = new CollectionUtil();

	@Override
	public Employee getEmployeeById(int id) {
		Map<Integer, Employee> empMap = collectionUtil.getEmployeeList();
		Employee employee = empMap.get(id);
		return employee;
	}

	@Override
	public List<Employee> getEmployeeByDept(String dept) {
		// list is declared to store all the employee based on dept
		List<Employee> employeeList = new ArrayList<Employee>();
		// it returns map data which contains employee details
		Map<Integer, Employee> empMap = collectionUtil.getEmployeeList();
		for (Employee employee : empMap.values()) {
			if (employee.getDept().equalsIgnoreCase(dept)) {
				employeeList.add(employee);
			}
		}
		return employeeList;
	}

}
