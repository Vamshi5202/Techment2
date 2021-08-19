package com.tech.day12.newfeature;

interface Calculation{
	void add(int a,int b);
}


public class LamdaDemo2 {

	public static void main(String[] args) {
Calculation calculation=(a,b)->System.out.println("Result: "+ (a+b));
		calculation.add(2,3);
		calculation.add(8,2);

	}

}
