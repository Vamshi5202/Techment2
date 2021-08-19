package com.tech.day12.newfeature;
@FunctionalInterface
interface Bank1{
	void rateOfInterest();
	default void display() {
		System.out.println("his is default method");
		
	}
	static void loan() {
		System.out.println("apply for loan");
	}
}

public class FunctionInterfaceDemo {

	public static void main(String[] args) {

	}

}
