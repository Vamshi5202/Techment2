package com.techment.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Restaurant {
	@Autowired
	@Qualifier("tea")
	IHotDrink hotdrink;
	@Autowired
	@Qualifier("maaza")
	ISoftDrink softdrink;
	
	public void displayRestaurantItems() {
		hotdrink.drink();
		softdrink.drink();
	}
	
	

	
	
}
