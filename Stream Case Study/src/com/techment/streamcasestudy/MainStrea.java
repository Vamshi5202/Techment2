package com.techment.streamcasestudy;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class MainStrea {
	

	public static void main(String[] args) {
		try {
		Department department1 = new Department(1001, "hr", 50);
		Department department2 = new Department(1002, "manager", 58);
		Department department3 = new Department(1003, "developer", 40);
		List<Department>department=new ArrayList<Department>();
		department.add(department1);
		department.add(department2);
		department.add(department3);
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee1 = new Employee(1, "murthy", "rao", "murthy@gmail.com", "9630124572",
				new SimpleDateFormat("dd/MM/yyyy").parse("12/11/2020"), "senior hr", 25000, 100, department1);
		Employee employee2 = new Employee(2, "sanju", "sangi", "sanju@gmail.com", "7630124572",
				new SimpleDateFormat("dd/MM/yyyy").parse("20/02/2019"), "manager hr", 35000, 101, department2);
		Employee employee3 = new Employee(3, "raju", "yadav", "raju@gmail.com", "8630124572",
				new SimpleDateFormat("dd/MM/yyyy").parse("23/02/2014"), "developer hr", 45000, 102, department3);
		

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		MainStrea mainStream = new MainStrea();
		mainStream.sumOfEmpSal(employees);
		mainStream.countOfEmpInDepts(employees);
		mainStream.empWithOutDept(employees);
		mainStream.deptWithHighestCountEmp(employees);
		mainStream.depWithOutEmp(employees);
		mainStream.EmpReportingToManager(employees);
		mainStream.empWithOutManager(employees);
		mainStream.hiredEmpDetails(employees);
		mainStream.seniorEmployee(employees );
		mainStream.sortAllEmp(employees,department );
		mainStream.IncreaseEmpSalary(employees);
		
		

		}
		
		catch(Exception e) {
			e.printStackTrace();
		}

	

	}

	void sumOfEmpSal(List<Employee> empList) {
		double employeeSal = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();

		System.out.println(employeeSal);
	}

	void countOfEmpInDepts(List<Employee> empList) {
		Map<Department,Long> empMap=empList.stream().collect(Collectors.groupingBy(Employee::getDeparatment,Collectors.counting()));
				

		System.out.println(empMap);
	}

	void empWithOutDept(List<Employee> empList) {
	 List<Employee>emp=empList.stream().filter(e->e.getDeparatment().getDepartmentId()==0).collect(Collectors.toList());
	System.out.println(emp);
	}
	void depWithOutEmp(List<Employee>empList) {
		empList.stream().filter(e->e.getManagerId()==0).forEach(System.out::println);
	}
	void seniorEmployee(List<Employee> empList) {
	      Date min=empList.stream().min(Comparator.comparing(Date::toEpochDay)).get();
		}
	void deptWithHighestCountEmp(List<Employee>empList) {
		Map<Department,Long> mapList=empList.stream().filter(e-> e.getDeparatment()!=null).collect(Collectors.groupingBy(Employee::getDeparatment,Collectors.counting()));
	
	for(Map.Entry<Department, Long>entry:mapList.entrySet()) {
		System.out.println("Department:"+entry.getKey().getDeparatmentNmae()+", count:"+entry.getValue());
	}
	}
	void EmpReportingToManager(List<Employee>empList) {
		
		empList.stream().forEach(e->System.out.println(e.getFirstName()+" "+e.getLastName()+"Reporting to"+e.getManagerId()));
		
	}
	void hiredEmpDetails(List<Employee>empLlist) {
		empLlist.stream().filter(e->e.getHireDate().getDay()==6).forEach(System.out::println);
	}
	void empWithOutManager(List<Employee>empList) {
		System.out.println("Employees without manager");
		empList.stream().filter(e->e.getManagerId()==0).forEach(System.out::println);
	}
	void IncreaseEmpSalary(List<Employee>empList) {
		empList.stream().map(e->"name"+e.getFirstName()+e.getSalary()+"salary increased by 15%"+(e.getSalary()+e.getSalary()*0.15)).forEach(System.out::println);
	}
	void sortAllEmp(List<Employee>empList,List<Department>deptList) {
		System.out.println("sort employees by id");
		empList.stream().sorted(Comparator.comparingInt(Employee::getEmployeeId)).forEach(System.out::println);
		System.out.println("Sort by department id");
		deptList.stream().sorted(Comparator.comparingInt(Department::getDepartmentId)).forEach(System.out::println);
		System.out.println("Sort by Employees Name");
		empList.stream().sorted(Comparator.comparing(Employee::getFirstName)).forEach(System.out::println);
		
	}
	

		
		
	}
	


