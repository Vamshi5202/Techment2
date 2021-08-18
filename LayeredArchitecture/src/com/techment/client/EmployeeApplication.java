package com.techment.client;

import java.util.List;
import java.util.Scanner;

import com.techment.model.Employee;
import com.techment.service.EmployeeServiceImpl;
import com.techment.service.IEmployeeService;

public class EmployeeApplication {
	

	public static void main(String[] args) {
		IEmployeeService service = new EmployeeServiceImpl();
		System.out.println("=====Employee Application====");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id to fetch employee");
		int id = sc.nextInt();
		
		Employee employee = service.getEmployeeById(id);
		System.out.println(employee);
		
		System.out.println("enter dept to fetch employee");
		String dept = sc.next();
		
		List<Employee> employees = service.getEmployeeByDept(dept);
		System.out.println(employees);
	}

}


