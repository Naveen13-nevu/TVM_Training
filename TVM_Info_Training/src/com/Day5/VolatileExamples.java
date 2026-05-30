package com.Day5;

class Shared {

    volatile boolean flag = false;
}


public class VolatileExamples {

	public static void main(String[] args) {
		 Shared s = new Shared();

	        Thread t1 = new Thread(() -> {

	            try {
	                Thread.sleep(2000);
	            }
	            catch(Exception e) {}

	            s.flag = true;

	            System.out.println("Flag updated");
	        });

	        Thread t2 = new Thread(() -> {

	            while(!s.flag) {
	            }

	            System.out.println("Thread detected change");
	        });

	        t1.start();
	        t2.start();
		

	}

}
