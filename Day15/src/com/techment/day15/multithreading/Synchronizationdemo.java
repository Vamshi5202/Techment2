package com.techment.day15.multithreading;

class Water {
	
	 public void drinkWater(int time) {
		 synchronized (this) {
			
		
		for (int i = 1; i <= time; i++) {
			System.out.println(Thread.currentThread().getName() + " Drinking water " + i + " times");

		}
		 }
		for (int i = 1; i <= time; i++) {
			System.out.println(Thread.currentThread().getName() + " Eating  " + i + " times");

		}
	}
}

class WaterBottle implements Runnable {
	Water water = new Water();

	@Override
	public void run() {
		water.drinkWater(5);

	}

}

public class Synchronizationdemo {

	public static void main(String[] args) {

		WaterBottle waterBottle = new WaterBottle();
		Thread person1 = new Thread(waterBottle);
		Thread person2 = new Thread(waterBottle);
		Thread person3 = new Thread(waterBottle);

		person1.start();
		person2.start();
		person3.start();

		person1.setName("Amit");
		person2.setName("Parul");
		person3.setName("Murthy");

	}

}
