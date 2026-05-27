package com.day2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Execute {

	public static void main(String[] args) {
		
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		
		for(int i=1;i<=10;i++) {
			int taskId =i;
			
			service.submit(()->{
				System.out.println("Task "+ taskId+" handled by "+ Thread.currentThread().getName());
				
			});
			
			try {
				Thread.sleep(2000);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("TaskId " + taskId+"completed" );
		}
		service.shutdown();
	}
	
}
