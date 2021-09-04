package com.techment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Employee;

@RestController
@RequestMapping(value="/employeeController")
public class EmployeeController {
	
	
	ArrayList<Employee> employees=new ArrayList<Employee>();

	public EmployeeController() {
		super();
		employees.add(new Employee(1,"ragu","hr"));
		employees.add(new Employee(2,"mamu","developer"));

		
		
	}

	
	
	
	@GetMapping(value="/showMessage")
	public String display() 
	{
		return "this is my first Demo";
	}
	@GetMapping(value="/getAllEmployees")
	public List<Employee> showEmployee() 
	{
		//employees=new ArrayList<Employee>();
		/*employees.add(new Employee(1,"ragu","hr"));
		employees.add(new Employee(2,"mamu","developer"));

		*/
		return employees;
	}
	
	@PostMapping(value="addNewEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		
		employees.add(employee);
		return "employee added";
	}

}
