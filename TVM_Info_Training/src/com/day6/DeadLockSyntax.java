package com.day6;

public class DeadLockSyntax {
	
	static final Object lock1 = new Object();
	static final Object lock2 = new Object();
	

	public static void main(String[] args) {

		
		Thread t1 = new Thread(
				()->{
					synchronized(lock1) {
						System.out.println("Thread 1 locked lock 1");
						
						try {
							Thread.sleep(1000);
						}
						catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
					synchronized(lock2) {
						System.out.println("Thread 1 locked lock 2 ");
					}
				}
				);
		
		Thread t2 = new Thread(
				()->{
					
					synchronized(lock2) {
						System.out.println("Thread 2 locked lock 2 ");
						
						try {
							Thread.sleep(1000);
						}
						catch(InterruptedException e) {
							e.printStackTrace();
						}
						synchronized(lock1) {
							System.out.println("Thread 2 locked lock 2 ");
						}
					}				
					
				}
				);
		
		t1.start();
		t2.start();

	}

}
