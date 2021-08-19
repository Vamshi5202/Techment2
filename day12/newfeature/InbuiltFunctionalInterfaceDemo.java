package com.tech.day12.newfeature;

import java.util.function.Function;
import java.util.function.Predicate;

public class InbuiltFunctionalInterfaceDemo {

	public static void main(String[] args) {
    Predicate<Integer>predicate=(num)->num>18;
	System.out.println(predicate.test(20));
	Predicate<String>strpredicate=(name)->name.contains("vamshi");
	System.out.println(strpredicate.test("vamshi"));

	Function<Integer,Integer>function1=(num1)->num1;
	Function<Integer,String>function2=(num1)->"value of="+num1;
	Function<String,Integer>function3=(name)->name.length();

	
	System.out.println(function1.apply(2));
	System.out.println(function2.apply(6));
	System.out.println(function3.apply("vamshi"));

}
}