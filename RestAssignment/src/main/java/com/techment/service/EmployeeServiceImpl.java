package com.techment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.EmployeeDao;
import com.techment.entity.Employee;
import com.techment.exception.ResourceNotFoundException;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	/*
	 * public EmployeeServiceImpl(EmployeeDao employeeDao) { 
	 * super();
	 * this.employeeDao = employeeDao; 
	 * }
	 */

	@Override
	public Employee saveEmployee(Employee employee) {

		return employeeDao.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {

		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
	/*	Optional<Employee> employee = employeeDao.findById(id);

		if (employee.isPresent()) {
			return employee.get();
		} else {
			throw new ResourceNotFoundException("Employee", "id", id);
		}*/
		return employeeDao.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee", "Id", id));
	}

	@Override
	public Employee updateEmployee(Employee employee, int id) {
   Employee existingEmp=employeeDao.findById(id).orElseThrow(
		   ()-> new ResourceNotFoundException("Employee", "Id", id)
		   );
   
   existingEmp.setFirstName(employee.getFirstName());
   existingEmp.setLastName(employee.getLastName());
   existingEmp.setDept(employee.getDept());
   
   employeeDao.save(existingEmp);
  	
		return existingEmp;
	}

	@Override
	public void deleteEmployee(int id) {
		
		employeeDao.findById(id).orElseThrow(
				()->new ResourceNotFoundException("Employee", "Id", id)
				);
		
	  employeeDao.deleteById(id);
		
	}

}
