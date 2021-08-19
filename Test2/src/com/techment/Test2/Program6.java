package com.techment.Test2;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
     try {
    	 System.out.println("enter id");
    	 int id=sc.nextInt();
    	 System.out.println("enter name");
    	 String name=sc.next();
    	 System.out.println("enter age");
    	 int age=sc.nextInt();
		Person person=new Person(id, name, age);
		System.out.println(person.toString());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
     
	}

}
