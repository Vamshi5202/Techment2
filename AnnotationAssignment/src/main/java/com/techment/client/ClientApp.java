package com.techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techment.modal.Employee;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.techment");
	context.refresh();
	Employee employee=(Employee) context.getBean("employee");
	employee.EmployeeDetails();
	
	}

}
