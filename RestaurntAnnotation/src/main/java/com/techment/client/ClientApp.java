package com.techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techment.modal.Restaurant;


public class ClientApp {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.techment");
		context.refresh();
		Restaurant restaurant=(Restaurant) context.getBean("restaurant");
	    restaurant.displayRestaurantItems();
	
            
	

	}

}
