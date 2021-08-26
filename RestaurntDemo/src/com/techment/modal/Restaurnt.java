package com.techment.modal;

public class Restaurnt {

	String restaurntName;
	IHotDrink hotDrink;
	ISoftDrink softDrink;

	public String getRestaurntName() {
		return restaurntName;
	}

	public void setRestaurntName(String restaurntName) {
		this.restaurntName = restaurntName;
	}
	

	public IHotDrink getHotDrink() {
		return hotDrink;
	}

	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}

	public ISoftDrink getSoftDrink() {
		return softDrink;
	}

	public void setSoftDrink(ISoftDrink softDrink) {
		this.softDrink = softDrink;
	}

	public void displayRestairantDetails() {
		System.out.println("restaurnt name:" + restaurntName);
		hotDrink.drink();
		softDrink.drink();

	}

}
