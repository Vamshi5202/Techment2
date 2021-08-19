package com.techment.day15.multithreading;

class Message extends Thread{
	public void run() {
		System.out.println("my task");
	}
}

public class CreatingThreadByExtendThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Message message=new Message();
		message.start();
	}

}
