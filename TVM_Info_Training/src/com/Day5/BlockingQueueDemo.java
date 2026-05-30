package com.Day5;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;



public class BlockingQueueDemo {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
		Thread Producer = new Thread(
				()->{
					try {
						queue.offer(1);
						queue.offer(2);
						queue.offer(3);
						System.out.println("Produced Items");
						
					}
					catch(Exception e ) {
						e.printStackTrace();
					}
				}
				);
		
		Thread Consumer = new Thread(
				()->{
					try {
						Thread.sleep(2000);
						System.out.println(queue.take());
						System.out.println(queue.take());
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
				);

		Producer.start();
		Consumer.start();
		
	}

}
