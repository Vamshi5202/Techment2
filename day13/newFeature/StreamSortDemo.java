package com.tech.day13.newFeature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.tech.day12.newfeature.Employee;

class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getAge() == o2.getAge()) {
			return 0;
		} else if (o1.getAge() > o2.getAge()) {
			return 1;
		} else
			return -1;
	}

}

public class StreamSortDemo {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "sachin", "hr", 12300, 45));
		employees.add(new Employee(2, "ravi", "manger", 23000, 25));
		employees.add(new Employee(3, "anil", "developer", 15000, 63));
		employees.add(new Employee(4, "murthy", "hr", 25000, 54));
		employees.forEach(System.out::println);

		employees.stream().forEach(System.out::println);
		employees.stream().sorted(new AgeComparator()).forEach(System.out::println);
		System.out.println("===sorting based on age===");
		employees.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
		System.out.println("decending order by age");
		employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).forEach(System.out::println);
		System.out.println("sort by name");
		List<Employee> emp = employees.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		emp.forEach(System.out::println);

	}

}
