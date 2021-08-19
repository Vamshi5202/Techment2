package com.techment.day15.multithreading;


class Info implements Runnable{

	@Override
	public void run() {

		System.out.println("my task");
	}
	
}

public class CreatingThreadByImplementingRunnable {

	public static void main(String[] args) {
		Info info=new Info();
		Thread thread=new Thread(info);
		thread.start();
		

	}

}
