package com.tech.day13.newFeature;

interface LargestNumber {
	void largerst(int a, int b, int c);
}

class CalculationUtil {
	void findLargest(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("largest number" + a);
		} else if (b > a && b > c) {
			System.out.println("largest number" + b);
		} else {
			System.out.println("largest number" + c);
		}

	}
}

public class MethodReference4 {

	public static void main(String[] args) {

		LargestNumber largest = (a, b, c) -> {
			if (a > b && a > c) {
				System.out.println("largest number" + a);
			} else if (b > a && b > c) {
				System.out.println("largest number" + b);
			} else {
				System.out.println("largest number" + c);
			}
		};
		CalculationUtil calculationUtil = new CalculationUtil();
		LargestNumber number = calculationUtil::findLargest;
		number.largerst(3, 6, 4);
	}

}
