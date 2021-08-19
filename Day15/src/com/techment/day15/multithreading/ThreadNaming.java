package com.techment.day15.multithreading;

class Apple extends Thread{
	public void run() {
		
		for(int i=1;i<=5;i++) {
			if(i==2) {
				
			}
		System.out.println("eat aaple"+Thread.currentThread().getName());
	}
	}
}


class Banna extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {

		System.out.println("eat banna"+Thread.currentThread().getName());
	}
}
}
public class ThreadNaming {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		Apple apple=new Apple();
		Banna banna=new Banna();
		apple.setName(" Apple Name");
		banna.setName(" Banna Name");
		apple.start();
		banna.start();
		banna.suspend();
		banna.resume();
		banna.setPriority(2);
		apple.setPriority(3);
		
	}

}
