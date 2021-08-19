package com.tech.day12.newfeature;

import java.util.Arrays;
import java.util.List;

public class StreamDemo3 {

	public static void main(String[] args) {
      List<String>names=Arrays.asList("sachin","ravi","kumar","dhoni");
      System.out.println(names);
      names.stream().filter(name->name.contains("a")&&name.length()>5).forEach(n->System.out.println(n));
	  names.stream().filter(na->na.contains("d")).forEach(a->System.out.println(a));
	}

}
