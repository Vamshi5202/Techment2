package com.techment.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dao.ICustomerDao;
import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;
import com.techment.exception.IDNotFoundException;
import com.techment.service.ICustomerService;

@RestController
@RequestMapping(value="/customerController")
public class CustomerController {
	
	@Autowired
	ICustomerService iCustomerService;
	
	@GetMapping(value="/viewAllCustomers")
	public List<CustomerDto> viewCustomer(){
		return iCustomerService.viewAllCustomers();
	}
	
	@PostMapping(value="/addNewCustomer")
	public String addNewCustomer(@RequestBody CustomerDto customer) {
		iCustomerService.addCustomer(customer);
		return "insertion done";
	}
	
	@GetMapping(value="/customerById/{id}")
	public CustomerDto getById(@PathVariable int id)
	{
		try {
			CustomerDto customer = iCustomerService.viewCustomerById(id);
			return customer;
		} catch (NoSuchElementException e) {
			throw new IDNotFoundException("No Such Id Details Present");
		}
		
		
		
	}
	
	
	@DeleteMapping
	public void deleteById(@PathVariable int id) {
		try {
			iCustomerService.deleteCustomerById(id);
			//return "Course Deleted";

		} catch (Exception e) {
		
			throw new IDNotFoundException("No Such Id Details Present");
		}
		
	}
	
	@ExceptionHandler(value=IDNotFoundException.class)
	public ResponseEntity<Object> myException(IDNotFoundException exception){
		
	return new ResponseEntity<Object>(exception.getMsg(), HttpStatus.NOT_FOUND);
	
	}

}
