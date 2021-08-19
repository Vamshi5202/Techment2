package com.tech.day12.newfeature;

interface Calculation1 {
	int add(int a, int b);
}

public class LamdaDemo3 {

	public static void main(String[] args) {

		Calculation1 calc = (a, b) -> a + b;
		Calculation1 calc1 = (a, b) -> {
			if (a > b)
				return a;
			return b;

		};
		System.out.println(calc.add(2, 3));
		System.out.println("lragest of two numbers: " + calc1.add(2, 3));
	}

}
