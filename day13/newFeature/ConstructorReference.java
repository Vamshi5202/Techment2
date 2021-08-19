package com.tech.day13.newFeature;
@FunctionalInterface
interface A{
	Student getStudentDetails();
}
class Student{
	int id;
	String name;
	void display() {
		System.out.println("this is student info");
	}
}

public class ConstructorReference {

	public static void main(String[] args) {
   //using lamda multiline
		A a=()->{
			Student s=new Student();
		   return s;
		};
		//using lamda single line
		A a1=()->new Student();
	a1.getStudentDetails().display();;
	//using method reference
	A obj=Student::new;
	obj.getStudentDetails().display();
	
	}

}
