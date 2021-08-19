package com.techment.day15.interthreadcommunications;

public class InterThraedCommunication {

	public static void main(String[] args) {
		Account account=new Account();

		Thread t1=new Thread()
		{
			public void run() {
				System.out.println("after withdraw is: "+account.withdraw(1000));
			}
			
		};
		Thread t2=new Thread()
				{
			public void run() {
				System.out.println("after deposit balance is: "+account.deposit(20000));
			}
				};
				t1.setName(null);
				t2.setName(null);
				t1.start();
				t2.start();
	}

}
