package com.tech.day13.newFeature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.tech.day12.newfeature.Employee;

public class StreamDemo5 {

	public static void main(String[] args) {
		ArrayList<Employee>employees=new ArrayList<Employee>();
		employees.add(new Employee(1,"sachin","hr",12300,45));
		employees.add(new Employee(2,"ravi","manager",23000,45));
		employees.add(new Employee(1,"anil","developer",15000,63));
		employees.add(new Employee(1,"murthy","hr",25000,54));
		employees.stream().map(e->"name"+e.getName()+e.getSalary()+"salary increased by 20%"+(e.getSalary()+e.getSalary()*0.20)).forEach(System.out::println);
		List<String> li=employees.stream().map(e->"name"+e.getName()+e.getSalary()+"salary increased by 20%"+(e.getSalary()+e.getSalary()*0.20)).collect(Collectors.toList());
		StreamDemo5 streamDemo5=new StreamDemo5();
		streamDemo5.deptWiseSumSalary(employees, "developer");

		List<Employee>empDept=streamDemo5.filterByDept(employees, "hr");

                                                                                                

	}
	void deptWiseSumSalary(ArrayList<Employee> emp,String dept) {

		Double Max = (double) emp.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getMin();
		System.out.println(Max);
	}
	List<Employee> filterByDept(ArrayList<Employee> emplist,String dept) {

		List<Employee> emp =  emplist.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.toList());
		return emplist;
	}
	double empMaxSal(ArrayList<Employee>emplist,double salary){
		double emp= emplist.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getMax();
		return emp;
	}
	double empMinSal(ArrayList<Employee>emplist,double salary){
		double emp= emplist.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getMin();
		return emp;
	}
	double empMinSalInDept(ArrayList<Employee>emplist,double salary){
		double emp= emplist.stream().filter(e->e.getDept().equals("developer")).collect(Collectors.summarizingDouble(Employee::getSalary)).getMin();
		return emp;
	}


	void DeptWiseSalary(List<Employee> emp,String dept)
	{
		//emp.stream().filter(e->e.getDept().compareToIgnoreCase(dept)).collect(Collectors.summarizingInt(Employee::getSalary));
		//.map(e->"Name : "+e.getName()+" Dept : "+e.getDept()+" Salary : "+e.getSalary()).forEach(System.out::println);
		List<Employee> emplist =  emp.stream().filter(e->e.getDept().equalsIgnoreCase(dept)).collect(Collectors.toList());
		emplist.forEach(System.out::println);
	}
	void DeptWiseSalary(List<Employee> emp)
	{
		emp.stream().sorted(Comparator.comparing(Employee::getDept)).map(e->"Name : "+e.getName()+" Dept : "+e.getDept()+" Salary : "+e.getSalary()).forEach(System.out::println);
	}
}
