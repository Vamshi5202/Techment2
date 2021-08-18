package com.techment.util;

import java.util.HashMap;
import java.util.Map;

import com.techment.model.Employee;

public class CollectionUtil {

	static Map<Integer, Employee>employees=new HashMap<>();
static {
	employees.put(1, new Employee(1,"john","hr",41000));
	employees.put(2, new Employee(2,"mohan","manager",31000));
	employees.put(3, new Employee(3,"murthy","ceo",21000));
	employees.put(4, new Employee(4,"dhruv","hr",11000));

}
public static Map<Integer, Employee> getEmployeeList(){
	return employees;
	
} 	
	
}
