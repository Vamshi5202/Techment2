package com.techment.modal;

import org.springframework.stereotype.Repository;

@Repository
public class GoodDayGreeting implements Greeting{
String greet="Have a Good Day";


	/*public GoodDayGreeting(String greeting) {
	super();
	this.greeting = greeting;
}*/
	


	public String getGreet() {
		return greet;
	}



	public void setGree(String greet) {
		this.greet = greet;
	}



	@Override
	public void greet() {
		System.out.println(greet);
	}
	

}
