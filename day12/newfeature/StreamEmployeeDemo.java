package com.tech.day12.newfeature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEmployeeDemo {

	public static void main(String[] args) {
     
	ArrayList<Employee>employees=new ArrayList<Employee>();
	employees.add(new Employee(1,"sachin","hr",12300,45));
	employees.add(new Employee(2,"ravi","manger",23000,45));
	employees.add(new Employee(1,"anil","developer",15000,63));
	employees.add(new Employee(1,"murthy","hr",25000,54));
    employees.stream().forEach(s->System.out.println());
	//to count no of employees
	Long empcount=employees.stream().count();
	System.out.println("no of employees"+empcount);
	Long Devcount=employees.stream().filter(e->e.getDept().equals("developer")).count();
	System.out.println(Devcount);

	employees.stream().filter(e->e.getDept().equals("developer")).forEach(e->System.out.println(e));
	List<Employee> emp=employees.stream().filter(e->e.getDept().equals("developer")).collect(Collectors.toList());
   System.out.println(emp);
	StreamEmployeeDemo obj=new StreamEmployeeDemo();
	List<Employee> empDepts=obj.filterByDept(employees, "hr");
	System.out.println("fetching employees using dept");
	System.out.println(empDepts);
	Long numberOfEmployee=employees.stream().collect(Collectors.counting());
	
	System.out.println("no of employee"+numberOfEmployee);
	Double totalSalary=employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();
	//Long totalsalary =employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
	System.out.println("total salary"+totalSalary);
	Double maxSalary=employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getMax();

	}
	List<Employee> filterByDept(ArrayList<Employee> emplist,String dept) {
		
		List<Employee> emp =  emplist.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.toList());
		return emplist;
	}
	

}
