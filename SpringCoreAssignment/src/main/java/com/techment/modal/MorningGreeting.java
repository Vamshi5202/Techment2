package com.techment.modal;

import org.springframework.stereotype.Repository;

@Repository
public class MorningGreeting implements Greeting {
String greet="Good Morning";

	/*public MorningGreeting(String greeting) {
	super();
	this.greeting = greeting;
}*/
	

	public String getGreet() {
		return greet;
	}


	public void setGreet(String greet) {
		this.greet = greet;
	}


	@Override
	public void greet() {

		System.out.println("");
	}

}
