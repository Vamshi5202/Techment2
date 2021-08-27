package com.techment.modal;

import org.springframework.stereotype.Component;

@Component
public class Milk implements IHotDrink{

	public void drink() {

		System.out.println("Drink Milk");
	}

}
