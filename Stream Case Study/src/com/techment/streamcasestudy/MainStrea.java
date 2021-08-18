package com.techment.streamcasestudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStrea {

	public static void main(String[] args) {
	Department department1=new Department(1001,"hr", 50);
	Department department2=new Department(1002,"manager", 58);
	Department department3=new Department(1003,"developer", 40);
	List<Employee>employees=new ArrayList<Employee>();
	Employee employee1=new Employee(1, "murthy", "rao", "murthy@gmail.com", "9630124572", null,"senior hr", 25000, 100, department1);
	Employee employee2=new Employee(2, "sanju", "sangi", "sanju@gmail.com", "7630124572", null,"manager hr", 35000, 101, department2);
	Employee employee3=new Employee(3, "raju", "yadav", "raju@gmail.com", "8630124572", null,"developer hr", 45000, 102, department3);


		
		
	}
	

}
