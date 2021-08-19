package com.tech.day12.newfeature;

import java.util.ArrayList;

public class StramDemo2 {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			numbers.add(i);
		}
		System.out.println("numbers " + numbers);
		System.out.println("printing only even numbers");
		numbers.stream().filter(num -> num % 2 == 0).forEach(s -> System.out.println(s));
		System.out.println("using map");
		numbers.stream().map(n -> "after adding 100: " + (n + 100)).forEach(s -> System.out.println(s));

		numbers.stream().limit(2).forEach(s -> System.out.println(s));
		numbers.stream().skip(4).forEach(s -> System.out.println(s));

		Long size = numbers.stream().count();

		System.out.println("no of elements" + size);

	}

}
