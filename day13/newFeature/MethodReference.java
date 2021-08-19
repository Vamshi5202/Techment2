package com.tech.day13.newFeature;

interface Calculation{
	void display();
}
class Hello{
	void message(){
		System.out.println("today is holiday");
	}
}

public class MethodReference {

	public static void main(String[] args) {
        //using lamda expression
		Calculation calculation=()->System.out.println("this is disply method");
		calculation.display();
	   
		//method reference to non static method
		Hello hello=new Hello();
	   Calculation calculation2=hello::message;
	calculation2.display();
	}

}
