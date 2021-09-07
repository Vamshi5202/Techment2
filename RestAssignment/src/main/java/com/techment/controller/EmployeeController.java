package com.techment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping(value="/EmpController")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService iEmployeeService;

	/*public EmployeeController(IEmployeeService iEmployeeService) {
		super();
		this.iEmployeeService = iEmployeeService;
	}*/
	
	@PostMapping(value="/addEmployees")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		
		return new ResponseEntity<Employee>(iEmployeeService.saveEmployee(employee), HttpStatus.CREATED);
		
	}
	
	//build get all employee rest API
	@GetMapping(value="getAllEmp")
	public List<Employee> getAllEmployees(){
		return iEmployeeService.getAllEmployee();
	}
	
	//build get Employee by Id by rest API
	
	@GetMapping(value="/getEmpById/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id")  int id){
		
		return new ResponseEntity<Employee>(iEmployeeService.getEmployeeById(id), HttpStatus.OK);
	}
	//build update employee rest API
	@PutMapping(value="/upateEmp/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") int id,@RequestBody Employee employee){
		
		return new ResponseEntity<Employee>(iEmployeeService.updateEmployee(employee, id), HttpStatus.OK);
		
	}
	//build delete Employee rest API
	
	@DeleteMapping(value="/deleteEmp/{id}")
	public ResponseEntity<String>deleteEmployee(@PathVariable("id") int id){
		

		
		iEmployeeService.deleteEmployee(id);
		return new ResponseEntity<String>("Employee deleted succesfully",HttpStatus.OK);
		
	}
	//whre isa the error

}
