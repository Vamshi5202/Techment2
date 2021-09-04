package com.techment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Employee;
import com.techment.service.IEmployeeService;

@RestController
@RequestMapping(value="/empController")
public class EmployeeControllerWithDb {
	
	@Autowired
	IEmployeeService iEmployeeService;
	
	@GetMapping(value="/viewAllEmployee")
	public List<Employee> viewAllEmployee(){
		
		return iEmployeeService.viewAllEmployee();
		
	}
	
	@PostMapping(value="/addNewEmployee")
	public String addNewEmployee(@RequestBody Employee employee) {
		
		return iEmployeeService.addEmployee(employee);
	}
	@GetMapping(value="/viewEmployeeByID/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		
		return iEmployeeService.viewEmployeeById(id);
	}
	@DeleteMapping(value="/deleteEmployeeById/{id}")
	
	public void deleteEmployeeByID(@PathVariable int id) {
		iEmployeeService.deleteEmployeeById(id);
	}
	@PutMapping(value="/updateEmployee")
	
	public void updateEmployeeBy(@RequestBody Employee employee) {
	  iEmployeeService.updateEmployee(employee);
		
	}

}
