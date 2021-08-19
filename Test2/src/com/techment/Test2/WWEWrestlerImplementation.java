package com.techment.Test2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WWEWrestlerImplementation {

	public static void main(String[] args) {

		List<WWE> wrestlers = new ArrayList<WWE>();
		wrestlers.add(new WWE("murthy", "naidu", 230));
		wrestlers.add(new WWE("sanju", "samson", 130));
		wrestlers.add(new WWE("raju", "yadav", 300));
		
		Long no=wrestlers.stream().count();
		System.out.println("Numbers of wrestlers: "+no);
		Long sum=wrestlers.stream().filter(w->w.getWeight()>200).collect(Collectors.summarizingInt(WWE::getWeight)).getSum();
		System.out.println("Sum of weights of all wrestlers:"+sum);
		WWEWrestlerImplementation wwe=new WWEWrestlerImplementation();
		System.out.println("firstNmae of all wrestlers");
		wwe.printFirstName(wrestlers);
		System.out.println("minimum weight of wrestler");
		wwe.minWeight(wrestlers);



	}
	void  printFirstName(List<WWE>list){
		list.stream().forEach(w->System.out.println(w.getFirstName()));
		
	}
	void minWeight(List<WWE>list) {
		int  minWeight=list.stream().collect(Collectors.summarizingInt(WWE::getWeight)).getMin();
		System.out.println(minWeight);
	
	}


}
