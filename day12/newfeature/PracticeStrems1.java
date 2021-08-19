package com.tech.day12.newfeature;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PracticeStrems1 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("murthy");
		names.add("sanju");
		names.add("banu");
		names.add("raju");
		names.add("raju");

		System.out.println("name contains r");
		names.stream().filter(name -> name.contains("r")).forEach(e -> System.out.println(e));
		// to print distict values
		System.out.println("distinct names");
		names.stream().distinct().forEach(e -> System.out.println(e));

		System.out.println("==limit 2==");
		names.stream().limit(2).forEach(e -> System.out.println(e));
		System.out.println("===skip first 3 elements===");
		names.stream().skip(3).forEach(e -> System.out.println(e));
		System.out.println("==using map to print the  length of names==");
       names.stream().map(e-> e.length()).forEach(e-> System.out.println(e));
	    System.out.println("==sorting===");
	    names.stream().sorted().forEach(e-> System.out.println(e));
	Long bignames=names.stream().filter(e->e.length()>5).count();
	    System.out.println(bignames);
	    List<String> firstNames=names.stream().limit(3).collect(Collectors.toList());
	     System.out.println(firstNames);
	if(names.stream().anyMatch(e->e.length()==5)) {
		System.out.println("name with lenth 5 present");
	}
	if(names.stream().allMatch(e->e.length()==5)) {
		System.out.println("name with lenth 5 present");
	}
	Optional<String> firstname=names.stream().findFirst();
	  System.out.println(firstname);
	}

}
