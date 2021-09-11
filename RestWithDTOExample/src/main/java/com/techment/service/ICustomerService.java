package com.techment.service;

import java.util.List;

import com.techment.dto.CustomerDto;

public interface ICustomerService  {

	String addCustomer(CustomerDto customerDto);
	
	List<CustomerDto> viewAllCustomers();
	
	CustomerDto viewCustomerById(int id);	
	void  deleteCustomerById(int id);
	
	
	

}
