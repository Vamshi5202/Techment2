package com.techment.day15.interthreadcommunications;

public class Account {
	int balance = 0;

	synchronized public int withdraw(int amount) {

		if (amount > balance) {

			try {
				System.out.println("no balance waiting to deposit");
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "going to withdraw");
		balance = amount;/// balance=balance-amount;
		return balance;
	}

	synchronized public int deposit(int amount) {
		System.out.println(Thread.currentThread().getName() + " going to deposit");
		balance+=amount;
		return balance;
	}
}
