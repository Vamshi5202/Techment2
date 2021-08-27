package com.techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techment.modal.GoodDayGreeting;
import com.techment.modal.GreetService;


public class CllientApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.techment");
		context.refresh();
		GreetService dayGreeting=(GreetService) context.getBean("greetService");
		dayGreeting.printGreet();
		
		
	}

}
